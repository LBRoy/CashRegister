
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
/**
 * <p>This class tests multiple methods to find which one made a calculation error (CalculateChage) when returning the change.</p>
 * <p>Exceptions:</p>
 * <p>recordPurchase method does not validate if the arguments passed is indeed a double.</p>
 * <p>calculateChange method has an error in it.</p>
 * <p>receivedPayment method does not validate if the arguments passed to it are int.</p>
 * @author Braden Howard
 */
public class YourPurchasesTest2 {

	private static final double EPSILON = 1E-12;
	
	/**
	 * <p>This test method tests the calculateChange method to see if it does the calculations correctly.</p>
	 * <p>It does not calculate correctly and needs to be changed from "+" to "-".</p>
	 * <p>Inputs for aPurchase.recordPurchase: 1.50</p>
	 * <p>Inputs for aPurchase.receivedPurchase: 5 dollars</p>
	 * <p>Expected value for changeResult: 3.50</p>
	 * <p>Expected value for expected: 3.50</p>
	 * <p>Actual value for changeResult: 6.50</p>
	 * <p>Actual value for expected: 3.50</p>
	 * <p>Test: fail</p>
	 */
	@Test
	public void testCalculateChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(1.5); // Sets amount of item to $1.50
		aPurchase.receivePayment(5, 0, 0, 0, 0); // Sets receive payment to 5 dollars
		double changeResult = aPurchase.CalculateChange(); // Call method
		double expected = 3.50; // expected result $3.50
	    Assert.assertEquals(expected, changeResult, EPSILON);	
	}
	/**
	 * <p>This test method tests the recordPurchase method to see if it gets the correct purchase value.</p>
	 * <p>Inputs for aPurchase.recordPurchase: 4.50</p>
	 * <p>Expected value for recordPurchaseResult: 4.50</p>
	 * <p>Expected value for expected: 4.50</p>
	 * <p>Actual value for recordPurchaseResult: 4.50</p>
	 * <p>Actual value for expected: 4.50</p>
	 * <p>Test: Pass</p>
	 */
	@Test 
    public void testRecordPurchase() {
        YourPurchases aPurchase = new YourPurchases();
        aPurchase.recordPurchase(4.5); // Sets amount of item to $4.50
        double recordPurchaseResult = aPurchase.getPurchase(); // Calls method
        double expected = 4.5; // Expected result is $4.50
        Assert.assertEquals(expected, recordPurchaseResult, EPSILON);
    }
	/**
	 * <p>This test method tests the receivesPayment method to see if it gets the correct payment value.</p>
	 * <p>Inputs for aPurchase.receivePayment: 3 dollars, 4 quarters, 6 dimes, 4 nickels, 5 pennies</p>
	 * <p>Expected value for receivePaymentResult: 4.85</p>
	 * <p>Expected value for expected: 4.85</p>
	 * <p>Actual value for receivedPaymentResult: 4.85</p>
	 * <p>Actual value for expected: 4.85</p>
	 * <p>Test: Pass</p>
	 */
    @Test
    public void testReceivePayment() {
       YourPurchases aPurchase = new YourPurchases();
       aPurchase.receivePayment(3, 4, 6, 4, 5); // Sets receivedPayment to 3 dollars, 4 quarters, 6 dimes, 4 nickels, 5 pennies
       double receivePaymentResult = aPurchase.getPayment();
       double expected = 4.85; // Sets expected result to $4.85
       Assert.assertEquals(expected, receivePaymentResult, EPSILON);
    }
    /**
     * <p>This test method tests the giveChange method to see if it gets the correct give change value.</p>
	 * <p>Inputs for aPurchase.recordPurchase: 6.0</p>
	 * <p>Inputs for aPurchase.receivePayment: 10 dollars, 3 dimes, 2 nickels</p>
	 * <p>Expected value for giveChangetResult: 4.4</p>
	 * <p>Expected value for expected: 4.4</p>
	 * <p>Actual value for receivedPaymentResult: 4.4</p>
	 * <p>Actual value for expected: 4.4</p>
	 * <p>Test: Pass</p>
     */
    @Test
    public void testGiveChange() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.recordPurchase(6); // Sets amount of item to $6.00
		aPurchase.receivePayment(10, 0, 3, 2, 0); // Sets received payment to 10 dollars, 3 dimes, 2 nickels
		double giveChangeResult = aPurchase.giveChange(); // calls method
		double expected = 4.4; // Sets expected result to $4.40
	    Assert.assertEquals(expected, giveChangeResult, EPSILON);	
    }
}
