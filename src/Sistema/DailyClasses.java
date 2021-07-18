package Sistema;

/**
 * This classes helps to calculate the total coast of a Daily-Class-Subscription
 * @author Hecoal
 */
public class DailyClasses implements Payment {
    
    /**
     * This method returns the next payment day
     * @param paymentMethod
     * @return 
     */
     @Override 
        public void calculatePayment(){
        System.out.println("The payment day is the next class. Pay $50.00");
     }
     
}
