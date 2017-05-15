import java.io.*;
public class proov03{
	public static void main(String[] args) throws IOException{
		kodutoo03 uuring=new kodutoo03("http://www.tlu.ee/~jaagup/andmed/muu/koolid2014.txt");
		System.out.println("Suurim opilaste arv on " + uuring.maks(4) + " opilasi.");
		System.out.println("Tartus on " + uuring.mituLinn(2) + " kooli.");
	}
}
