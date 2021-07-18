package Sistema;

/**
 * This method returns the live status of the client / payment
 * @author Hecoal
 */

public class Check {
    /**
     * This method returns the live status of the client
     * @param newClient
     * @return 
     */
    public String  getLiveClient(Client newClient){
        
     return  ConsoleColors.WHITE+ "ID: > "+newClient.getId() + " Is now: " +newClient.getStatus()+ConsoleColors.RESET;
    }
    /**
     * This method returns the payment method of the client
     * @param newClient
     * @return 
     */
    public String getClientMethod(Client newClient){
        
     return ConsoleColors.WHITE+ "ID: > "+newClient .getId()+" Pays with: "+newClient.getPaymentMethod()+ConsoleColors.RESET;
    }
    
}
