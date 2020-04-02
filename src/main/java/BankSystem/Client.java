/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankSystem;

/**
 *The client class
 * @author Abd Elrahman
 */

public class Client {
    
    /**
     * 
     */
    
    private String Name;
    private String National_ID;
    private String Address;
    private String phone;
    private  Account account;
    
    /**
     * this default constructor to make intializing for the attributes of the class
     */
    
    
    public Client(){
        Name = "Nothing";
        Address = "Nothing";
        phone = "Nothing";
        National_ID = "0";
    }
    
    /**
     * this paramterized constructor to get the values of the attributes from the user
     * @param Name the variable that will hold the value of name from the user
     * @param National_ID the variable that will hold the value of National_ID from the user
     * @param Address the variable that will hold the value of Address from the user
     * @param Phone the variable that will hold the value of phone from the user
     * @param Acc the object that will hold the data of the account from the user
     */
    
    public Client(String Name , String National_ID , String Address , String Phone , Account Acc){
        this.Name = Name;
        this.National_ID = National_ID;
        this.Address = Address;
        this.phone = phone;
        account = new Account();
        account.setAccountNumber(Acc.getAccountNumber());
        account.setBalance(Acc.getBalance());
    }
    
    /**
     * this set to get a value of name from the user
     * @param Name the variable that will hold the value of name from the user
     */
    
    public void setName(String Name){
        this.Name = Name;
    }
    
    /**
     * this getter method to return the value of the name
     * @return the value of name
     */
    
    public String getName(){
        return this.Name;
    }
    /**
     * this method to set a value of the national_ID but from the user
     * @param National_ID the variable that will hold the value of National_ID from the user
     */
    public void setNationalID(String National_ID){
        this.National_ID = National_ID;
    }
    /**
     * this method to return the value of the national_ID 
     * @return the National_ID
     */
    public String getNationalID(){
        return this.National_ID;
    }
    /**
     * this method to set the value of the address 
     * @param Address will hold the value of the address from the user
     */
    public void setAddress(String Address){
        this.Address = Address;
    }
    /**
     * this method to return the value of the address
     * @return the address
     */
    public String getAddress(){
        return this.Address;
    }
    /**
     * this method to set a value for the attribute phone
     * @param Phone the variable that will hold the value of phone from the user
     */
    public void setPhone(String Phone){
        this.phone = Phone;
    }
    /**
     * 
     * @return the current value of the phone 
     */
    public String getPhone(){
        return this.phone;
    }
    /**
     * this method to set a value for the account object
     * @param Acc 
     */
    public void setAccount(Account Acc){
        this.account = Acc;
    }
    /**
     * 
     * @return the current value of account number 
     */
     public String getAccount(){
        return account.getAccountNumber();
    }
     /**
      * 
      * @return the current balance of the user
      */
     public double getBa(){
         return account.getBalance();
     }
     /**
      * this method to return the attributes in the class
      * @return 
      */
     public String toString(){
         return String.format(Name + " " + Address + " " +phone + " " + account.getAccountNumber() + " " + account.getBalance() + " " + getNationalID());
     }
     
     
}

