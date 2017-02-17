package homework_readFile;

import tund_2.Array;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 16-Feb-17.
 */
public class mainClass {
    public static void main(String[] args) throws IOException {

        FileDetails details = new FileDetails("http://www.tlu.ee/~jaagup/andmed/muu/5klass.txt");

        // lisame file sisu listisse, kasutame readToList()
        ArrayList<String> file = details.readToList();

        // printime välja faili sisu
        for (int i = 0; i < file.size(); i++) {
            System.out.println(file.get(i));
        }
        /*
        Juku,170,45,m
        Kati,160,35,n
        Mati,160,72,m
        Madis,165,53,m
        Mati,163,60,m
        Katrin,165,43,n
        Siim,141,38,m
        Martin,159,46,m
        Kadri,164,57,n
        Katariina,148,35,n
        Maria,143,38,n
        Marta,169,55,n
        Madis,156,65,m
        Mihkel,165,69,m
        Tiina,170,38,n
        Miia,145,68,n
        Siim,151,55,m
        Priit,156,63,m
        Kristjan,164,59,m
        Kristi,155,53,n
        Kristiina,158,62,n
        Killu,164,49,n
        Mart,170,69,m
        Kert,143,36,m
        Gert,152,67,m
        Lauri,156,53,m
        Moonika,164,58,n
        Jaanika,165,59,n
        Jaanus,164,63,m
        Jaan,162,65,m
        */

        System.out.println("\nKõige pikema inimese kasv on "+details.highest() + "cm");

        // Kõige pikema inimese kasv on 170.0cm

        System.out.println("\nNende nimed on: "+details.manyHighest(file));

       // Nende nimi on: [Juku, Tiina, Mart]

    }
}
