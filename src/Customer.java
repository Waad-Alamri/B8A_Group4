


//import lab1_cpit251.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User {

    String customer_name;
    private String membership_type;
    private int Num_currentlyBorrowedBooks;
    
    private Membership membership;
    private ArrayList<Book> cart = new ArrayList<Book>();
    private ArrayList <Book> borrowedBooks = new ArrayList<Book>();
    private String issueDate;
    private String dueDate;
    
    public Customer(int user_id, String user_name, String password, int phone, String email) {
        super();
    }
    
     public Customer(String customer_name, String membership_type, int Num_currentlyBorrowedBooks) {
        this.customer_name = customer_name;
        this.membership_type = membership_type;
        this.Num_currentlyBorrowedBooks = Num_currentlyBorrowedBooks;
    }
     
     public String getCustomer_name() {
        return customer_name;
    }
   

    public String getMembership_type() {
        return membership_type;
    }

    public int getMax_borrowed_books() {
        if (getMembership_type().equalsIgnoreCase("golden")) {
            return 10;
        } else {
            return 5;
        }
    }
    
    public int getNum_currentlyBorrowedBooks() {
        return Num_currentlyBorrowedBooks;
    }

    public void setNum_currentlyBorrowedBooks(int Num_currentlyBorrowedBooks) {
        this.Num_currentlyBorrowedBooks = Num_currentlyBorrowedBooks;
    }
    
    public boolean isExceedMax(){
        return getMax_borrowed_books() > getNum_currentlyBorrowedBooks();
    }

    public Customer() {
    }
    
    public void search() {
        
        Search s = new Search();
        s.setVisible(true);
    }
    public void borrow() {
        
        BorrowingGUI b = new BorrowingGUI();
        b.setVisible(true);
    }
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
    
    
    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book borrowedBook) {
        
        this.borrowedBooks.add(borrowedBook);
    }
    
}
