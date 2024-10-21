/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticketsystem;

/**
 *
 * @author Aiman
 */
public class Snacks {

    private String SnacksID;
    private AddOns[] addon;
    private String ticketID;
    private int SnacksQuantity;
    private double SnacksPrice;
    private double addOnsPrice;
    private String SnacksDescription;

    //test
    private String packageList;
    private int packageQty;
    private int addOnsAmt;


    //try test test 
    public AddOns[] getAddOns() {
        return addon;
    }
    
    public void setAddOns(AddOns[] addon) {
        this.addon = addon;
    }
    
    //try test  
    public String getPackageList() {
        return packageList;
    }

    public int getPackageQty() {
        return packageQty;
    }
    
    public int getAddOnsAmt(){
        return addOnsAmt;
    }

    public void setPackageList(String packageList) {
        this.packageList = packageList;
    }

    public void setPackageQty(int packageQty) {
        this.packageQty = packageQty;
    }

    public void setAddOnsAmt(int addOnsAmt) {
        this.addOnsAmt = addOnsAmt;
    }

    //test close

    public String getSnacksID() {
        return SnacksID;
    }

    public String getTicketID() {
        return ticketID;
    }

    public int getSnacksQuantity() {
        return SnacksQuantity;
    }

    public double getSnacksPrice() {
        return SnacksPrice;
    }

    public String getSnacksDescription() {
        return SnacksDescription;
    }
    
    public double getAddOnsPrice(){
        return addOnsPrice;
    }

    public void setSnacksQuantity(int SnacksQuantity) {
        this.SnacksQuantity = SnacksQuantity;
    }

    public void setSnacksPrice(double SnacksPrice) {
        this.SnacksPrice = SnacksPrice;
    }

    public void setSnacksDescription(String SnacksDescription) {
        this.SnacksDescription = SnacksDescription;
    }
    
    public void setAddOnsPrice(double addOnsPrice){
        this.addOnsPrice = addOnsPrice; 
    }

    public double SnacksPrice() {
        double SnacksPrice = 0.0;
        
        if ("A".equals(packageList)) {
            SnacksPrice = 10.00;
        } else if ("B".equals(packageList)) {
            SnacksPrice = 10.00;
        } else if ("C".equals(packageList)) {
           SnacksPrice = 17.00;
        } else {
            SnacksPrice = 17.00;
        }
        
        return SnacksPrice;
    }
    
    public double totalSnacksPrice() {
        double totalSnacksPrice = 0.0;
        
        totalSnacksPrice = SnacksPrice() + getAddOnsPrice();
        
        return totalSnacksPrice;
    }
   
}
