// Mahdi Hossain
// Homework 1
// Eric Stahl
// Accounts 

public class Account{
    private int accountID;
    private int pin;
    private double balance;
    
    public Account(int accountID, int pin, double balance){
        if (accountID>=1000 & accountID<=9999){
            this.accountID=accountID;
        }
        else {
            System.out.println("There was an error in creating your ID.\nInputs for ID must be from 1000 to 9999." 
            + " Your accountID has been defaulted to 9999.");
            this.accountID=9999;
        }
        
         if (pin>=1000 & pin<=9999){
            this.pin=pin;
        }
        else {
            System.out.println("There was an error in creating your pin.\nInputs for pin must be from 1000 to 9999." 
            + " Your accountID has been defaulted to 9999.");
            this.pin=0;
        }
        
        if (balance>0){
            this.balance=balance;
        }
        else{
            System.out.println("There was an error in creating your balnce.\nInputs for balance must be greater than 0." 
            + "Your balance has been defaulted to 0.");
            this.balance=0;
        }
    }
    
    // Set Methods
    public void setAccountID (int accountID){
        // i know you could right accountID = (accountID>=1000 & accountID<=9999) ? accountID=9999
        // but didn't know how to produce the error message
        if (accountID>=1000 & accountID<=9999){
            this.accountID=accountID;
        }
        else {
            System.out.println("There was an error in creating your ID.\nInputs for ID must be from 1000 to 9999." 
            + " Your accountID has been defaulted to 9999.");
            this.accountID=9999;
        }
    }
    
    public void setPin (int pin){
            if (pin>=1000 & pin<=9999){
            this.pin=pin;
        }
        else {
            System.out.println("There was an error in creating your pin.\nInputs for pin must be from 1000 to 9999." 
            + " Your accountID has been defaulted to 9999.");
            this.pin=9999;
        }
    }
    
    public void setBalance (double balance){
           if (balance>0){
            this.balance=balance;
        }
        else{
            System.out.println("There was an error in creating your balnce.\nInputs for balance must be greater than 0." 
            + "Your balance has been defaulted to 0.");
            this.balance=0;
        }
    }
    
    // Methods used to get the information of the objects
    public int getAccountID (){
        return this.accountID;
    }
    
    public int getPin(){
        return this.pin;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    // to string methiod of the class
    public String toString() {
        return " ID: " + this.accountID + " Balance: " + this.balance;
        // returns the value of the ID and the balance of the specific object 
    }
    
    
    // comparison between objects
    public boolean equals(Object obj){
        if (obj instanceof Account){
            return (pin==((Account)obj).pin & accountID==((Account)obj).accountID);
            // checks to see if the account pin and ID are the same for two objects
        }
        else{
            return false;
        }
    }
}