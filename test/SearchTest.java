/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileNotFoundException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS
 */
public class SearchTest {
    
    private Search instance = new Search();
    
    public SearchTest() {
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
     * Test of main method, of class Search.
     */
    @Test (timeout = 5)
    public void testSearch() throws Exception {
        System.out.println("search");
        String book_name = "It Ends With Us";
        Book result = instance.search(book_name);
        String expResult = result.getTitle().replace("_", " ");
        assertEquals(book_name, expResult);
    }
    
    @Test(expected = NullPointerException.class)
    public void testNullPointerException() throws Exception{
        
        instance.search(null);
    }
}