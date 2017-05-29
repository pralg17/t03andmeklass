import java.io.*;
public class Andmeproov{
	public static void main(String[] args) throws IOException{
		Andmeuuring uuring=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/muu/maakonnad2012.txt");
		System.out.println("Suurim pindala maakonnas on " + uuring.maksimum(2) + " ja miinimum " + uuring.miinimum(2));
		System.out.println("Suurim rahvaarv maakonnas on " + uuring.maksimum(1) + " ja miinimum " + uuring.miinimum(1));
	}
}
