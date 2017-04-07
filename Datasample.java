import java.io.*;
public class Datasample{
	public static void main(String[] args) throws IOException{
		Datareader uuring=new Datareader("http://www.tlu.ee/~jaagup/andmed/muu/kalevikommid.txt");
		//Iga käsurea argumendi jaoks tekitab print lause
		for(String arg: args){
			System.out.println(uuring.maximum(Integer.parseInt(arg)));
		}
		
		
	}
}
