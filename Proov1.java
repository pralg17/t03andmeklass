import java.io.*;

public class Proov1{
	
	public static void main(String[] args) throws IOException{
		
		Lugeja voistlus = new Lugeja("andmed.txt");
		System.out.println("Halvim 60m tulemus oli "+ voistlus.halvimTulemus(1)+"sekundit");
		
	}
	
}

//[georvalg@greeny t03andmeklass]$ java Proov1
//Halvim 60m tulemus oli 13.25sekundit
