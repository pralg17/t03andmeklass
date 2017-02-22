import java.io.*;
import java.util.*;
import java.net.*;

public class Andmelugeja{
	String failiAsukoht;
	
	public Andmelugeja(String failiAsukoht){
		this.failiAsukoht = failiAsukoht;
	}
		
		BufferedReader kysiLugeja(){
		try{
			if(failiAsukoht.startsWith("http://")){
				return new BufferedReader(new InputStreamReader(
					new URL(failiAsukoht).openConnection().getInputStream()));
			} else {
				return new BufferedReader(new FileReader(failiAsukoht));
			}
		} catch (Exception ex){
			return null;
		}
	}

	public double halvimTulemus(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud = false;
		String rida = lugeja.readLine();
		int puuduvaid = 0;
		double minTulemus=10000;
		while(rida!=null){
			String[] m=rida.split(" ");
			try{
				double tulemus = Double.parseDouble(m[tulbanr]);
				if(alustatud){
					if(tulemus<minTulemus){
						minTulemus=tulemus;
					}
					
				} else {
					minTulemus=tulemus;
					alustatud=true;
				}
			} catch(Exception viga){
				puuduvaid++;
			}
			rida = lugeja.readLine();
		
		}	
		if (puuduvaid>0) {System.err.println("Puudu "+puuduvaid);};
		lugeja.close();
		return minTulemus;
	}
}