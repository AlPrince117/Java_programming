import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;
import java.io.File;

public class Trades {
    private ArrayList<Trade> trades = new ArrayList<>();
    public void populateTrades(String fname){
        try {
            File tradeObj = new File(fname);
            Scanner myReader = new Scanner(tradeObj);
            while (myReader.hasNextLine()) {
                String lineData = myReader.nextLine();
                Scanner data = new Scanner(lineData).useDelimiter(",");
                ArrayList<String> info = new ArrayList<>();
                while(data.hasNext()){
                    info.add(data.next());
                }
                LocalTime time = LocalTime.ofNanoOfDay(Long.parseLong(info.get(2))*1000000);
                trades.add(new Trade(info.get(0),info.get(0),Double.parseDouble(info.get(3)),Double.parseDouble(info.get(4)),time));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public Optional<ArrayList<Trade>> getTrades() {
        return Optional.ofNullable(trades);
    }
}

