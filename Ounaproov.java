import java.io.*;
public class Ounaproov{
	public static void main(String[] args) throws IOException{
		Ounauuring uuring=new Ounauuring("http://www.tlu.ee/~jaagup/andmed/muu/ounad/ounad3_100.txt");
		System.out.println("Suurima diameetriga õun on "+uuring.suurimoun(1)+" cm.");
		
	}
}