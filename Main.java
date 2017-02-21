package com.company;
import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.lang.*;
public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Järgneva programmi abil saad andmestikust infot !");

        Scanner scan = new Scanner (System.in);
        System.out.print("Palun sisesta selle kuu number mille kohta anmeid soovid (1-12): ");
            String kuu = scan.next();

        System.out.print("Palun sisesta, kas soovid 'maxtemp' või 'sademed': ");
            String sisend = scan.next();

        BufferedReader lugeja = new BufferedReader(new InputStreamReader(
                new URL("http://www.tlu.ee/~jaagup/andmed/ilm/harkutund.txt").openConnection().getInputStream()
        ));

        String rida = lugeja.readLine();
        rida = lugeja.readLine();

        double maxtemp=-1000;
        double kogusade=0;
        if (sisend.equals("maxtemp")) {

            while (rida != null) {
                String[] m = rida.split(",");
                double temp = Double.parseDouble(m[7]);
                if (m[0].equals(kuu) & temp > maxtemp) {
                    maxtemp = temp;

                }
                rida = lugeja.readLine();
            }
            System.out.println("Vastava kuu maksimum temperatuur oli: "+maxtemp+"°C");
        } else {
            while (rida != null) {
                String[] m = rida.split(",");
                double sademed = Double.parseDouble(m[3]);
                if (m[0].equals(kuu)) {
                    kogusade=kogusade+sademed;
                }
                rida = lugeja.readLine();
            }
            System.out.println("Vastava kuu sademete summa oli: "+Math.round(kogusade)+"mm");

        }

        lugeja.close();
    }
}
/*
Järgneva programmi abil saad andmestikust infot !
Palun sisesta selle kuu number mille kohta anmeid soovid (1-12): 6
Palun sisesta, kas soovid 'maxtemp' või 'sademed': maxtemp
Vastava kuu maksimum temperatuur oli: 27.5°C

Järgneva programmi abil saad andmestikust infot !
Palun sisesta selle kuu number mille kohta anmeid soovid (1-12): 3
Palun sisesta, kas soovid 'maxtemp' või 'sademed': sademed
Vastava kuu sademete summa oli: 28mm
*/
