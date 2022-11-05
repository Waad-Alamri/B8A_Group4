


//import lab1_cpit251.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User {
    
    private Membership membership;
    private ArrayList<Book> cart = new ArrayList<Book>();
    
    public Customer(int user_id, String user_name, String password, int phone, String email) {
        super();
    }

    public Customer() {
    }
    
    public void search() {
        
        Search s = new Search();
        s.setVisible(true);
    }
    
}
