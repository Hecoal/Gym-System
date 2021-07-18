package Sistema;
/**
 * This classes helps to calculate the total coast of a Fortnightly-Class-Subscription
 * @author Hecoal
 */
public class FortnightlyClasses implements Payment{
    
    /**
     * This method implements a method to return the class of an user
     * @param paymentMethod
     * @return 
     */
     @Override 
     public void calculatePayment(){
         
       System.out.println("The payment method day is biweek. Pay $600.00 kr");   
     }
       

    
}
