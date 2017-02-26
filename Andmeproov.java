import java.io.*;
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring uuring=new Andmeuuring("rahvaarv.txt");
		System.out.println("Kõige suurema rahvaarvuga linn on "+uuring.maksimumLinn(0)+" kus on "+uuring.maksimum(1)+" inimest");
	}
}
