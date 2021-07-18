package Sistema;
/**
 * This class helps to calculate the total coast of an Annual Class-Subscription
 * @author Hecoal
 */
public class AnnualClasses implements Payment {
    
    /**
     * This class  returns the yearly payment of the user
     * @param paymentMethod
     * @return 
     */
    @Override 
     public void calculatePayment(){
         
        System.out.println("The payment day is the next year. Pay 9,125.00 kr");
      
     }
     
   
}
