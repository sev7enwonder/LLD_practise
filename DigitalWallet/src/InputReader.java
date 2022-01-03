import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class InputReader {
    public static List<String> readFromFIle() throws Exception {
        String fileName = System.getProperty("user.dir") +"/DigitalWallet/input.txt";

        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        List<String> commandList = new ArrayList<>();

        String line;
        while((line = br.readLine()) != null){
            //process the line
            commandList.add(line);
        }

        return commandList;
    }
}
