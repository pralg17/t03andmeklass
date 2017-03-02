import java.io.*;
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring uuring=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/muu/5klass.txt");
		System.out.println("Koige madalama kasvu on: "+uuring.minimum(0, 1));
		System.out.println("Kõige suurima kehakaaluga on: "+uuring.maksimum(0, 2));
	}
}
/*
Koige madalama kasvu on: [Siim, 141.0]
Kõige suurima kehakaaluga on [Mati, 72.0]
*/