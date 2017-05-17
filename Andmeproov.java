import java.io.*;

public class Andmeproov{

	public static void main(String[] args) throws IOException{
		Andmeuuring uuring = new Andmeuuring("eksamid.txt");
		System.out.println("Yliopilaskoodiga " + uuring.maksimum(2) + " opilane sai koige rohkem punkte eksamil ning punktide arv oli " + uuring.maksimum(3));
	}
}