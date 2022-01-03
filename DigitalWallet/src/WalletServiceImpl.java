import java.util.HashMap;
import java.util.Map;

public class WalletServiceImpl implements WalletService{

    private Map<String,Wallet> userToWalletMap;
    public WalletServiceImpl(){
        userToWalletMap = new HashMap<>();
    }

    @Override
    public void createWallet(String userName, double amount) {
        Wallet newWallet = new Wallet(userName,amount);
        userToWalletMap.put(userName,newWallet);
        System.out.println("A new Wallet is created for user :: " + userName);
    }

    @Override
    public Map<String,Wallet> getAllAccountDetails() {
        return this.userToWalletMap;
    }

}
