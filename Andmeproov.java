import java.io.*;
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring uuring=new Andmeuuring("sademed.txt");	
		System.out.println("Kõige rohkema sademete arvuga linn 10 aasta jooksul on "+uuring.maksimumLinn(0)+" kus on "+uuring.maksimum(1)+" mm sademeid sajanud");
	}
}
