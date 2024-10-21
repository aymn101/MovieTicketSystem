/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticketsystem;

import java.sql.Time;

/**
 *
 * @author aliah
 */
public class Movie {

    //private Movie movie;
    private String movieID;
    private String movieName;
    private String movieGenre;
    private int movieQuantity;
    private double moviePrice;
    private String moviePG;
    private String movieShowtimes;

    public String getMovieID() {
        return movieID;
    }
   
    public String getMovieName() {
        return movieName;
    }

    public int getMovieQuantity() {
        return movieQuantity;
    }

    public double getMoviePrice() {
        return moviePrice;
    }

    public String getMovieShowtimes() {
        return movieShowtimes;
    }

    public void setMovieID(String movieID) {
        this.movieID = movieID;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMoviePrice(double moviePrice) {
        this.moviePrice = moviePrice;
    }

    public void setMovieQuantity(int movieQuantity) {
        this.movieQuantity = movieQuantity;
    }

    public void setMovieShowtimes(String movieShowtimes) {
        this.movieShowtimes = movieShowtimes;
    }

    public double MoviePrice() {
        double totalMoviePayment = 0.00;

        if ("1".equals(getMovieName())) {
            totalMoviePayment = 21.00;
        } else if ("2".equals(getMovieName())){
            totalMoviePayment = 24.00;
        } else if ("3".equals(getMovieName())){
            totalMoviePayment = 22.00;
        } else if ("4".equals(getMovieName())){
            totalMoviePayment = 20.00;
        }
        return totalMoviePayment;
    }
    
    public double totalMoviePrice() {
        double totalMoviePrice = 0.00;

        totalMoviePrice = MoviePrice();
        return totalMoviePrice;
    }
}
