package Sistema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This is the Home Class, where all the actions / options 
 *                     happens
 * @author Hecoal
 */
public class Home {
    
    private static Scanner in = new Scanner (System.in);
    
    private ClientCatalog catalog = ClientCatalog.getSingletonCatalog();
    
    
    /**
     * This method is the MainMenu, the home screen of the program
     * @return opc
     */
    public int MainMenu(){
        
    while(true){
              
         try
           {
               //fillClients();
               System.out.println("***********************");
               System.out.println("|   FAT-GYM SYSTEM    |");
               System.out.println("|     Version 1.1     |");
               System.out.println("|    ~HOME SCREEN:~   |");
               System.out.println("***********************");
               System.out.println("Select one of the following options");
               System.out.println("1 : Check all clients");
               System.out.println("2 : Add clients");
               System.out.println("3 : Delete Clients");
               System.out.println("4 : Search for a client");
               System.out.println("5 : Save Clients on TXT");
               System.out.println("6 : Load Clients from TXT");
               System.out.println("7 : Check Client Status");
               System.out.println("8 : Check Payment Method");
               System.out.println("0: Exit");             
               System.out.println("Your option: > ");
               
               int opc=Integer.parseInt(in.nextLine());
               
               if(opc>=0 && opc<=8)
               {
                   return opc;   
               }
              
           } catch(NumberFormatException nfe)
                   {
                       System.out.println(ConsoleColors.RED+ "A number was expected!"+ConsoleColors.RESET);
                   }
      }
    }
    /**
     * This method (the switch) works as a secondary home screen.
     * VOID
     */
    public void Functions(){
          int opc=0;
        
        do
        {
            opc=MainMenu();
                switch (opc)
                {
                    case 1: //Check ALL General Info Client [DONE]
                        System.out.println("***********************");
                        System.out.println("|   FAT-GYM SYSTEM    |");
                        System.out.println("|     Version 1.1     |");
                        System.out.println("| ~Check All Clients:~|");
                        System.out.println("***********************");
                        for(Client newClient :catalog)
                        {
                            System.out.println(newClient);    
                        }
                        break;
                        
                    case 2: //Add Client [DONE]
                        System.out.println("***********************");
                        System.out.println("|   FAT-GYM SYSTEM    |");
                        System.out.println("|     Version 1.1     |");
                        System.out.println("|    ~ADD CLIENT:~    |");
                        System.out.println("***********************");
                        Client newClient=askClient();
                        catalog.addClient(newClient);
                        System.out.println(ConsoleColors.GREEN+ "The user has been added successfuly"+ConsoleColors.RESET);
                        break;
                        
                    case 3: //Delete Client [DONE]
                        System.out.println("***********************");
                        System.out.println("|   FAT-GYM SYSTEM    |");
                        System.out.println("|     Version 1.1     |");
                        System.out.println("|   ~DELETE CLIENT:~  |");
                        System.out.println("***********************");
                         int Id =askId(); 
                         if(catalog.removeUser(Id)){
                            System.out.println(ConsoleColors.GREEN+ "The user has been deleted successfuly"+ConsoleColors.RESET);
                         }
                         else
                         {
                            System.out.println(ConsoleColors.RED+ "The user hasn't been found!"+ConsoleColors.RESET);
                         }
                         break;
                        
                    case 4: //Look for a client [DONE]
                        System.out.println("***********************");
                        System.out.println("|   FAT-GYM SYSTEM    |");
                        System.out.println("|     Version 1.1     |");
                        System.out.println("| ~LOOK FOR A CLIENT:~|");
                        System.out.println("***********************");
                       
                        Id =askId();
                        Client client= catalog.getClient(Id);
                        System.out.println(client);
                        break;
                        
                    case 5: //Save clients TXT [DONE]
                        System.out.println("***********************");
                        System.out.println("|   FAT-GYM SYSTEM    |");
                        System.out.println("|     Version 1.1     |");
                        System.out.println("|   ~SAVE IN TXT:~    |");
                        System.out.println("***********************");
                        saveClients(catalog);
                        break;
                        
                    case 6://Load Clients from TXT [Done]
                        System.out.println("************************");
                        System.out.println("|   FAT-GYM SYSTEM     |");
                        System.out.println("|     Version 1.1      |");
                        System.out.println("| ~Load Clients TXT:~  |");
                        System.out.println("************************");
                        loadClients();
                        
                        break;
                        
                    case 7://Check client status [DONE]
                        System.out.println("************************");
                        System.out.println("|   FAT-GYM SYSTEM     |");
                        System.out.println("|     Version 1.1      |");
                        System.out.println("|~Load Client Status:~ |");
                        System.out.println("************************");
                        checkStatus();
                        
                        break;
                        
                    case 8://Check payment  [DONE]
                        System.out.println("************************");
                        System.out.println("|   FAT-GYM SYSTEM     |");
                        System.out.println("|     Version 1.1      |");
                        System.out.println("|~Load Client Payment:~|");
                        System.out.println("************************");
                        checkPaymentMethod();
                        
                        break;
                    case 0:
                        System.out.println(ConsoleColors.GREEN+"See you around!  "+ConsoleColors.RESET);
                }
        }while(opc!=0);
      
      }   
    /**
     * This method saves the client in the arrayList in the TXT
     * @param catalog 
     */
    private void saveClients(ClientCatalog catalog){
       try
       {
         FileWriter file = new FileWriter("ClientsGYM.txt", true); 
         PrintWriter fileOut = new PrintWriter(file); 
         
        for(Client newClient :catalog){
                        fileOut.println(newClient.getName()+ "-" +  newClient.getAddress() +  "-" + newClient.getPhone() + "-" + newClient.getClassType() + "-" +newClient.getWeight() + "-" + newClient.getHeight() + "-" +newClient.getAge()  + "-" +newClient.getGender()+ "-" + newClient.getComplexion() + "-" +newClient.getPaymentMethod() + "-" +newClient.getStatus() + "-" + newClient.getId());
                        }
           fileOut.close();
           System.out.println(ConsoleColors.GREEN+"The file has been created successfully!"+ConsoleColors.RESET);
       }
       catch(IOException ioe)
       {
         System.out.println(ConsoleColors.RED+ "The file can't be readed "+ioe + ConsoleColors.RESET); 
         return;
       }
   }
    
    /**
     * This method asks the data of the GYM'S client, in order to apply the structure from the Client class
     * @return 
     */
    public Client askClient(){
        while(true)
        {
            try
            {
                Scanner in = new Scanner (System.in);
                
                System.out.println("Enter the Name:> ");
                String name = in.nextLine();
                
                System.out.println("Enter the Adress:> ");
                String address = in.nextLine();
                
                System.out.println("Enter the Phone:> ");
                String phone = in.nextLine();
                
                System.out.println("Enter the ClassType:> ");
                String classType = in.nextLine();
                
                System.out.println("Enter the Weight:> ");
                double weight = Double.parseDouble(in.nextLine());
                
                System.out.println("Enter the Height: > ");
                double height = Double.parseDouble(in.nextLine());
                
                System.out.println("Enter the Age: > ");
                int age = Integer.parseInt(in.nextLine());
                
                System.out.println("Enter the Gender: > ");
                String gender = in.nextLine();
                
                System.out.println("Enter the Complexion:> ");
                String complexion = in.nextLine();
                
                System.out.println("Enter the Payment Method:> ");
                String paymentMethod = in.nextLine();
                
                System.out.println("Enter the Status:> ");
                String status = in.nextLine();
                
                System.out.println("Enter the ID: >");
                int id = Integer.parseInt(in.nextLine());
                
                System.out.println("Enter the Late-Days (Payment):> ");
                int lateDays = Integer.parseInt(in.nextLine());
                
                
                return new Client (name, address,  phone,  classType,  weight,  height,  age,  gender,  complexion,  paymentMethod,  status,  id,  lateDays);
                
            }
            catch(NumberFormatException nfe)
            {
                System.out.println(ConsoleColors.RED+"You entered a non-valid character!"+ ConsoleColors.RESET);
            }
        }
   }
    
    /**
    * This method ask the ID for universal pruposes in the program
    * @return 
    */
    private  int askId(){
    
       while(true)
       {
          try
          {
              System.out.println("Enter the ID: > "); 
              int id =Integer.parseInt(in.nextLine());
              return id;
          }
          catch(NumberFormatException nfe)
                  {
                    System.out.println(ConsoleColors.RED + "A ID full of numbers was expected! "+ConsoleColors.RESET);
                  }
       }
   }
    
    /**
     * This method loads all the clients in the TXT
     */
    public void loadClients(){ 
       try {
           
           FileReader file = new FileReader("ClientsGYM.txt");
           
           BufferedReader fileIn = new BufferedReader(file);
           
           String line = fileIn.readLine();
           
           while (line !=null){
               
               System.out.println(line);   
               line = fileIn.readLine();
           }
       }
       catch (IOException ioe)
       {
           System.out.println(ConsoleColors.RED + "The document can't be access!" + ConsoleColors.RESET);
       }
   
    }
       /**
      public void fillClients(){ 
       try {
           
           FileReader file = new FileReader("ClientsGYM.txt");
           BufferedReader fileIn = new BufferedReader(file);
           
           String line = fileIn.readLine();
           
           do{
                
               line = fileIn.readLine();
               String [] values;
               values= line.split("-");
               catalog.addClient(new Client (values[1], values[2],  values[3], values[4],  Double.parseDouble(values[5]),  Double.parseDouble(values[6]), Integer.parseInt(values[7]),  values[8],  values[9],  values[10],  values[11],Integer.parseInt(values[12]),  Integer.parseInt(values[13])));
           }
           while(line !=null);
       }
       catch (IOException ioe)
       {
           System.out.println(ConsoleColors.RED + "The document can't be access!" + ConsoleColors.RESET);
       }
         
    }
    **/
    
    /**
     * This method helps and checks the Live Status of the client
     */
    public void checkStatus(){
        
        Check newCheck = new Check();
        String message;
        int iD = askId();
        Client newClient = catalog.getClient(iD);
        
        message=newCheck.getLiveClient(newClient);
        
        System.out.println(message);
       
    }
    
    /**
     * This method helps and checks the payment Method
     */
    public void checkPaymentMethod(){
        Check check = new Check();
        int iD = askId();
        String message;
        Client newClient = catalog.getClient(iD);
        message=check.getClientMethod(newClient);
        System.out.println(message);
        
        String paymentMethod= newClient.getPaymentMethod();
        
        switch(paymentMethod){
            
            case "per class": 
                new DailyClasses().calculatePayment();
                break;
                
            case "weekly":
                new WeeklyClasses().calculatePayment();
                break;
                
            case "fortnightly":
                new FortnightlyClasses().calculatePayment();
                break;
                
            case "annual classes":
                new AnnualClasses().calculatePayment();
                break;
        }

    }
   
    /**
     * This is the main class
     * @param args 
     */
    public static void main (String [] args){
      Home home = new Home();
      home.Functions();
   }
    
   
    
}
