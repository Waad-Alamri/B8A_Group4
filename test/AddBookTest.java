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
 * @author TOSHIBA
 */
public class AddBookTest {
    
    public AddBookTest() {
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
     * Test of storeBooksWithNewBook method, of class AddBook.
     */
    @Test
    public void testStoreBooksWithNewBook() throws Exception {
        System.out.println("storeBooksWithNewBook");
        Book newBook = new Book(1234567890, "blood of elves", "andrzej sapkosvki", "fantasy", 8);
        AddBook instance = new AddBook();
        instance.storeBooksWithNewBook(newBook);
        String expResult = AddBook.updatedBooksList.get(AddBook.updatedBooksList.size()-1).getTitle();
        assertEquals(newBook.getTitle(),expResult); 
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
