import java.io.*;
import java.net.*;



public class Data{
	String asukoht;
	public Data(String asukoht){
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
	
	public double maxCap(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine(); //pealkirjarida
		rida=lugeja.readLine();
		int puuduvaid=0;
		double marketCap=0;
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  double cap=Double.parseDouble(m[tulbanr]);
			  if(alustatud){
				  if(cap>marketCap){marketCap=cap;}
			  } else {
				  marketCap=cap;
				  alustatud=true;
			  }
			 } catch(Exception veaandmed){
				 puuduvaid++;
			 }
			 rida=lugeja.readLine();
		}
		if(puuduvaid>0){System.err.println("Puuudu "+puuduvaid);}
		lugeja.close();
		return marketCap;
	}
	
}
