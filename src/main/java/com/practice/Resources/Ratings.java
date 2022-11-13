package com.practice.Resources;

public class Ratings {

    private String userId;
    private int movieId;
    private int rating;

    public String getUserId() {
        return userId;
    }

    public Ratings(String userId, int movieId, int rating) {
        this.userId = userId;
        this.movieId = movieId;
        this.rating = rating;
    }

    public Ratings() {
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
