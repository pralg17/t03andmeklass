import java.io.*;
public class LugemisProov{
	public static void main(String[] args) throws IOException{
		Andmelugeja voistlus = new Andmelugeja("andmed.txt");
		System.out.println("Halvim tulemus oli "+ voistlus.halvimTulemus(2)+"meetrit");
	}
}