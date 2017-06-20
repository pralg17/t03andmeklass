import java.io.*;
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring uuring=new Andmeuuring("juhend.txt");
		System.out.println("Suurim paeva sammude kogus oli: "+uuring.maksimum(1));
		System.out.println("Vaikseim paeva sammude kogus oli: "+uuring.minimum(1));	
	}
}
