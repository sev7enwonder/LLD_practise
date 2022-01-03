package Entities;

import java.util.Date;

public class AtmCard {
    public enum CardStatus {
        ACTIVE, BLOCKED, COMPROMISED, ACCOUNT_CLOSED, NOT_YET_ACTIVATED
    }
    private String cardNumber;
    private Customer customer;
    private Date expirationDate;
    private int pin;
    private int cvv;
    private CardStatus status;

    public AtmCard(String cardNumber, Customer customer, Date expirationDate, int pin, int cvv, CardStatus status) {
        this.cardNumber = cardNumber;
        this.customer = customer;
        this.expirationDate = expirationDate;
        this.pin = pin;
        this.cvv = cvv;
        this.status = CardStatus.NOT_YET_ACTIVATED;
    }

    public void getActivateCard(){
        this.status = CardStatus.ACTIVE;
    }

    public void getBlockedCard(){
        this.status = CardStatus.BLOCKED;
    }

    public void markAsCompromised(){
        this.status = CardStatus.COMPROMISED;
    }

    public void markAsClosed(){
        this.status = CardStatus.ACCOUNT_CLOSED;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public int getPin() {
        return pin;
    }

    public int getCvv() {
        return cvv;
    }

    public CardStatus getStatus() {
        return status;
    }
}
