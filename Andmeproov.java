import java.io.*;
import java.net.*;

public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring uuring=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/muu/5klasskabe.txt");
		System.out.println("Kabet oskab " + uuring.kesOskab(1) + " isikut");
		System.out.println("Vaikseim mass on: " + uuring.vaikseimMass(2) + " kg");
	}
/*
VÄLJUND:
Kabet oskab 17 isikut
Vaikseim mass on: 35.0 kg
*/
}
