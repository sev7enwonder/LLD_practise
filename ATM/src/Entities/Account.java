package Entities;

import java.util.List;

public class Account {
    private String accountNumber;
    private double totalBalance;
    private double availableBalance;
    private Customer customer;
    private Bank bank;

    private List<Transaction> transactionList;

    public Account(String accountNumber, Customer customer, Bank bank) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.bank = bank;
    }

    public double getAvailableBalance(){
      return availableBalance;
    }

    public void addAmound(int balance){
        this.totalBalance += balance;
        //add in available
        //addAvailableBalance();
    }

    public boolean withDrawAmount(double balance){
        if(availableBalance >= balance){
            availableBalance -= balance;
            totalBalance -= balance;
            return true;
        }
        return false;
    }
}
