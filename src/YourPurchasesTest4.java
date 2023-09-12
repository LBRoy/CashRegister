
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
/**
 * <p>This class has two tests that check the same methods but with different denominations, checking to see if
 * the results equal what is expected after 24 cycles of adding the same received payment.</p>
 * <p>Purpose: The purpose of this class is to test a method twice with different denominations,and check to see
 * how it works if the customer makes multiple purchases</p>
 * 
 * <p>Exceptions:</p>
 * <p>receivedPayment method does not validate if the arguments passed to it are int.</p>
 * @author Braden Howard 
 */
public class YourPurchasesTest4 {
	private static final double EPSILON = 1.5E-15;
	/**
	 * <p>This test compares, in theory, the same value, but with different coins to see if the value of the 
	 * coins in the program with a delta of 1.5E-15 are equal after being added 24 times in a row summing up to 16.80.</p>
	 * <p>Inputs for aPurchase.receivePayment: 7 dimes</p>
	 * <p>Inputs for bPurchase.receivePayment: 1 dimes, 11 nickel, 5 pennies</p>
	 * <p>Expected value for resultA: 16.80</p>
	 * <p>Expected value for resultB: 16.80</p>
	 * <p>Actual value for resultA: 16.80</p>
	 * <p>Actual value for resultB: 16.80</p>
	 * <p>Test: Pass</p>
	 */
	@Test
    public void testComparePurchasesA() {
        YourPurchases aPurchase = new YourPurchases();
        YourPurchases bPurchase = new YourPurchases();
    
        for (int ctr = 0; ctr < 24; ctr++) {
           aPurchase.receivePayment(0, 0, 7, 0, 0);   // add 7 dimes (70 cents) each time through the loop for aPurchase
           bPurchase.receivePayment(0, 0, 1, 11, 5);  // do the same for bPurchase, but adding 1 dime, 11 nickels and 5 pennies--70 cents again
           double resultA = aPurchase.getPayment();
           double resultB = bPurchase.getPayment();
           Assert.assertEquals(resultA, resultB, EPSILON);
        }  // total added should be $16.80, i.e. 24 X 0.70, added to each purchase using different denominations
    }
	/**
	 * <p>This test compares, in theory, the same value, but results in a failure because the delta value of EPSILON is so
	 * large that the value of some of the numbers are not whole numbers so the purchaseA and purchaseB do not match after being
	 * added 24 times in a row summing up to 16.80.</p>
	 * <p>Inputs for aPurchase.receivePayment: 7 dimes</p>
	 * <p>Inputs for bPurchase.receivePayment: 6 dimes, 1 nickel, 5 pennies</p>
	 * <p>Expected value for resultA: 16.80</p>
	 * <p>Expected value for resultB: 16.80</p>
	 * <p>Actual value for resultA: 16.80</p>
	 * <p>Actual value for resultB: stops at ctr 11 because values do not match anymore</p>
	 * <p>Result: Fail</p>
	 */
    @Test
    public void testComparePurchasesB() {
        YourPurchases aPurchase = new YourPurchases();
        YourPurchases bPurchase = new YourPurchases();
    
        for (int ctr = 0; ctr < 24; ctr++) {
           aPurchase.receivePayment(0, 0, 7, 0, 0);   // add 7 dimes (70 cents) each time through the loop for aPurchase
           bPurchase.receivePayment(0, 0, 6, 1, 5);  // do the same for bPurchase, but adding 6 dime, 1 nickel and 5 pennies--70 cents again
           double resultA = aPurchase.getPayment();
           double resultB = bPurchase.getPayment();
           Assert.assertEquals(resultA, resultB, EPSILON);
        }  // total added should be $16.80, i.e. 24 X 0.70, added to each purchase using different denominations
    }
}
