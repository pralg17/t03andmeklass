import java.io.*;
public class FailiLugemine{
	
	//keskmine kinnisvara myygi/ostuhind
	public static double keskmine(double eur, double tehing){
		return (eur * Math.pow(10, 6)) / tehing;
	}
	
	public static void main(String[] args) throws IOException{
		Fail fail = new Fail("kinnisvara_ost_myyk.txt");
		String aasta = "2016";
		
		//Mis aastal k6ige rohkem/vahem kinnisvaratehinguid
		int[] maksMinTehinguid = fail.maxMinArv();
		//System.out.println(fail.maxMinArv()[0] + " " + fail.maxMinArv()[1]);
		
		//Palju kinnisvaratehinguid ja mis summas tehti etteantud aastal, 
		double[] aastasTehinguid = fail.tehinguidAastas(aasta);
		
		
		
		
		System.out.printf("K6ige rohkem kinnisvaratehinguid: %s (%s), k6ige vahem: %s (%s)", 
		maksMinTehinguid[0], maksMinTehinguid[1], maksMinTehinguid[2], maksMinTehinguid[3] ); 
		System.out.println();
		System.out.printf("%sa: %.1f tehingut, summa kokku: %.1f milj. eurot, keskmine tehingu hind: %.1f eurot", 
		aasta, aastasTehinguid[0], aastasTehinguid[1], keskmine(aastasTehinguid[1], aastasTehinguid[0]));
	}
}

/*
Kinnisvara ost/myyk 1998 -2016

[karinrik@greeny t03andmeklass]$ java FailiLugemine
K6ige rohkem kinnisvaratehinguid: 2006 (60208), k6ige vahem: 1998 (6918)
2016a: 47204.0 tehingut, summa kokku: 2785.1 milj. eurot, keskmine tehingu hind: 59001.4 eurot[ 
*/