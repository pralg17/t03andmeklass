import java.io.*;
public class Koolid{
	public static void main(String[] args) throws IOException{
		Kooliuuring uuring=new Kooliuuring("http://www.tlu.ee/~jaagup/andmed/muu/koolid2014.txt");
		System.out.println("Suurim opilaste arv on " + uuring.maksimum(4) + " opilasi.");
		System.out.println("Madala opilaste arv on " + uuring.minimum(4) + " opilasi.");
		System.out.println("Tallinnas on " + uuring.linnad(2) + " kooli.");
	}
}