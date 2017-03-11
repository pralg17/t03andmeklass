import java.io.*;
public class Proov{
	public static void main(String[] args) throws IOException{
		Andmed uuring=new Andmed("rahvaarv.txt");
		System.out.println("\n Minimaalne rahvaarv: " + uuring.miinimum(2));
		System.out.println(" Maksimaalne rahvaarv: " + uuring.maksimum(2) + "\n");
	}
}

/*
[raitkeer@greeny t03andmeklass]$ java Proov
Puuudu 9

 Minimaalne rahvaarv: 1022906
 Maksimaalne rahvaarv: 1570599

[raitkeer@greeny t03andmeklass]$
*/