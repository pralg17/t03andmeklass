import java.io.*;

public class Andmed{
	public static void main(String[] args) throws IOException{
		Uuring uuring=new Uuring("http://www.tlu.ee/~jaagup/andmed/muu/5klass.txt");
		
		System.out.println("Pikim �pilane on: "+uuring.maksimum(1)+"cm.");
		
		System.out.println("Suurima massiga �pilane on:  "+uuring.maksimum(2)+"kg.");
		
	}
}

//Pikim �pilane on: 170.0cm.
//Suurima massiga �pilane on:  72.0kg.