import java.io.*;
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring uuring=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/muu/5klass.txt");
		System.out.println("Kõige pikima õpilase pikkus on "+uuring.maksimum(1)+"cm.");
		System.out.println("Kõige suurema massiga õpilase mass on "+uuring.maksimum(2)+"kg.");
	}
}
