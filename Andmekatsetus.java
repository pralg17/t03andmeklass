import java.io.*;
import java.net.*;
public class Andmekatsetus{
	public static void main(String[] args) throws IOException{
		Andmed katsetus=new Andmed("http://www.tlu.ee/~jaagup/andmed/muu/5klasskabe.txt");
		System.out.println("Suurim mass antud andmestikus on: " + katsetus.MaxMass(2) + "kg");
		System.out.println("Suurim pikkus antud andmestikus on: " + katsetus.MaxPikkus(1) + "cm");
		System.out.println("Poisse on antud andmestikus kokku: " + katsetus.MituPoissi(3));
		System.out.println("Tüdrukuid on antud andmestikus kokku: " + katsetus.MituTüdrukut(3));
	}
}



/*

[krisliiv@greeny t03andmeklass]$ java Andmekatsetus
Suurim mass antud andmestikus on: 72.0kg
Suurim pikkus antud andmestikus on: 170.0cm
Poisse on antud andmestikus kokku: 17
Tüdrukuid on antud andmestikus kokku: 13

*/