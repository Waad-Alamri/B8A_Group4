


//import lab1_cpit251.*;
import java.util.*;


public class Membership {
    
    private Customer customer;
    private Date issued_at;
    private String membership_type;
    private double membership_price;
    private boolean activated;

    public Membership(Customer customer, Date issued_at, String membership_type, double membership_price) {
        this.customer = customer;
        this.issued_at = issued_at;
        this.membership_type = membership_type;
        this.membership_price = membership_price;
        this.activated = true;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getIssued_at() {
        return issued_at;
    }

    public String getMembership_type() {
        return membership_type;
    }

    public double getMembership_price() {
        return membership_price;
    }

    public boolean isActivated() {
        return activated;
    }
}
