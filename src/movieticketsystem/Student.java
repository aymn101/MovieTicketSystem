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
public class Student extends Customer{
    private String matricID;
    private String universityName;

    public Student(String custID, String custName, String custEmail, String custPhoneNo, Movie movie, Food food, String matricID, String universityName) {
        super(custID, custName, custEmail, custPhoneNo, movie, food);
        this.matricID = matricID;
        this.universityName = universityName;
    }

    public void setMatricID(String matricID) {
        this.matricID = matricID;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getMatricID() {
        return matricID;
    }

    public String getUniversityName() {
        return universityName;
    }

    public double specialDiscount() {
        double discount = 0.0;
        discount = 0.10 * (getMovie().totalMoviePrice() + getFood().totalFoodPrice());
        return discount;
    }

    @Override
    public double totalPayment() {
        double totalPayment = (getMovie().totalMoviePrice() + getFood().totalFoodPrice()) - specialDiscount();
        return totalPayment;
    }


}
