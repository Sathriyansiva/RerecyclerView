package com.example.venusankaran.rerecyclerview;

/**
 * Created by venu sankaran on 10/20/2016.
 */

public class Movie {
    private String title, genre, year,information;
    private int image;
    public Movie() {
        }
    public Movie(String title, String genre, String year, int image,String information) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.image = image;
        this.information = information;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
