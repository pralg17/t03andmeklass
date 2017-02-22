
import java.io.*;
import java.net.*;
public class Kool{
    String asukoht;
    public Kool(String asukoht){
        this.asukoht = asukoht;
    }
    BufferedReader kysiLugeja(){
        try{
            if(asukoht.startsWith("http://")){
                return new BufferedReader(new InputStreamReader(new URL(asukoht).openConnection().getInputStream()));
            }else{
                return new BufferedReader(new FileReader(asukoht));
            }
        }catch (Exception ex){
            return null;
        }
    }

    public double MituHarjumaa(int tulbanr)throws IOException{
        BufferedReader lugeja = kysiLugeja();
        String rida = lugeja.readLine();
        rida = lugeja.readLine();
        int kokku = 0;
        while(rida != null){
            String[] m = rida.split(",");
            String vald = m[tulbanr];
            if (vald.equals ("Harju maakond")){
                kokku++;
            }
            rida = lugeja.readLine();
        }
        lugeja.close();
        return kokku;

    }
}