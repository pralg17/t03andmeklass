import java.io.*;
public class Proov1{
	public static void main(String[] args) throws IOException{
		Andmeuuring andmeuuring=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/muu/ounad/ounad3_100.txt");
		System.out.println("Andmete hulgast suurim õunasort on "+andmeuuring.suurimSort(1));
		System.out.println("Antoonovkaid oli andmehulgas: " + andmeuuring.mituAntoonovkat(0));
	}
}
