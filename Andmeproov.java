import java.io.*;
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring uuring=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/muu/eelvoor_gymnaasium.txt");
		System.out.println("Suurim skoor gymnaasiumi eelvoorus oli " + uuring.maksimum(5));
	}
}
//Suurim skoor gymnaasiumi eelvoorus oli 90.0