package Entities;

public class Withdrawal extends Transaction{
    private double amount;

    private CashDispenser cashDispenser; // dependency

    public Withdrawal(Account intiator, String transactionId,double amount) {
        super(intiator, transactionId);
        this.amount = amount;
    }

    @Override
    public boolean executeTransaction() {
        double currentamount = intiator.getAvailableBalance();
        intiator.withDrawAmount(amount);
        cashDispenser.dispenseCash(amount);
        return true;
    }
}
