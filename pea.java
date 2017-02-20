
import java.io.*;
public class pea{
	public static void main(String[] args) throws IOException{
		reader uuring=new reader("money.csv");
		System.out.println("Suurima palgaga töötaja:");
		System.out.println(uuring.maksimum(1,2,3));
	}
}

/*

[gregness@greeny t03andmeklass]$ java pea
Suurima palgaga töötaja:
[Deborah, Webb, 986.09]


*/