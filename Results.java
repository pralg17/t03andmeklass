import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Results{
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		Analysis research=new Analysis("http://www.tlu.ee/~tkommus/andmed/linnadTallinnastRivi.txt");

		System.out.println("1.Tartu 2.Narva 3.Pärnu 4.Viljandi 5.Rakvere");
		System.out.println("6.Paide 7.Rapla 8.Haapsalu 9.Võru 10. Valga");

		System.out.println("Sisesta linn (jk.nr): ");
		int jkNr = in.nextInt();
		System.out.println("Praeguste kütusehindadega kulub Sul Tallinnast sihtkohta sõiduks ca "+research.fuelEuros(jkNr-1)+" eurot!");
	}
}
/*
[taankomm@greeny t03andmeklass]$ java Results
1.Tartu 2.Narva 3.Pärnu 4.Viljandi 5.Rakvere
6.Paide 7.Rapla 8.Haapsalu 9.Võru 10. Valga
Sisesta linn (jk.nr):
9
Praeguste kütusehindadega kulub Sul Tallinnast sihtkohta sõiduks ca 20.0 eurot!
*/

/*
[taankomm@greeny t03andmeklass]$ java Results
1.Tartu 2.Narva 3.Pärnu 4.Viljandi 5.Rakvere
6.Paide 7.Rapla 8.Haapsalu 9.Võru 10. Valga
Sisesta linn (jk.nr):
3
Praeguste kütusehindadega kulub Sul Tallinnast sihtkohta sõiduks ca 10.0 eurot!
*/
