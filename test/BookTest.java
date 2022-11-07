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
 * @author Beeroo
 */
public class BookTest {
    
    public BookTest() {
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
     * Test of setCopies method, of class Book.
     */
    @Test
    public void testSetCopies() {
        System.out.println("setCopies");
        int copies = 0;
        Book instance = new Book(1471156265, "it ends with us", "Colleen Hoover" , "romance novel" , 0);
        instance.setCopies(copies);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getISBN method, of class Book.
     */
    @Test
    public void testGetISBN() {
        System.out.println("getISBN");
        Book instance = new Book(1471156265, "it ends with us", "Colleen Hoover" , "romance novel" , 0);
        int expResult = 1471156265;
        int result = instance.getISBN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getTitle method, of class Book.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Book instance = new Book(1471156265, "it ends with us", "Colleen Hoover" , "romance novel" , 0);
        String expResult = "it ends with us";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAuthor method, of class Book.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        Book instance = new Book(1471156265, "it ends with us", "Colleen Hoover" , "romance novel" , 0);
        String expResult = "Colleen Hoover";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getClassfication method, of class Book.
     */
    @Test
    public void testGetClassfication() {
        System.out.println("getClassfication");
        Book instance = new Book(1471156265, "it ends with us", "Colleen Hoover" , "romance novel" , 0);
        String expResult = "romance novel";
        String result = instance.getClassfication();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getCopies method, of class Book.
     */
    @Test
    public void testGetCopies() {
        System.out.println("getCopies");
        Book instance = new Book(1471156265, "it ends with us", "Colleen Hoover" , "romance novel" , 0);
        int expResult = 0;
        int result = instance.getCopies();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of showDetail method, of class Book.
     */
    @Test
    public void testShowDetail() {
        System.out.println("showDetail");
        Book instance = new Book(1471156265, "it ends with us", "Colleen Hoover" , "romance novel" , 0);
        String expResult = "Book{" + "ISBN=" + 1471156265 + ", title=" + "it ends with us" + ", author=" + "Colleen Hoover" + ", classfication=" + "romance novel" + '}';
        String result = instance.showDetail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of isAvailable method, of class Book.
     */
    @Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        Book instance = new Book(1471156265, "it ends with us", "Colleen Hoover" , "romance novel" , 0);
        boolean expResult = false;
        boolean result = instance.isAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }
    
}
