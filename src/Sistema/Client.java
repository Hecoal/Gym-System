package Sistema;

/**
 * This class, gets the information about a client
 * @author Hecoal
 */
public class Client {
    
    private String name;
    private String address;
    private String phone;
    private String classType;
    private double weight;
    private double height;
    private int age;
    private String gender;
    private String complexion;
    private String paymentMethod;
    private String status;
    private int id;
    private int lateDays;
    
    /**
     * Constructor of the class "Client"
     * @param name
     * @param address
     * @param phone
     * @param classType
     * @param weight
     * @param height
     * @param age
     * @param gender
     * @param complexion
     * @param paymentMethod
     * @param status 
     * @param id
     * @param lateDays
     */
    public Client(String name, String address, String phone, String classType, double weight, double height, int age, String gender, String complexion, String paymentMethod, String status, int id, int lateDays) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.classType = classType;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
        this.complexion = complexion;
        this.paymentMethod = paymentMethod;
        this.status = status;
        this.id = id;
        this.lateDays= lateDays;
    }
     /**
      * Selector Method "Get"
      * @return name
      */
    public String getName() {
        return name;
    }
     /**
      * Selector Method "Get"
      * @return address
      */
    public String getAddress() {
        return address;
    }
     /**
      * Selector Method "Get"
      * @return phone
      */
    public String getPhone() {
        return phone;
    }
     /**
      * Selector Method "Get"
      * @return classType
      */
    public String getClassType() {
        return classType;
    }
     /**
      * Selector Method "Get"
      * @return weight
      */
    public double getWeight() {
        return weight;
    }
     /***
      * Selector Method "Get"
      * @return height
      */
    public double getHeight() {
        return height;
    }
     /**
      * Selector Method "Get"
      * @return age
      */
    public int getAge() {
        return age;
    }
    /**
     * Selector Method "Get"
     * @return sex
     */
    public String getGender() {
        return gender;
    }
     /**
      * Selector Method "Get"
      * @return complexion
      */
    public String getComplexion() {
        return complexion;
    }
     /**
      * Selector Method "Get"
      * @return paymentMethod
      */
    public String getPaymentMethod() {
        return paymentMethod;
    }
     /**
      * Selector Method "Get"
      * @return status
      */
    public String getStatus() {
        return status;
    }
     /**
      * Selector Method "Get"
      * @param status 
      */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * Selector Method "Get"
     * @return ID
     */
     public int getId(){
        return id;
    }
     
     /**
      * Selector Method "Get"
      * @return lateDays
      */
     public int getlateDays(){
       return lateDays;
     }
     
    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", address=" + address + ", phone=" + phone + ", classType=" + classType + ", weight=" + weight + ", height=" + height + ", age=" + age + ", gender=" + gender + ", complexion=" + complexion + ", paymentMethod=" + paymentMethod + ", status=" + status + '}';
    }
    
    
    
    
}
