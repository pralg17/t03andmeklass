import java.io.*;
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring uuring=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/ilm/harkutund.txt");
		System.out.println("Maksimum temperatuur on: "+uuring.maksimum(5));
		System.out.println("Minimum temperatuur on: "+uuring.minimum(5));
		System.out.println("Uuringute keskmine temp on: "+(uuring.maksimum(5))/(uuring.minimum(5)));
	}
}
