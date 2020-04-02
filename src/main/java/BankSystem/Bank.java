/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankSystem;

/**
 *
 * @author Abd Elrahman
 */
import java.util.ArrayList;

public class Bank {
    private String Name;
    private String Address;
    private String Phone;
    
    
    private ArrayList<Account> ACCOUNT = new ArrayList<Account>();
    private ArrayList<Client> CLIENTS = new ArrayList<Client>();
    
    /**
     * 
     */
    public Bank() {
        System.out.println("BankConstructor");
    }
           
    /**
     * this constructor to take values from the user and give them to the attributes 
     * @param Name to hold the value of the name from the user
     * @param Address to hold the value of the Address from the user
     * @param Phone to hold the value of the phone from the user
     */
    Bank(String Name , String Address , String Phone){
        this.Name = Name;
        this.Address = Address;
        this.Phone = Phone;
    }
    /**
     * this method to set a value for the attribute Name from the user
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }
    /**
     * this method to set a value for the attribute Address from the user
     * @param Address 
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }
    /**
     * this method to set a value for the attribute Phone from the user
     * @param Phone 
     */
    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    /**
     * this method to return the value of the Name
     * @return 
     */
    public String getName() {
        return Name;
    }
    /**
     * this method to return the value of the Address
     * @return 
     */
    public String getAddress() {
        return Address;
    }
    /**
     * this method to return the value of the phone
     * @return 
     */
    public String getPhone() {
        return Phone;
    }
    /**
     * this method to take the data of the NormalClient and store it in the ArrayList
     * @param obj hold the data of the NormalClient
     */
   public void AddClient(Client obj){
        CLIENTS.add(obj);
        Account obj1 = new Account();
        obj1.setAccountNumber(obj.getAccount());
        obj1.setBalance(obj.getBa());
        ACCOUNT.add(obj1);
    }
   /**
    * this method to take the data of the CommercialClient and store it in the ArrayList
    * @param obj hold the data of the CommercialClient
    */
   public void AddClient(CommercialClient obj){
        CLIENTS.add(obj);
        Account obj1 = new Account();
        obj1.setAccountNumber(obj.getAccount());
        obj1.setBalance(obj.getBa());
        ACCOUNT.add(obj1);
    }
   /**
    * this method to take the data of the SpecialAccount from the Client and store it in the ArrayList
    * @param obj hold the data of the account
    */
    public void AddAccount(SpecialAccount obj){
        ACCOUNT.add(obj);
        Client obj1 = new Client();
        obj1.setAccount(obj);
        CLIENTS.add(obj1);
    }
    /**
     * this method to take the data of the NormalAccount from the Client and store it in the ArrayList
     * @param obj hold the data of the account
     */
   public void AddAccount(Account obj){
        ACCOUNT.add(obj);
        Client obj1 = new Client();
        obj1.setAccount(obj);
        CLIENTS.add(obj1);
    }
    /**
     * this method to display the data of the clients from the ArrayList
     */
   public void Display(){
        if(CLIENTS.size()==0){
            System.out.println("There is no clients");
        }
        else{
            for(int i=0 ; i<CLIENTS.size() ; i++){
                System.out.println("Client "+(i+1)+" "+CLIENTS.get(i));
            }
        }
    }
   
  
}
