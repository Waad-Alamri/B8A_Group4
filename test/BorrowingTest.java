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
    // borrowing rejected due to custoomer exceeded the max, the method will return -1
    public void testBorrowing_2() {
        System.out.println("borrowing rejected");
        Book chosenBook = new Book(1612680194, "Rich_Dad_Poor_Dad", "Robert_Kiyosaki", "Business_and_Management", 3);
        Customer currentlyCustomer = new Customer("maha", "silver", 5);
        int result = Borrowing.borrowing(chosenBook, currentlyCustomer);
        int expResult = -1;
        assertEquals(expResult, result);
    }
    
    // if the book not available, the method will return 0
    @Test
    public void testBorrowing_3() {
        System.out.println("book not available");
        Book chosenBook = new Book(1471156265, "It_Ends_With_Us", "Colleen_Hoover", "romance_novel", 0);
        Customer currentlyCustomer = new Customer("maha", "silver", 4);
        int result = Borrowing.borrowing(chosenBook, currentlyCustomer);
        int expResult = 0;
        assertEquals(expResult, result);
    }

}
