
 import java.io.*;
 public class Raamatukogud{
 	public static void main(String[] args) throws IOException{
 		reader uuring=new reader("Andmed.txt");
 		System.out.println("---------------------------------");
		System.out.println("Suurima rahvaarvuga asukoht :");
 		System.out.println(uuring.maksimum(0,1,2));
		System.out.println("---------------------------------");
		System.out.println("Suurima rahvaarvuga lugejaskonnaga :");
 		System.out.println(uuring.maksimum(0,1,5));
		System.out.println("---------------------------------");
		System.out.println("Kõige rohkem raamatukogusi:");
 		System.out.println(uuring.maksimum(0,1,3));
		System.out.println("---------------------------------");
		System.out.println("Kõige suurem raamatufond:");
 		System.out.println(uuring.maksimum(0,1,4));
 	}
 }
 
/*

[kristarn@greeny t03andmeklass]$ java Raamatukogud
---------------------------------
Suurima rahvaarvuga asukoht :
[Tallinn, linn, 423420]
---------------------------------
Suurima rahvaarvuga lugejaskonnaga :
[Tallinn, linn, 70026]
---------------------------------
Kõige rohkem raamatukogusi:
[Tallinn, linn, 18]
---------------------------------
Kõige suurem raamatufond:
[Tallinn, linn, 995351]
[kristarn@greeny t03andmeklass]$

*/