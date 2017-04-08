import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) throws IOException{
		
        System.out.println("Järgneva programmi abil saad andmestikust infot !");

        Scanner scan = new Scanner (System.in);
        System.out.print("Kas soovid välja sorteerida 'm' või 'n'? ");
            String sugu = scan.next();
			

        BufferedReader lugeja = new BufferedReader(new InputStreamReader(
                new URL("http://www.tlu.ee/~jaagup/andmed/muu/5klass.txt").openConnection().getInputStream()
        ));

        String line = lugeja.readLine();
        line = lugeja.readLine();
		
		char gender
		if (sisend.equals("gender")){
			
			while (rida != null){
				String[] m = line.split(".");
				
			}
		}
	}
}