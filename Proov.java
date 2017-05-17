import java.io.*;
public class Proov{
	public static void main(String[] args) throws IOException{
		Voistlusprotokoll voistlus = new Voistlusprotokoll("odavise.txt");
		System.out.println("Parim tulemus odaviske võistlusel oli " + voistlus.parimTulemus(2) + " meetrit.");
		
		System.out.println("Kõige kehvem tulemus odavisek võistlustel oli " + voistlus.halvimTulemus(2) + " meetrit.");
	}
}

/*
Programmi töökäik:
> javac Proov.java Voistlusprotokoll.java
> java Proov
Suurim tulemus palliviske võistlusel oli 98 meetrit.
*/