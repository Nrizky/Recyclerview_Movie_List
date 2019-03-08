package com.example.aplikasidaftarfilm.Model;

public class MovieModel {
    String movieTitle;
    int moviePoster;
    String Overview;

    public MovieModel(String movieName, int moviePict, String overview) {
        this.movieTitle = movieName;
        this.moviePoster = moviePict;
        this.Overview = overview;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public int getMoviePoster() {
        return moviePoster;
    }

    public String getOverview() {
        return Overview;
    }

}