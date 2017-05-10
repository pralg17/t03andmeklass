import java.io.*;
import java.net.*;
public class Uuring{
	String asukoht;
	public Uuring(String asukoht){
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
		int pole=0;
		double maxpikkus=0;
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  double pikkus=Double.parseDouble(m[tulbanr]);
			  if(alustatud){
				  if(pikkus>maxpikkus){maxpikkus=pikkus;}
			  } else {
				  maxpikkus=pikkus;
				  alustatud=true;
			  }
			 } catch(Exception veaandmed){
				 pole++;
			 }
			 rida=lugeja.readLine();
		}
		if(pole>0){System.err.println("Puuudu "+pole);}
		lugeja.close();
		return maxpikkus;
	}

}