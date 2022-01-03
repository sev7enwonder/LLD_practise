import java.util.Map;

public interface WalletService {
    void createWallet(String userName,double amount);
    Map<String,Wallet> getAllAccountDetails();
}
