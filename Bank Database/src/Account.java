import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Account{

    private double SSN;
    private double balance;
    private String accountType;


    public Account(){
        super();
    }
    public Account(double SSN, double balance, String accountType) {
        this.SSN = SSN;
        this.balance = balance;
        this.accountType = accountType;
    }

    public double getSSN() {
        return SSN;
    }

    public void setSSN(double SSN) {
        this.SSN = SSN;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void depositMoney(int amount){
        if(amount < 0)
            System.out.println("Can not deposit negative balance");
                balance = balance + amount;
    }

    public void withdrawMoney(int amount){
        if(balance<=0 || amount < 0 || amount < balance)
            System.out.println("Insufficient fund");
                balance = balance = amount;
    }

    public void payBills (int amount){
        if(amount < 0)
            System.out.println("Amount has to be positive");
        balance = balance - amount;
    }
    public String checkAccount(double SSN){
        return (" " + SSN + " " + balance + " " );
    }



}
