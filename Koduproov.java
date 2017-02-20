import java.io.*;
public class Koduproov{
	public static void main(String[] args) throws IOException{
		Koduuuring uuring=new Koduuuring("http://www.tlu.ee/~jaagup/andmed/muu/koolid2014.txt");
		System.out.println("Suurim opilaste arv on " + uuring.maks(4) + " opilasi.");
		System.out.println("Tartus on " + uuring.mituLinn(2) + " kooli.");
	}
}
/* 
[annagubs@greeny t03andmeklass]$ java Koduproov
Suurim opilaste arv on 1599 opilasi.
Tartus on 26 kooli.
*/
