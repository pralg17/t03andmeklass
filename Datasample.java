import java.io.*;

public class Datasample{
	public static void main(String[] args) throws IOException{
		dataAnalyse sample = new dataAnalyse("http://www.tlu.ee/~jaagup/andmed/muu/5klass.txt");
		System.out.println("Kokku on 5. klassis poisse: " +sample.genderQuery(3));
	}
}

//Milleks IOException

/*
[joosjuha@greeny t03andmeklass]$ java Datasample
Kokku on 5. klassis poisse: 17
*/