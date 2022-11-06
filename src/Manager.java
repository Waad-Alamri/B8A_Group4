import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import javax.crypto.ExemptionMechanism;

public class Manager extends User {
    
    private int ManagerId;
    private String ManagerName;
    
    public Manager(int user_id, String user_name, String password, int phone, String email) {
        super();
    }
    
    public Manager(){
        
    }
    
    public int getManagerId(){
        return ManagerId;
    }
    
    public String getManagerName(){
        return ManagerName;
    }
    
    public Manager(int ManagerId, String ManagerName) {
        this.ManagerId = ManagerId;
        this.ManagerName = ManagerName;
    }
    
    public void GenerateReport(){
        
    }
    
    public void UpdateBooks(){
        
    }
    
    public void ViewUserProfile(){
        
    }
    
    public void AddBook() throws IOException{
        
        AddBook a = new AddBook();
        a.setVisible(true);
        
       // Book newBook = new Book(ISBN, title, author, classfication, copies);
    
       // FileWriter FW = new FileWriter("Book.txt", true);
       // FW.append(newBook.getISBN()+" "+newBook.getTitle()+" "+newBook.getAuthor()+" "+newBook.getClassfication()+" "+newBook.getCopies());
       // FW.append("hi");
    }
    
}
