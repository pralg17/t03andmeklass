import java.io.*;
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring uuring=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/ilm/harkutund.txt");
		System.out.println("Tunnis keskmise maksimum " +uuring.maksimum(5));
		System.out.println("Tunnis keskmise miinimum " +uuring.miinimum(5));
		System.out.println("Tunni miinimumi väikseim " +uuring.miinimum(6));
		System.out.println("Tunni miinimumi suurim " +uuring.maksimum(6));
	}
}
