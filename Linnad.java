public class Linnad {

    String asukoht;
    public Linnad(String asukoht){
        this.asukoht=asukoht;
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


    public int maksimum(int tulbanr) throws IOException {
        BufferedReader lugeja = kysiLugeja();
        boolean alustatud = false;
        String rida = lugeja.readLine(); //pealkirjarida
        rida = lugeja.readLine();
        int puuduvaid = 0;
        int maxElanikud = 0;
        while (rida != null) {
          //  System.out.println(rida);
            String[] m = rida.split(", ");
            try {
                System.out.println(m[tulbanr]);
                int elanikud = Integer.parseInt(m[tulbanr]);
                if (alustatud) {
                    if (elanikud > maxElanikud) {
                        elanikud = maxElanikud;}
                    } else {
                        maxElanikud = elanikud;
                        alustatud = true;
                    }
                }
                catch(Exception veaandmed){
                    puuduvaid++;
                }
                rida = lugeja.readLine();
            }
            if (puuduvaid > 0) {
                System.err.println("Puuudu " + puuduvaid);
            }
            lugeja.close();
            return maxElanikud;


        }

    public int minimum(int tulbanr) throws IOException {
        BufferedReader lugeja = kysiLugeja();
        boolean alustatud = false;
        String rida = lugeja.readLine(); //pealkirjarida
        rida = lugeja.readLine();
        int puuduvaid2 = 0;
        int minElanikud = 10000000;
        while (rida != null) {
            String[] m = rida.split(", ");
            try {
                int elanikud = Integer.parseInt(m[tulbanr]);
                System.out.println(m[tulbanr]);

                //if (alustatud) {
                    if (elanikud < minElanikud) {
                        minElanikud = elanikud;
                    //} else {
                       // minElanikud = elanikud;
                       // alustatud = true;
                    }
                //}
            } catch(Exception veaandmed){
                puuduvaid2++;
            }
            rida = lugeja.readLine();
        }
        if (puuduvaid2 > 0) {
            System.err.println("Puuudu " + puuduvaid2);
        }
        lugeja.close();
        return minElanikud;


    }
    }
