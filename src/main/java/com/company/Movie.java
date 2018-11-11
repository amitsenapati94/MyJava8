package com.company;

public class Movie {

    private String name;
    private double rating;
    private boolean isStarred;

    public boolean isStarred() {
        return isStarred;
    }

    public void setStarred(boolean starred) {
        isStarred = starred;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie(String name, double v, boolean b) {


    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String toString()
    {
        return "name: "+ getName() + "rating: " +getRating();
    }

}
