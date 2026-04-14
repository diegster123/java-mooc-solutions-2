

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Literacy implements Comparable<Literacy> {

    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double literacy;

    public Literacy(String theme, String ageGroup, String gender, String country, int year, double literacy) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacy = literacy;
    }

    public String getTheme() {
        return theme;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public double getLiteracy() {
        return literacy;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.literacy;
    }

    @Override
    public int compareTo(Literacy other) {
        return Double.compare(this.literacy, other.literacy);
    }

}
