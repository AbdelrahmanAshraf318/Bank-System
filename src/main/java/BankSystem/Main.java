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
/*
Abdelrahman Ashraf Mohamed Mohamed 20180150
Amir Ibrahim Mahmoud 20180057
Toka Moustafa Hassan 20180074
*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        Bank obj6 = new Bank();
        int choose3 = 0;
          String N ;
         String Address;
         String National_ID;
       String Phone;
       double Balance = 0.0; 
       String AccountNumber;
       Client obj = null;
       Account obj3 = null;
       /**
        * the previous variables to take the data from the user and pass it throw the functions of the classes
        */
        do{
            /**
             * the menu which the user will choose the operation he wants 
             */
            System.out.println("1)AddClient");
            System.out.println("2)DisplayAllClients");
            System.out.println("3)Do Operations");
            System.out.println("4)Exit");
            choose3 = input.nextInt();
            
            if(choose3==1){
                System.out.println("choose one of the following: ");
        System.out.println("1)NormalClient");
        System.out.println("2)CmmercialClient");
        int choose = input.nextInt();
        if(choose==1){
           obj = new Client();
            System.out.println("Enter Name: ");
             N = input.next();
             input.nextLine();
            obj.setName(N);
            System.out.println("Enter Address: ");
            Address = input.nextLine();
            input.nextLine();
            obj.setAddress(Address);
            System.out.println("Enter National_ID: ");
             National_ID = input.next();
             input.nextLine();
            obj.setNationalID(National_ID);
            System.out.println("Enter Phone: ");
             Phone = input.nextLine();
             input.nextLine();
            obj.setPhone(Phone);
            System.out.println("choose the type of the account: ");
        System.out.println("1)NormalAccount");
        System.out.println("2)SpecialAccount");
        int choose1 = input.nextInt();
        if(choose1==1){
              obj3 = new Account();
            System.out.println("Enter Balance: ");
             Balance = input.nextDouble();
            obj3.setBalance(Balance);
            System.out.println("Enter AccountNumber: ");
             AccountNumber = input.next();
             input.nextLine();
             obj3.setAccountNumber(AccountNumber);
        }
        else if(choose1==2){
             obj3 = new SpecialAccount();
            System.out.println("Enter Balance: ");
            Balance = input.nextDouble();
            obj3.setBalance(Balance);
            System.out.println("Enter AccountNumber: ");
            AccountNumber = input.next();
            input.nextLine();
            obj3.setAccountNumber(AccountNumber);
        }
        else{
            System.out.println("Invalid Input");
        }
        }
        
        else if(choose==2){
            obj = new CommercialClient();
            System.out.println("Enter Name: ");
            N = input.next();
            input.nextLine();
            obj.setName(N);
            System.out.println("Enter Address: ");
            Address = input.nextLine();
            input.nextLine();
            obj.setAddress(Address);
            System.out.println("Enter Commercial_ID: ");
            National_ID = input.next();
            input.nextLine();
            obj.setNationalID(National_ID);
            System.out.println("Enter Phone: ");
            Phone = input.nextLine();
            input.nextLine();
            obj.setPhone(Phone);
            System.out.println("choose the type of the account: ");
        System.out.println("1)NormalAccount");
        System.out.println("2)SpecialAccount");
        int choose1 = input.nextInt();
        if(choose1==1){
               obj3 = new Account();
            System.out.println("Enter Balance: ");
            Balance = input.nextDouble();
            obj3.setBalance(Balance);
            System.out.println("Enter AccountNumber: ");
            AccountNumber = input.next();
            input.nextLine();
            obj3.setAccountNumber(AccountNumber);
            /*obj.setAccount(obj3);
            obj6.AddClient(obj);*/
        }
        else if(choose1==2){
             obj3 = new SpecialAccount();
            System.out.println("Enter Balance: ");
            Balance = input.nextDouble();
            obj3.setBalance(Balance);
            System.out.println("Enter AccountNumber: ");
            AccountNumber = input.next();
            input.nextLine();
            obj3.setAccountNumber(AccountNumber);
            /*obj.setAccount(obj3);
            obj6.AddClient(obj);*/
        }
        else{
            System.out.println("Invalid Input");
        }
        }
        else{
             System.out.println("Invalid Input");
        }
        obj.setAccount(obj3);
            obj6.AddClient(obj);
            }
            else if(choose3==2){
                obj6.Display();
            }
            else if(choose3==3){
                    System.out.println("1)Deposit");
                System.out.println("2)Withdraw");
                int choose6 = input.nextInt();
                if(choose6==1){
                    System.out.println("Enter Money");
                    double money = input.nextDouble();
                    obj3.Deposit(money);
                }
                else if(choose6==2){
                    System.out.println("Enter Money");
                    double money = input.nextDouble();
                    obj3.Withdraw(money);
                }
            }
            else if(choose3==4){
                System.out.println("Exit");
            }
        }while(choose3!=4);
       
         
    }
}
