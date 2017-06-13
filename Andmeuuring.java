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
	public double maksimum(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int puuduvaid=0;
		double maxSkoor=0;
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  double skoor=Double.parseDouble(m[tulbanr]);
			  if(alustatud){
				  if(skoor>maxSkoor){maxSkoor=skoor;}
			  } else {
				  maxSkoor=skoor;
				  alustatud=true;
			  }
			 } catch(Exception veaandmed){
				 puuduvaid++;
			 }
			 rida=lugeja.readLine();
		}
		if(puuduvaid>0){System.err.println("Puuudu "+puuduvaid);}
		lugeja.close();
		return maxSkoor;
	}
	
}