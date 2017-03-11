import java.io.*;
import java.net.*;

public class Andmed{
	String asukoht;
	
	public Andmed(String asukoht) {
		this.asukoht=asukoht;
	}
	BufferedReader kysiLugeja() {
		try{
			return new BufferedReader(new FileReader(asukoht));
		} catch(Exception ex) {
			return null;
		}
	}
	
	public int miinimum(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine();
		int puuduvaid = 0;
		int miinimum = 0;
		
		while(rida!=null){
			
			String[] m=rida.split(";");
			
			try{
				int elanikke = Integer.parseInt(m[tulbanr]);
				if(alustatud){
					if (elanikke<miinimum) {miinimum = elanikke;}
				} else {
					miinimum = elanikke;
					alustatud=true;
				}
			} catch(Exception veaandmed){
				puuduvaid++;
			}
			
			rida=lugeja.readLine();
		}
		if(puuduvaid>0){System.err.println("Puuudu "+puuduvaid);}
		lugeja.close();
		
		return miinimum;
	}
	
	public int maksimum(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine();
		int maksimum = 0;
		
		while(rida!=null){
			
			String[] m=rida.split(";");
			
			try{
				int elanikke = Integer.parseInt(m[tulbanr]);
				if(alustatud){
					if (elanikke>maksimum) {maksimum = elanikke;}
				} else {
					maksimum = elanikke;
					alustatud=true;
				}
			} catch(Exception veaandmed){}
			
			rida=lugeja.readLine();
		}

		lugeja.close();
		
		return maksimum;
	}
	
}