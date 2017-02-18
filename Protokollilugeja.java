import java.io.*;
public class Protokollilugeja{
	public static void main(String[] args) throws IOException{
		Voistlusprotokoll voistlus=new Voistlusprotokoll("pallivise.txt");
		System.out.println("Suurim tulemus palliviske võistlusel oli " + voistlus.suurimTulemus(2) + " meetrit.");
	}
}

/*

Programmi töökäik:

> javac Protokollilugeja.java Voistlusprotokoll.java
> java Protokollilugeja

Suurim tulemus palliviske võistlusel oli 98 meetrit.

*/
