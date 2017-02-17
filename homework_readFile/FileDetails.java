package homework_readFile;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 16-Feb-17.
 */
public class FileDetails {
    String location;

    public FileDetails(String location) {
        this.location = location;
    }

    BufferedReader reader() {
        try {
            if (location.startsWith("http://")) {
                return new BufferedReader(new InputStreamReader(
                        new URL(location).openConnection().getInputStream()));
            } else {
                return new BufferedReader(new FileReader(location));
            }
        } catch (Exception ex) {
            return null;
        }
    }

    public ArrayList<String> readToList() throws IOException {

        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = reader();
        String row = reader.readLine(); //pealkirjarida
        row = reader.readLine();

        while (row != null) {
            list.add(row);
            row = reader.readLine();
        }
        reader.close();

        return list;
    }

    public Double highest() throws IOException {

        double maxhight = 0;
        ArrayList<String> list = readToList();

        for (int i = 0; i < list.size(); i++) {
            String[] items = list.get(i).split(",");
            double hight = Double.parseDouble(items[1]);
            if (hight > maxhight) {
                maxhight = hight;
            }
        }
        return maxhight;
    }

    public ArrayList<String> manyHighest(ArrayList<String> list) throws IOException {

        ArrayList<String> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String[] items = list.get(i).split(",");
            double hight = Double.parseDouble(items[1]);
            if (hight == highest()) {
                temp.add(items[0]);
            }
        }
        return temp;
    }

}