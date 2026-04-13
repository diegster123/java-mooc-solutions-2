
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {
        String file = "literacy.csv";
        List<Literacy> list = read(file);
        Collections.sort(list);
        System.out.println(printLines(list));

    }

    public static List<Literacy> read(String file) {
        List<Literacy> list = new ArrayList<>();
        try {
            Files.lines(Paths.get(file)).map(line -> line.split(","))
                    .filter(line -> line.length >= 6)
                    .map(parts -> new Literacy(
                            parts[0], 
                            parts[1], 
                            parts[2].replace("(%)", "").trim(), 
                            parts[3], 
                            Integer.valueOf(parts[4]), 
                            Double.valueOf(parts[5])))
                    .forEach(line -> list.add(line));
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
          
        return list;
    }
    
    public static String printLines(List<Literacy> list) {
//        String lines = "";
//        for (Literacy line : list) {
//            lines += line + "\n";
//        }
//        return lines;
        return list.stream()
                .map(Literacy::toString)
                .reduce("", (a, b) -> a + b + "\n");
        
    }

}
