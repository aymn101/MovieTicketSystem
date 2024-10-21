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
public class Membership extends Customer{
    private String memberID;
    private int memberType;

    public Membership(String custID, String custName, String custEmail, String custPhoneNo, String memberID, int memberType) {
        super(custID, custName, custEmail, custPhoneNo);
        this.memberID = memberID;
        this.memberType = memberType;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setMemberType(int memberType) {
        this.memberType = memberType;
    }

    public String getMemberID() {
        return memberID;
    }

    public int getMemberType() {
        return memberType;
    }

    public double specialDiscount() {
        double discount;
        if ("silver".equals(getMemberType())) {
            discount = 0.15 * (getMovie().totalMoviePrice() + getFood().totalFoodPrice());
        } else if ("gold".equals(getMemberType())) {
            discount = 0.25 * (getMovie().totalMoviePrice() + getFood().totalFoodPrice());
        } else {
            discount = 0.50 * (getMovie().totalMoviePrice() + getFood().totalFoodPrice());
        }
        return discount;
    }

    @Override
    public double totalPayment() {
        double totalPayment = (getMovie().totalMoviePrice() + getFood().totalFoodPrice()) - specialDiscount();
        return totalPayment;
    }
}
