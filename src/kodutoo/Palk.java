package kodutoo;
import java.io.*;
import java.util.*;
import java.util.ArrayList;


/**
 * Created by AASA on 20.02.2017.
 */
public class Palk {
    String line = "";
    List<String> data = new ArrayList<String>();
    BufferedReader br = null;
    public Palk(String fileLocation){
        try{
            br = new BufferedReader(new FileReader(fileLocation));
            while ((line = br.readLine()) != null){
                data.add(Arrays.toString(line.split(",")));
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (br != null){
                try{
                    br.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public double average(){
        double average = 0.00;
        for(int i=0; i<data.size()-1; i++){
            String[] line = data.get(i).split(",");
            String money = line[2].replace("]", "");
            average += Double.parseDouble(money);
        }
        return average/data.size();
    }

    public String minMax(String type){
        double max = 0.00;
        Double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i<data.size()-1; i++){
            String[] line = data.get(i).split(",");
            String money = line[2].replace("]", "");
            Double moneyD = Double.parseDouble(money);

            if (type == "min"){
                if (moneyD < min){
                    min = moneyD;
                    index = i;
                }
            } else if (type == "max"){
                if (moneyD > max){
                    max = moneyD;
                    index = i;
                }
            } else {
                throw new RuntimeException("minMax argument can only be 'min' or 'max'! ");
            }

        }
        String[] results = data.get(index).split(",");
        String firstName = results[0].replace("[", "");
        String lastName = results[1];
        String wage = results[2].replace("]", "");

        return firstName + "," + lastName +"," + wage;
    }
}
