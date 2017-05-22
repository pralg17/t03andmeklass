import java.io.*;
import java.net.*;
public class Test{
	public static void main(String[] args) throws IOException{
		Data forTesting=new Data("http://www.tlu.ee/~jaagup/andmed/muu/ounad/ounad1000.txt");
    System.out.println("Apple sorts:");
		System.out.println("Kuldrenett: " + forTesting.kuldrenettCount(0));
		System.out.println("Liivi sibul: " + forTesting.liiviCount(0));
    System.out.println("\nStatistics");
    System.out.println("Biggest Diameter: " + forTesting.Diameter(1, "max") + "cm");
    System.out.println("Smallest Diameter: " + forTesting.Diameter(1, "min") + "cm");

	}
}
