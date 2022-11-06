


//import lab1_cpit251.*;
import java.util.*;


public class Membership {
    
    private String Customer_name;
    private Date issued_at;
    private String membership_type;
    private double membership_price;
    private boolean activated;
    

//    public Membership(Customer customer, Date issued_at, String membership_type, double membership_price) {
//        this.customer = customer;
//        this.issued_at = issued_at;
//        this.membership_type = membership_type;
//        this.membership_price = membership_price;
//        this.activated = true;
//    }
     public Membership(String Customer_name  ,String membership_type, double membership_price, boolean activated) {
        
        this.Customer_name = Customer_name;
        this.membership_type = membership_type;
        this.membership_price = membership_price;
        this.activated = true;
    }


    public Date getIssued_at() {
        return issued_at;
    }
    
    public String getCustomer_name(){
        return Customer_name;
    }

    public String getMembership_type() {
        return membership_type;
    }

    public double getMembership_price() {
        return membership_price;
    }
    
    public void setMembership_price(double membership_price){
        this.membership_price = membership_price;
    }

    public boolean isActivated() {
        return activated;
    }
}
