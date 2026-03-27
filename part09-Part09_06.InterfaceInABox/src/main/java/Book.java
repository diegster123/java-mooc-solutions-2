/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Book implements Packable{
    private double weight;
    private String author;
    private String bookName;
    
    public Book(String author, String book, double weight) {
        this.author = author;
        this.bookName = book;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public String getBook() {
        return this.bookName;
    }
    
    @Override
    public String toString() {
        return this.author + ": " + this.bookName;
    }
}
