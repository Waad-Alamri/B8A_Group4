/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author suma4
 */
public class BorrowingTest {
    
    public BorrowingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of borrowing method, of class Borrowing.
     */
    @Test
    // if the borrowing successfully
    public void testBorrowing_1() {
        System.out.println("borrowing");
        Book chosenBook = new Book(1612680194, "Rich_Dad_Poor_Dad", "Robert_Kiyosaki", "Business_and_Management", 3);
        Customer currentlyCustomer = new Customer("maha", "silver", 4);
        Borrowing.borrowing(chosenBook, currentlyCustomer);
        int result = currentlyCustomer.getNum_currentlyBorrowedBooks();
        int expResult = 5;
        assertEquals(expResult, result, 0.0);
    }
    
    
    @Test
    // if the borrowing rejected due to exceeded the max
    public void testBorrowing_2() {
        System.out.println("borrowing");
        Book chosenBook = new Book(1612680194, "Rich_Dad_Poor_Dad", "Robert_Kiyosaki", "Business_and_Management", 3);
        Customer currentlyCustomer = new Customer("maha", "silver", 5);
        Borrowing.borrowing(chosenBook, currentlyCustomer);
    }
    
    // if the book not available
    @Test
    public void testBorrowing_3() {
        System.out.println("borrowing");
        Book chosenBook = new Book(1471156265, "It_Ends_With_Us", "Colleen_Hoover", "romance_novel", 0);
        Customer currentlyCustomer = new Customer("maha", "silver", 4);
        Borrowing.borrowing(chosenBook, currentlyCustomer);
    }

    /**
     * Test of borrowing method, of class Borrowing.
     */
    @Test
    public void testBorrowing() {
        System.out.println("borrowing");
        Book chosenBook = null;
        Customer currentlyCustomer = null;
        Borrowing.borrowing(chosenBook, currentlyCustomer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
