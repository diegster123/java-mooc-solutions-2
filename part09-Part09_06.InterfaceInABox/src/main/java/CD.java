/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class CD implements Packable{
    private String artist;
    private String cdName;
    private int publicationYear;
    public double weight;
    
    public CD(String artist, String cd, int publicationYear) {
        this.artist = artist;
        this.cdName = cd;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return this.weight;
    }
    
    public String getArtist() {
        return this.artist;
    }
    
    public String getCD() {
        return this.cdName;
    }
    
    public int getPublicationYear() {
        return this.publicationYear;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.cdName + " (" + this.publicationYear + ") ";
    }
}
