import java.io.*;

public class rakendus{
	
	public static void main(String[] args) throws IOException{
		
		uuring uuring=new uuring("andmed.txt");
		System.out.println(uuring.kaalutud_keskmine());
	}
}