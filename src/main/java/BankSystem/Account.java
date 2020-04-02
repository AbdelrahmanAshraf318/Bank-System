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
public class Account {

    private String AccountNumber;
    private double Balance;
    private Client obj;

    /**
     * this default constructor to give initial value for the attributes
     */
    public Account() {
        AccountNumber = "0";
        Balance = 0.0;
    }

    /**
     * this method to set a values for the attributes from the user
     *
     * @param AccountNumber to hold the value of the account number
     * @param Balance to hold the value of the balance
     */
    public Account(String AccountNumber, double Balance) {
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
    }

    /**
     * this method to set an accountNumber
     *
     * @param AccountNumber to hold the value of the account number from the
     * user
     */
    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    /**
     * this method to set a value of the balance
     *
     * @param Balance
     */
    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    /**
     *
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return AccountNumber;
    }

    /**
     *
     * @return the Balance
     */
    public double getBalance() {
        return Balance;
    }

    /**
     * this method to make user make withdraw from his balance
     *
     * @param Money to know the money that the user want to withdraw
     */
    public void Withdraw(double Money) {
        if (Money <= getBalance()) {
            Balance = Balance - Money;
        } else {
            System.out.println("There is no enough money in your Balance");
        }
    }

    /*public void setClient(Client c){
        obj = c;
    }
    public Client getClient(){
        return this.obj;
    }*/
    /**
     * this method to make user make deposit
     *
     * @param Money to know the money that the user want to deposit
     */
    public void Deposit(double Money) {
        Balance = Balance + Money;
    }

    /**
     * this method to return the attributes in the class
     *
     * @return
     */
    public String toString() {
        return String.format(AccountNumber + " " + Balance + " " + obj);
    }

}
