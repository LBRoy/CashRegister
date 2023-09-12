
/**
 * <p>This class is used to act as a cash register to calculate the cost of an item, take payment and give back change.</p>
 * 
 * <p>Exceptions:</p>
 * <p>receivedPayment method does not validate if the arguments passed to it are int.</p>
 * <p>recordPurchase method does not validate if the arguments passed is indeed a double.</p>
 * <p>calculateChange method has an error in it.</p>
 * 
 * @author Braden Howard
 */
public class YourPurchases
{
   /**
    *  QUARTER_VALUE set to 0.25 value of a quarter
    */
   public static final double QUARTER_VALUE = 0.25;
   /**
    *  DIME_VALUE set to 0.10 value of a dime
    */
   public static final double DIME_VALUE = 0.1;
   /**
    *  NICKEL_VAUE set to 0.05 value of a nickel
    */
   public static final double NICKEL_VALUE = 0.05;
   /**
    * PENNY_VALUE set to 0.01 value of a penny
    */
   public static final double PENNY_VALUE = 0.01;

   private double purchase;
   private double payment;

   /**
      Constructs a cash register - your purchases- with no money in it.
   */
   public YourPurchases()
   {
      purchase = 0;
      payment = 0;
   }

   
   /**
   Returns the amount of purchases.
   @return amount of purchases
	*/
	public double getPurchase()
	{
	   return purchase;
	  
	}

	
	/**
	Returns the amount of payment.
	@return amount of payments
	*/
	public double getPayment()
	{
	return payment;
	
	}

   /**
      Records the purchase price of an item.
      @param amount the price of the purchased item
   */
   public void recordPurchase(double amount)
   {
      purchase = purchase + amount;
     
   }
   
   /**
      Enters the payment received from the customer.
      @param dollars the number of dollars in the payment
      @param quarters the number of quarters in the payment
      @param dimes the number of dimes in the payment
      @param nickels the number of nickels in the payment
      @param pennies the number of pennies in the payment
   */

   public void receivePayment(int dollars, int quarters, 
         int dimes, int nickels, int pennies)
   {
      payment += dollars + quarters * QUARTER_VALUE + dimes * DIME_VALUE
            + nickels * NICKEL_VALUE + pennies * PENNY_VALUE;
   }
   
   /**
      Computes and returns the change due. This is done with some error in the calculations
      @return the change due to the customer
   */
   public double CalculateChange()
   {
      double change = payment + purchase;// Must change the "+" to a "-" to fix the code
      
      return change;
   }

/**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }
}

