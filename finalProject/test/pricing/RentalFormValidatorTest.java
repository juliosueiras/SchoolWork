/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricing;

import pricing.RentalFormValidator;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhlee
 */
public class RentalFormValidatorTest {
    
    public RentalFormValidatorTest() {
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
     * Test of isValid method, of class RentalFormValidator.
     */
    @Test
    public void testIsValid() {
        System.out.println("isValid");
        RentalFormValidator instance = new RentalFormValidator(null);
        boolean expResult = false;
        boolean result = instance.isValid();
        assertEquals(expResult, result);
    }

    /**
     * Test of getErrors method, of class RentalFormValidator.
     */
    @Test
    public void testGetErrors() {
        System.out.println("getErrors");
        RentalFormValidator instance = new RentalFormValidator(null);
        ArrayList<Integer> expResult = new ArrayList<>();
        expResult.add(1011);
        instance.setErrorCodes(expResult);
        ArrayList<Integer> result = instance.getErrors();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setErrorCodes method, of class RentalFormValidator.
     */
    @Test
    public void testSetErrorCodes() {
        System.out.println("setErrorCodes");
        ArrayList<Integer> errorCodes = null;
        RentalFormValidator instance = null;
        instance.setErrorCodes(errorCodes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
