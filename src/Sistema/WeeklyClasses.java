package Sistema;

public class WeeklyClasses  implements Payment{
    
    /**
     * This method returns the next payment day
     * @param paymentMethod
     * @return 
     */
    
    @Override
     public void calculatePayment(){

         System.out.println("The payment day is the next week. Pay $315.00 kr");
         
     }
   
     
}
