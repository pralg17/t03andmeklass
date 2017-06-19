import java.io.*;
import java.util.*;
import java.net.*;

public class Lugeja{
	String failiAsukoht;
	
	public Lugeja(String failiAsukoht){
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
		double maxTulemus=10000;
		while(rida!=null){
			String[] m=rida.split(" ");
			try{
				double tulemus = Double.parseDouble(m[tulbanr]);
				if(alustatud){
					if(tulemus>maxTulemus){
						maxTulemus=tulemus;
					}
					
				} else {
					maxTulemus=tulemus;
					alustatud=true;
				}
			} catch(Exception viga){
				puuduvaid++;
			}
			rida = lugeja.readLine();
		
		}	
		if (puuduvaid>0) {System.err.println("Puudu "+puuduvaid);};
		lugeja.close();
		return maxTulemus;
	}
}