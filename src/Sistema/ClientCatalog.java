package Sistema;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class implements a Iterable Method that implements data from the Client class
 * @author Hecoal
 */
public class ClientCatalog implements Iterable <Client>{
    
    /**
     * This method makes ClientCatalog a singletonCatalog
     */
    private static ClientCatalog singletonCatalog;
    
    private ArrayList<Client> members = new ArrayList<Client>();

    /**
     * Method to add a client in the ArrayList following the structure from the Client class
     * @param newClient 
     */
    public void addClient(Client newClient){   
        
        members.add(newClient);
    }
    
    /**
     * Method to get the ID of a client, in order to do other  methods
     * @param id
     * @return us
     */
    public Client getClient(int id){
         
         for(Client us : members){
             
             if(us.getId()== id) {    
                return us;
             }             
         }
         return null;
     }
    /**
     * Method to remove a user from the ArrayList.
     * First, looks for the ID of the class Client, 
     * then it removes from the ArrayList
     * @param id
     * @return usTemp
     */
    public boolean removeUser(int id)
     {
         Client usTemp = getClient(id);
         return members.remove(usTemp);       
     }
    
    /**
     * Method to create the singleton
     * @return singletonCatalog
     */
     public static ClientCatalog getSingletonCatalog(){
        if(singletonCatalog == null){
            
        singletonCatalog = new ClientCatalog();
        }
        return singletonCatalog;
    }
     
     /**
      * This override affects the ArrayList of Clients
      * @return members
      */
    @Override
     public Iterator<Client>iterator(){
     return members.iterator();
    }
     
}
