import java.io.*;
import java.net.*;
public class kodutoo03{
	String asukoht;
	public kodutoo03(String asukoht){
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
public int maks(int tulp) throws IOException{
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


public int mituLinn(int tulp) throws IOException{
	BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int linn=0;
		while(rida!=null){
			String[] m=rida.split(",");
			String mitulinn = m[tulp];
			if(mitulinn.equals ("Tartu linn")){
				linn++;
		}
		rida = lugeja.readLine();
		
	}
	lugeja.close();
	return linn;
}

}
	