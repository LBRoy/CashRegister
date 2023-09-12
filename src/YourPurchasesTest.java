

import org.junit.Test;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
/**
 * <p>Purpose: This class test the getPurchase method to see if it calculates correctly and returns the correct value</p>
 * <p>Exceptions:</p>
 * <p>recordPurchase method does not validate if the arguments passed is indeed a double.</p>
 * @author Braden Howard
 */
public class YourPurchasesTest
{
   private static final double EPSILON = 1E-12;
    /**
     * <p>This test method tests the getPurchase method (labeled as testGetPayment but tests getPurchase)
     *  to see if it gets the correct purchase amount.</p>
	 * <p>Inputs for aPurchase.recordPurchase: 2.0</p>
	 * <p>Expected value for result: 2.0</p>
	 * <p>Expected value for expected: 2.0</p>
	 * <p>Actual value for result: 2.0</p>
	 * <p>Actual value for expected: 2.0</p>
	 * <p>Test: Pass</p>
    */
   @Test
	public void testGetPayment() {
	    // Instantiating 
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(2.0); // Sets amount of the item to $2.0
		double result = aPurchase.getPurchase();
		double expected = 2.0; // Purchase amount expected to be $2.0
		Assert.assertEquals(expected, result, EPSILON);
   }	
  }

