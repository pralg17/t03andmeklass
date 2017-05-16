import java.io.*;
public class proov{
	public static void main(String[] args) throws IOException{
		uuring uuring=new uuring("http://www.tlu.ee/~jaagup/andmed/muu/maakonnad2012.txt");
		System.out.println("Suurim rahvaarv on: "+uuring.maksimum(1));
		System.out.println("Suurim pindala on: "+uuring.maksimum(2));
	}
}

//[ingomagi@greeny t03]$ java proov
//Suurim rahvaarv on: 552927.0
//Suurim pindala on: 4807.0