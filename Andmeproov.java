import java.io.*;
public class Andmeproov{
    public static void main(String[] args) throws IOException{
        Andmeuuring uuring=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/sots/synnid.csv");
        System.out.println(uuring.maxSynnid(1));
    }
}