package Entities;

public class BalanceEnquiry extends Transaction{

    public BalanceEnquiry(Account intiator, String transactionId) {
        super(intiator, transactionId);
    }

    @Override
    public boolean executeTransaction() {
        double amount = intiator.getAvailableBalance();
        System.out.println("total amount is :: " + amount);
        return true;
    }
}
