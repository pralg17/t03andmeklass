import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		
		Data file = new Data("metal_bands_2017.csv");
		System.out.println(file.findFromTable(Integer.parseInt(args[0])));
		
	}
}