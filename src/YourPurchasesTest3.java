
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
/**
 * <p>This class tests this getPayment method to check to see if it calculates the received payment correctly.</p>
 * <p>Exceptions</p>
 * <p>receivedPayment method does not validate if the arguments passed to it are int.</p>
 * @author Braden Howard
 */
public class YourPurchasesTest3 {
	private static final double EPSILON = 1.5E-15;
	/**
     * <p>This test method tests the getPayment method to see if it gets the correct payment amount.</p>
	 * <p>Inputs for aPurchase.receivePayment: 2.0</p>
	 * <p>Expected value for result: 2.0</p>
	 * <p>Expected value for expected: 2.0</p>
	 * <p>Actual value for result: 2.0</p>
	 * <p>Actual value for expected: 2.0</p>
	 * <p>Test: Pass</p>
	 */
	@Test
	public void testGetPayment() {
		YourPurchases aPurchase = new YourPurchases();
		aPurchase.receivePayment(2, 0, 0, 0, 0); // Sets receivedPayment amount to 2 dollars
		double result = aPurchase.getPayment(); // calls method
		double expected = 2.0; // Sets expected result to $2.00
		Assert.assertEquals(expected, result, EPSILON);
	}

}
