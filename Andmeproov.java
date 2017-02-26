import java.io.IOException;

public class Andmeproov {
    public static void main(String[] args) throws IOException {
        Andmeuuring uuring=new Andmeuuring("Djd.txt");
        System.out.println("esimeseks j2i aastal 2016: " +uuring.esimeneKoht());
        System.out.print("viimaseks j2i aastal 2016: " + uuring.viimaneKoht());
    }
}