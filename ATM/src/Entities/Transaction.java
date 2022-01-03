package Entities;

public abstract class Transaction {
    public enum TransactionStatus {
        SUCCESS,FAILURE,PENDING
    }
    protected Account intiator;
    protected String transactionId;
    protected TransactionStatus transactionStatus;

    public Transaction(Account intiator, String transactionId) {
        this.intiator = intiator;
        this.transactionId = transactionId;
    }

    public abstract boolean executeTransaction();

    public TransactionStatus getTransactionStatus() {
        return transactionStatus;
    }
}

