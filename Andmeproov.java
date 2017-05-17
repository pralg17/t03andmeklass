import java.io.*;
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring koolid=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/muu/koolid2014.txt");
		System.out.println("Koige vaiksemas koolis on "+koolid.minarv(4)+" opilast");
	}
}


//Koige vaiksemas koolis on 3.0 opilast