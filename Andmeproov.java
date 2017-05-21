import java.io.*;
import java.net.*;
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeklass proov=new Andmeklass("http://www.tlu.ee/~jaagup/andmed/muu/5klass.txt");
		System.out.println("Suurima massiga õpilane kaalub: " + proov.suurimMass(2) + "kg.");
		System.out.println("Kõige pikem õpilane on : " + proov.pikim(1) + "cm pikk.");
		System.out.println("Poisse on viiendas klassis kokku: " + proov.poisid(3));
		System.out.println("Tüdrukuid on viiendas klassis kokku: " + proov.tudrukud(3));
	}
}

/*

C:\Users\User\java\03>java Andmeproov

Suurima massiga õpilane kaalub: 72.0kg.
Kõige pikem õpilane on : 170.0cm pikk.
Poisse on viiendas klassis kokku: 17
Tüdrukuid on viiendas klassis kokku: 13

*/