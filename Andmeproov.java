import java.io.*;
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring uuring=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/muu/kalevikommid.txt");
		for(String arg: args){
			System.out.println(uuring.maximum(Integer.parseInt(arg)));
		}
		
		
	}
}