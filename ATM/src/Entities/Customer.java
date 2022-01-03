package Entities;

public class Customer {
    private String name;
    private String email;
    private AtmCard card;
    private Account account;
    private Address billingAdress;

    public Customer(String name, String email, AtmCard card, Account account, Address billingAdress) {
        this.name = name;
        this.email = email;
        this.card = card;
        this.account = account;
        this.billingAdress = billingAdress;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public AtmCard getCard() {
        return card;
    }

    public Account getAccount() {
        return account;
    }

    public Address getBillingAdress() {
        return billingAdress;
    }
}
