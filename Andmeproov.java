import java.io.*;
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring uuring=new Andmeuuring("people.txt");
		System.out.println("Kõige vanemad inimesed antud andmestikus on " + uuring.MaxVanus(4) +" aastased. " + "Neid on seal kokku " + uuring.MituVanurit(4) + " tükki");
		System.out.println("Mehi on antud andmestikus kokku: " + uuring.MituMeest(3));
		System.out.println("Naisi on antud andmestikus kokku: " + uuring.MituNaist(3));
	}
}
/*
[siimhtus@greeny t03andmeklass]$ java Andmeproov
Kõige vanemad inimesed antud andmestikus on 100.0 aastased. Neid on seal kokku 15 tükki
Mehi on antud andmestikus kokku: 479
Naisi on antud andmestikus kokku: 521

*/
