import java.io.*;
import java.net.*;
public class Ounauuring{
	String asukoht;
	public Ounauuring(String asukoht){
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
	public double suurimoun(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine(); //pealkirjarida
		rida=lugeja.readLine();
		int puuduvaid=0;
		double suurimoun=0;
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  double temperatuur=Double.parseDouble(m[tulbanr]);
			  if(alustatud){
				  if(temperatuur>suurimoun){suurimoun=temperatuur;}
			  } else {
				  suurimoun=temperatuur;
				  alustatud=true;
			  }
			 } catch(Exception veaandmed){
				 puuduvaid++;
			 }
			 rida=lugeja.readLine();
		}
		
		if(puuduvaid>0){System.err.println("Puuudu "+puuduvaid);}
		lugeja.close();
		return suurimoun;
	}
		
		
	/*Suurima diameetriga õun on 10.63 cm.*/ 
	
}