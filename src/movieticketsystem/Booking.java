/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticketsystem;

import java.util.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

//import java.time.localTime;
/**
 *
 * @author aliah
 */
public class Booking {

    private Movie movie;
    private Food food;
    private String bookingID;
    private String movieID;
    private String bookingDate;
    private String bookingTime;
    private String bookingVenue = null;
    private String bookingHall;
    private String bookingStatus;
    private int ticketQuantity;
    //public Movie movie;

    public Booking(String bookingVenue, String bookingHall, String bookingStatus) {
        this.bookingVenue = bookingVenue;
        this.bookingHall = bookingHall;
        this.bookingStatus = bookingStatus;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public String getBookingTime() {
        return bookingTime;
    }

    public String BookingVenue() {
        String bookingVenueName;

        if ("1".equals(bookingVenue)) {
            bookingVenueName = "TGV 1";
        } else if ("2".equals(bookingVenue)) {
            bookingVenueName = "TGV 2";
        } else if ("3".equals(bookingVenue)) {
            bookingVenueName = "TGV 3";
        } else {
            bookingVenueName = "0";
        }
        return bookingVenueName;
    }

    public Movie getMovie() {
        return movie;
    }

    public String getBookingVenue() {
        return bookingVenue;
    }

    public String getBookingHall() {
        return bookingHall;
    }

    public String bookingStatus() {
        return bookingStatus;
    }

    public int getTicketQuantity() {
        return ticketQuantity;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public void setBookingVenue(String bookingVenue) {
        this.bookingVenue = bookingVenue;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public void setTicketQuantity(int ticketQuantity) {
        this.ticketQuantity = ticketQuantity;
    }
}
