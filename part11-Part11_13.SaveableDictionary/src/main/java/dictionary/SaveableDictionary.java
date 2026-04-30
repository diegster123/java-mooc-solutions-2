/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Admin
 */
public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
    }

    public void add(String words, String translation) {
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        return this.dictionary.get(word);
    }

    public void delete(String word) {
        String translation = translate(word);
        this.dictionary.remove(word);
        this.dictionary.remove(translation);
    }

    public boolean load() {
        try ( Scanner scanner = new Scanner(Paths.get(this.file))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");
                this.dictionary.putIfAbsent(parts[0], parts[1]);
                this.dictionary.putIfAbsent(parts[1], parts[0]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("File not found" + e.getMessage());
        }
        return false;
    }

    public boolean save() {
        try ( FileWriter fileWriter = new FileWriter(this.file)) {
            Set<String> saved = new HashSet<>();
            for (Map.Entry<String, String> entry : this.dictionary.entrySet()) {
                if (!saved.contains(entry.getKey()) && !saved.contains(entry.getValue())) {
                    fileWriter.write(entry.getKey() + ":" + entry.getValue() + "\n");
                    saved.add(entry.getKey());
                    saved.add(entry.getValue());
                }
            }
            return true;
        } catch (Exception e) {
            System.out.println("File not saved" + e.getMessage());
        }
        return false;
    }
}
