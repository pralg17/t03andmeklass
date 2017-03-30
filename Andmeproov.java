import java.io.*;

public class Andmeproov{

	public static void main(String[] args) throws IOException{
		Andmeuuring uuring = new Andmeuuring("countries.txt");
		System.out.println("Suurim rahvaarv: " + uuring.maksimum(3));
	}
}