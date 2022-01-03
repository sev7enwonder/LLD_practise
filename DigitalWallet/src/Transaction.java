public class Transaction {
    String payee,payer;
    double amount;

    public Transaction(String payee, String payer, double amount) {
        this.payee = payee;
        this.payer = payer;
        this.amount = amount;
    }
}
