import java.io.*;
public class ASXInfo_run{
	public static void main(String[] args) throws IOException{
		Data marketCap=new Data("andmed.txt");
		
		System.out.println(marketCap.maxCap(4) + " Turuväärtus");
	}
}
