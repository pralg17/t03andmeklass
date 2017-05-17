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

	public int maksimum(int tulbanr) throws IOException{

		BufferedReader lugeja = kysiLugeja();
		boolean alustatud = false;
		String rida = lugeja.readLine(); //pealkirjarida
		rida = lugeja.readLine();
		int maksimum = 0;

		while(rida != null){
			String[] m=rida.split(",");
			 	try{
			  		int eksamitulemus=Integer.parseInt(m[tulbanr]);
			  		if(alustatud){
				  		if(eksamitulemus>maksimum){maksimum=eksamitulemus;}
			  		} else {
				  		maksimum=eksamitulemus;
				  		alustatud=true;
			  		}
			 	} catch(Exception veaandmed){}

			rida=lugeja.readLine();
		}

		lugeja.close();
		return maksimum;
	}
	
	
}









/*	
	public String nimi (int tulbanr) throws IOException{

		BufferedReader lugeja = kysiLugeja();
		boolean alustatud = false;
		String rida = lugeja.readLine(); //pealkirjarida
		rida = lugeja.readLine();
		String maksimum;

		while(rida != null){
			String[] m=rida.split(",");
			 	try{
			  		String eksamitulemus= m[tulbanr];
			  		
			  		
				  		maksimum=eksamitulemus;
				  		
			  		
			 	} catch(Exception veaandmed){}

			rida=lugeja.readLine();
		}

		lugeja.close();
		return maksimum;
	}
*/



