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
public class CommercialClient extends Client{
    private String commercial_ID;
    
    /**
     * this constructor to take values of the attributes from the user
     * @param commercial_ID to set the value of the commercial_ID
     * @param Name to get the set the value of the name
     * @param Address to set the value of the address
     * @param phone to set the value of the phone
     * @param acc to set the account object
     * @param National_ID to set the value of National_ID
     */
    
    public CommercialClient(String commercial_ID , String Name , String Address , String phone , Account acc , String National_ID){
        super(Name , National_ID , Address ,  phone , acc);
        this.commercial_ID = commercial_ID;
    }
    /**
     * this default constructor to give an intial value for the commercial_ID
     */
    public CommercialClient(){
        commercial_ID = "00000000000000";
    }
    /**
     * this method to set a value for the commercial_ID 
     * @param commercial_ID to hold the value of the commercial_ID
     */
    public void setCommercial(String commercial_ID){
        this.commercial_ID = commercial_ID;
    }
    /**
     * 
     * @return the current commercial_ID 
     */
    public String getCommercial_ID() {
        return commercial_ID;
    }
    /**
      * this method to return the attributes in the class
      * @return 
      */
    public String toString(){
        return String.format( getName() + " " + getAddress() + " " + getPhone() + " "  + getAccount() + " "  + getBa() + " " + " " + getNationalID() + " " + commercial_ID);
    }
}
