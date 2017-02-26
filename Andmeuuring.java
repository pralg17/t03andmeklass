import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Andmeuuring {
    String asukoht;

    public Andmeuuring(String asukoht) {
        this.asukoht = asukoht;
    }

    BufferedReader kysiLugeja() {
        try {
            if (asukoht.startsWith("http://")) {
                return new BufferedReader(new InputStreamReader(
                        new URL(asukoht).openConnection().getInputStream()));
            } else {
                return new BufferedReader(new FileReader(asukoht));
            }
        } catch (Exception ex) {
            return null;
        }
    }

    /**
     *
     * @return Tagastab Dj, kes sai esimese koha
     * @throws IOException
     */
    public String esimeneKoht() throws IOException {
        BufferedReader lugeja = kysiLugeja();
        lugeja.readLine(); //pealkirjarida
        String rida = lugeja.readLine();
        int puuduvaid = 0;
        String nimi1 = null;
        int min = Integer.MAX_VALUE;
        while (rida != null) {
            String[] m = rida.split(",");
            try {
                int t = Integer.parseInt(m[1]);
                if (t< min){
                    min = t;
                    nimi1 = m[0];

                }


            } catch (Exception veaandmed) {
                puuduvaid++;
            }
            rida = lugeja.readLine();
        }
        if (puuduvaid > 0) {
            System.err.println("Puuudu " + puuduvaid);
        }
        lugeja.close();
        return nimi1;
    }

    /**
     *
     * @return tagastab Dj, kes sai viimase koha.
     * @throws IOException
     */
    public String viimaneKoht() throws IOException {
        BufferedReader lugeja = kysiLugeja();
        lugeja.readLine(); //pealkirjarida
        String rida = lugeja.readLine();
        int puuduvaid = 0;
        String nimi1 = null;
        int max = Integer.MIN_VALUE;
        while (rida != null) {
            String[] m = rida.split(",");
            try {
                int t = Integer.parseInt(m[1]);
                if (t>max){
                    max =t;
                    nimi1 = m[0];
                }


            } catch (Exception veaandmed) {
                puuduvaid++;
            }
            rida = lugeja.readLine();
        }
        if (puuduvaid > 0) {
            System.err.println("Puuudu " + puuduvaid);
        }
        lugeja.close();
        return nimi1;
    }
}