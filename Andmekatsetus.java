import java.io.*;
import java.net.*;
public class Andmekatsetus{
	public static void main(String[] args) throws IOException{
		Andmed katsetus=new Andmed("http://www.tlu.ee/~jaagup/andmed/muu/ounad/ounad3_100.txt");
		System.out.println("Suurim diameeter antud andmestikus on: " + katsetus.MaxDiameeter(1) + "cm");
		System.out.println("Antoonovka õunasorti on antud andmestikus kokku: " + katsetus.mituAntoonovka(0));
		System.out.println("Kuldrenett õunasorti on antud andmestikus kokku: " + katsetus.mituKuldrenett(0));
		System.out.println("Liivi sibul õunasorti on antud andmestikus kokku: " + katsetus.mituLiivisibul(0));

	}
}



/*

[karojyrg@greeny t03andmeklass]$ javac *.java
[karojyrg@greeny t03andmeklass]$ java Andmekatsetus
Suurim diameeter antud andmestikus on: 10.63cm
Antoonovka õunasorti on antud andmestikus kokku: 32
Kuldrenett õunasorti on antud andmestikus kokku: 36
Liivi sibul õunasorti on antud andmestikus kokku: 32

*/