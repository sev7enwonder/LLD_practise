import java.util.ArrayList;
import java.util.List;

public class Wallet {
    private String userName;
    private double amount;
    private List<Transaction> transactionList;

    public double getAmount() {
        return amount;
    }

    public Wallet(String userName, double amount) {
        this.userName = userName;
        this.amount = amount;
        transactionList = new ArrayList<>();
    }

    public void addMoneyInWallet(double amount){

    }

    public void withDrawMoneyFromWallet(double amount){
    }

}
