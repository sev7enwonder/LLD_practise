import java.util.List;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        try {
            List<String> commandList = InputReader.readFromFIle();

            WalletService walletService = new WalletServiceImpl();

            for(String command : commandList){
                String[] splitCommand = command.split(" ");

                if(splitCommand[0].equals("CreateWallet")){
                    walletService.createWallet(splitCommand[1],Double.parseDouble(splitCommand[2]));
                }

                if(splitCommand[0].equals("Overview")){
                    Map<String,Wallet> WalletDetails = walletService.getAllAccountDetails();

                    for(Map.Entry<String,Wallet> entry : WalletDetails.entrySet()){
                        System.out.println(entry.getKey() + " " + entry.getValue().getAmount());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
