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
	public double MaxVanus(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine(); //pealkirjarida
		rida=lugeja.readLine();
		int puuduvaid=0;
		double maxv=0;
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  double maksimum=Double.parseDouble(m[tulbanr]);
			  if(alustatud){
				  if(maksimum>maxv){maxv=maksimum;}
			  } else {
				  maxv=maksimum;
				  alustatud=true;
			  }
			 } catch(Exception veaandmed){
				 puuduvaid++;
			 }
			 rida=lugeja.readLine();
		}
		if(puuduvaid>0){System.err.println("Puuudu "+puuduvaid);}
		lugeja.close();
		return maxv;
	}
	public int MituVanurit(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int mituVan = 0;
		while(rida != null){
			String[] m = rida.split(",");
			String kontrollm = m[tulbanr];
 			if(kontrollm.equals ("100")){
 				mituVan++;
 			}
 			rida = lugeja.readLine();
 		}
 		lugeja.close();
 		return mituVan;
 	}
	public int MituMeest(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int mituM = 0;
		while(rida != null){
			String[] m = rida.split(",");
			String kontrollm = m[tulbanr];
 			if(kontrollm.equals ("Male")){
 				mituM++;
 			}
 			rida = lugeja.readLine();
 		}
 		lugeja.close();
 		return mituM;
 	}
	public int MituNaist(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int mituN = 0;
		while(rida != null){
			String[] m = rida.split(",");
			String kontrollm = m[tulbanr];
 			if(kontrollm.equals ("Female")){
 				mituN++;
 			}
 			rida = lugeja.readLine();
 		}
 		lugeja.close();
 		return mituN;
 	}
	
}
