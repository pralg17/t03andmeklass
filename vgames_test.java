import java.io.*;
public class vgames_test{
	public static void main(String[] args) throws IOException{
		vgames salesAnalysis=new vgames("vgames.txt");
		System.out.println("K6ige rohkem oli ara muudud Wii Sports : " + salesAnalysis.biggestSales(6) + " yhiku.");
	}
}

/*
[edgaseli@greeny t03andmeklass]$ java vgames_test
K6ige rohkem oli ara muudud Wii Sports : 41.49 yhiku.
*/