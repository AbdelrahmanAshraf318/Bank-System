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
public class SpecialAccount extends Account{
    /**
     * this constructor to give values for AccountNumber & Balance
     * @param AccountNumber to hold the value from the user
     * @param Balance  to hold the value from the user
     */
    public SpecialAccount(String AccountNumber, double Balance) {
        super(AccountNumber, Balance);
    }

    SpecialAccount() {
        System.out.println("Default Constructor");
    }
    /**
     *this method to take money that the user want to withdraw
     * @param Money 
     */
    public void Withdraw(double Money){
        if(Money<=getBalance()){
            double MyBalance = getBalance();
            MyBalance = MyBalance - Money;
            setBalance(MyBalance);
        }
        else if(getBalance()==0.0){
            if(Money<=1000){
             double MyBalance = getBalance();
            MyBalance = -Money;
            setBalance(MyBalance);
            }
            else{
                System.out.println("You Cannot Withdraw more than 1000 pounds");
            }
        }
        else{
            System.out.println("There is no enough Balance");
        }
    }
    /*public String toString(){
        return String.format(AccountNumber + " " + Balance);
    }*/
}
