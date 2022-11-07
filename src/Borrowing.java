
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suma4
 */
public class Borrowing {
    public static int borrowing(Book chosenBook, Customer currentlyCustomer) {
        
        // first, check if the book is available
        if (chosenBook.isAvailable()) {
            // the book is available
            // so check if the customer is not exceed the max based membership
            if (currentlyCustomer.isExceedMax()) {
                // customer is within the max
                // the book has borrowed, so decrease the copies of book
                int numOfCopies = chosenBook.getCopies();
                chosenBook.setCopies(numOfCopies - 1);
                // set the customer borrowed books number, by increase one
                currentlyCustomer.setNum_currentlyBorrowedBooks(currentlyCustomer.getNum_currentlyBorrowedBooks() + 1);
                // add to borrowed book 
                Login.currentlyCustomer.setBorrowedBooks(chosenBook);
                // display window of the available times to select the borrowing period
                availableTimes a = new availableTimes();
                a.setVisible(true);
                return 1;
            }// if execeed, reject 
            else {
                JOptionPane.showMessageDialog(null, currentlyCustomer.getCustomer_name()
                        + ", You are execeed the max number of borrowed books"
                        + "\n You have now " + currentlyCustomer.getNum_currentlyBorrowedBooks()
                        + " borrowed books");
                return -1;
            }
            // if book not available, display error message
        } else {
            JOptionPane.showMessageDialog(null, "This book is not currently available");
            return 0;
        }
       
    }
}
