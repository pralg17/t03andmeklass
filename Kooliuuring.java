import java.io.*;
import java.net.*;
public class Kooliuuring{
	String asukoht;
	public Kooliuuring(String asukoht){
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

public int maksimum(int tulp) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int puuduvaid=0;
		int max=0;
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  int maksimum=Integer.parseInt(m[tulp]);
			  if(alustatud){
				  if(maksimum>max){max=maksimum;}
			  } else {
				  max=maksimum;
				  alustatud=true;
			  }
			 } catch(Exception veaandmed){
				 puuduvaid++;
			 }
			 rida=lugeja.readLine();
		}
		if(puuduvaid>0){System.err.println("Puuudu "+puuduvaid);}
		lugeja.close();
		return max;
	}

public int minimum(int tulp) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int puuduvaid=0;
		int mini=99999;
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  int minimum=Integer.parseInt(m[tulp]);
			  if(alustatud){
				  if(minimum<mini){mini=minimum;}
			  } else {
				  mini=minimum;
				  alustatud=true;
			  }
			 } catch(Exception veaandmed){
				 puuduvaid++;
			 }
			 rida=lugeja.readLine();
		}
		if(puuduvaid>0){System.err.println("Puuudu "+puuduvaid);}
		lugeja.close();
		return mini;
	}


public int linnad(int tulp) throws IOException{
	BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int linn=0;
		while(rida!=null){
			String[] m=rida.split(",");
			String linnad = m[tulp];
			if(linnad.equals ("Tallinn linn")){
				linn++;
		}
		rida = lugeja.readLine();
		
	}
	lugeja.close();
	return linn;
}

}
	