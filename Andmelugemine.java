import java.io.*;
  public class Andmelugemine{
  	public static void main(String[] args) throws IOException{
 		Andmeuuring uuring=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/muu/eelvoor_gymnaasium.txt");
 		System.out.println("Suurim saadud punktide arv geo �lesandes: "+uuring.punktMax(2));
		System.out.println("Suurim saadud punktide arv klass �lesandes: "+uuring.punktMax(3));
		//System.out.println("Enim jagatud koht oli:  ");
		
  }
  }