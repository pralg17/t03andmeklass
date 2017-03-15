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
	public double punktMax(int mitmes) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine(); //pealkirjarida
		rida=lugeja.readLine();
		int puuduvaid=0;
		double punktMax=0;
		while(rida!=null){
			String[] m=rida.split(",");
			
			 try{
				 
				double punktid=Double.parseDouble(m[mitmes]);
				if(alustatud){	
					if(punktid>maxpunktid){
						maxpunktid=punktid;
						}
				} else {
					maxpunktid=punktid;
					alustatud=true;
				}
			 } catch(Exception veaandmed){
				 puuduvaid++;
			 }
			 rida=lugeja.readLine();
		}
		if(puuduvaid>0){System.err.println("Puudu "+puuduvaid);}
		lugeja.close();
		return maxpunkt;
	}
	
}


	/*public int jagatud(int mitmes) throws IOException{
 		BufferedReader lugeja=kysiLugeja();
 		String rida=lugeja.readLine(); //pealkirjarida
 		rida=lugeja.readLine();
		int element=0;
		int count=0;
		for (int j=0; j<mitmes.length; j++){
			int tempElement = mitmes[0];
			int tempCount=0;
			for (int p=0; p<mitmes.length;p++)
				tempCount++;
			if (tempCount>count){
				element = tempElement;
				count= tempCount;
				
			}
			
		}
			 rida=lugeja.readLine();
			
				
		}
	}*/
	
