import java.io.*;
public class Proov2{
	public static void main(String[] args) throws IOException{
		Read voistlus = new Read("tulemused.txt");
		System.out.println("Suurim hüpatud kaugus spordipäeval oli "+ voistlus.parimTulemus(2)+"meetrit");
		
	}
}