/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticketsystem;

/**
 *
 * @author aliah
 */
public class Customer {

    protected String custID;
    protected String custName;
    protected String custEmail;
    protected String custPhoneNo;
    protected Movie movie;
    protected Food food;

    //for Membership
    public Customer(String custID, String custName, String custEmail, String custPhoneNo) {
        this.custID = custID;
        this.custName = custName;
        this.custEmail = custEmail;
        this.custPhoneNo = custPhoneNo;
    }

    //for Student
    public Customer(String custID, String custName, String custEmail, String custPhoneNo, Movie movie, Food food) {
        this.custID = custID;
        this.custName = custName;
        this.custEmail = custEmail;
        this.custPhoneNo = custPhoneNo;
        this.movie = movie;
        this.food = food;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getCustID() {
        return custID;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public String getCustPhoneNo() {
        return custPhoneNo;
    }

    public Movie getMovie() {
        return movie;
    }
    
    public Food getFood() {
        return food;
    }

    public double totalPayment() {

        double price = 0.0;
        double totalPayment = getMovie().totalMoviePrice() + getFood().totalFoodPrice();

        return totalPayment;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public void setCustPhoneNo(String custPhoneNo) {
        this.custPhoneNo = custPhoneNo;
    }

}
