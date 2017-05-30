import java.io.*;
  public class andmelugemine{
  	public static void main(String[] args) throws IOException{
 		Andmeuuring uuring=new Andmeuuring("http://www.tlu.ee/~jaagup/andmed/muu/eelvoor_gymnaasium.txt");
 		System.out.println("Suurim saadud punktide arv geo ülesandes: "+uuring.punktMax(2));
		System.out.println("Suurim saadud punktide arv klass ülesandes: "+uuring.punktMax(3));
		//System.out.println("Enim jagatud koht oli:  ");
		
  }
  }