/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author reemansabir
 */
public class MembershipTest {

    public MembershipTest() {
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
     * Test of getCustomer method, of class Membership.
     */
    @Test
    public void testGetCustomer() {
        
        Membership instance = new Membership("maha", "selver", 86, true);
        String expResult = "maha";
       // String result = instance.getMembership_type();
        String result = instance.getCustomer_name();
        assertEquals(expResult, result);

        System.out.println("getCustomer name: " + result);
    }

    /**
     * Test of getMembership_type method, of class Membership.
     */
    @Test
    public void testGetMembership_type() {
        
        Membership instance = new Membership("maha", "selver", 86, true);
        String expResult = "selver";
        String result = instance.getMembership_type();
        assertEquals(expResult, result);

        System.out.println("getMembership_type: " + result);
    }

    /**
     * Test of getMembership_price method, of class Membership.
     */
    @Test
    public void testGetMembership_price() {
        
        Membership instance = new Membership("maha", "selver", 60, true);
        double expResult = 60;
        double result = instance.getMembership_price();
        assertEquals(expResult, result, 0.5);

        System.out.println("getMembership_price: $" + result);
    }

    /**
     * Test of isActivated method, of class Membership.
     */
    @Test
    public void testIsActivated() {
        
        Membership instance = new Membership("maha", "selver", 60, true);
        boolean result = instance.isActivated();
        System.out.println("isActivated:  " + result);

    }

 

}
