import java.io.*;
import java.net.*;
public class Andmeuuring{
	String asukoht;
	public Andmeuuring(String asukoht){
		this.asukoht=asukoht;
	}
	BufferedReader kysiLugeja(){
	  try{
		if(asukoht.startsWith("http://")){
			return new BufferedReader(new InputStreamReader(
			   new URL(asukoht).openConnection().getInputStream()));
		}
		else {
			return new BufferedReader(new FileReader(asukoht));
		}
	  } catch(Exception ex){
		  return null;
	  }
	}
	public double suurimSort(int mitmendasttulbast) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine(); //pealkirjarida
		rida=lugeja.readLine();
		int puuduvaid=0;
		double suurimsort=0;
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  double suurim=Double.parseDouble(m[mitmendasttulbast]);
			  if(alustatud){
				  if(suurim>suurimsort){suurimsort=suurim;}
			  } else {
				  suurimsort=suurim;
				  alustatud=true;
			  }
			 } catch(Exception veaandmed){
				 puuduvaid++;
			 }
			 rida=lugeja.readLine();
		}
		if(puuduvaid>0){System.err.println("Väärtused, mis on puudu "+puuduvaid);}
		lugeja.close();
		return suurimsort;
	}
		public int mituAntoonovkat(int mitmendasttulbast) throws IOException{
 		BufferedReader lugeja=kysiLugeja();
 		String rida=lugeja.readLine();
 		rida=lugeja.readLine();
 		int mituAntoonovkat = 0;


 		while(rida != null){
 			String[] m = rida.split(",");
 			String kontroll_m = m[mitmendasttulbast];
 			if(kontroll_m.equals ("Antoonovka")){
 				mituAntoonovkat++;
 			}

 			rida = lugeja.readLine();
 		}
 		lugeja.close();
 		return mituAntoonovkat;
 	}
}


	/*
[heinparn@greeny t03andmeklass]$ javac *.java
[heinparn@greeny t03andmeklass]$ java Proov1
Andmete hulgast suurim õunasort on 10.63
Antoonovkaid oli andmehulgas: 32
*/
