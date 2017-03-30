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
		String rida=lugeja.readLine(); //pealkirjarida
		rida=lugeja.readLine();
		int puuduvaid=0;
		double max=0;
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  double arv=Double.parseDouble(m[tulbanr]);
			  if(alustatud){
				  if(arv>max){max=arv;}
			  } else {
				  max=arv;
				  alustatud=true;
			  }
			 } catch(Exception veaandmed){
				 puuduvaid++;
			 }
			 rida=lugeja.readLine();
		}
		if(puuduvaid>0){System.err.println("Puudu "+puuduvaid);}
		lugeja.close();
		return max;
	}
	
	public double miinimum(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine(); //pealkirjarida
		rida=lugeja.readLine();
		int puuduvaid=0;
		double min=99999999;
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  double arv=Double.parseDouble(m[tulbanr]);
			  if(alustatud){
				  if(arv<min){min=arv;}
			  } else {
				  min=arv;
				  alustatud=true;
			  }
			 } catch(Exception veaandmed){
				 puuduvaid++;
			 }
			 rida=lugeja.readLine();
		}
		if(puuduvaid>0){System.err.println("Puudu "+puuduvaid);}
		lugeja.close();
		return min;
	}
	
}
