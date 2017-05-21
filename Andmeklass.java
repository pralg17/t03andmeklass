import java.io.*;
import java.net.*;
public class Andmeklass{
	String asukoht;
	public Andmeklass(String asukoht){
		this.asukoht=asukoht;
	}
	BufferedReader kysilugeja(){
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
	public double suurimMass(int mitmes) throws IOException{
		BufferedReader lugeja=kysilugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		double maxmass=0;
		int puuduvad=0;
		boolean alustatud=false;
		while(rida!=null){
			String[] m=rida.split(",");
			try{
				double maksimum=Double.parseDouble(m[mitmes]);
				if(alustatud){
					if(maksimum > maxmass){
						maxmass=maksimum;
					}
				} else {
					maxmass = maksimum;
					alustatud = true;
				}
			} catch(Exception andmeviga){
				puuduvad++;
			}
			rida=lugeja.readLine();
		}
		if(puuduvad>0){
			System.err.println("Puudu on: "+puuduvad);
		}
		lugeja.close();
		return maxmass;
	}
	
	public double pikim(int mitmes) throws IOException{
		BufferedReader lugeja=kysilugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		double maxpikkus=0;
		int puuduvad=0;
		boolean alustatud=false;
		while(rida!=null){
			String[] m=rida.split(",");
			try{
				double maksimum=Double.parseDouble(m[mitmes]);
				if(alustatud){
					if(maksimum > maxpikkus){
						maxpikkus = maksimum;
					}
				} else {
					maxpikkus = maksimum;
					alustatud=true;
				}
			} catch(Exception andmeviga){
				puuduvad++;
			}
			rida=lugeja.readLine();
		}
		if(puuduvad>0){
			System.err.println("Puudu on: "+puuduvad);
		}
		lugeja.close();
		return maxpikkus;
	}
	
	public int poisid(int mitmes) throws IOException{
		BufferedReader lugeja=kysilugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int kokku = 0;
		while(rida != null){
			String[] m = rida.split(",");
			String sugu = m[mitmes];
			if(sugu.equals ("m")){
				kokku++;
			}
			rida = lugeja.readLine();
		}
		lugeja.close();
		return kokku;
	}
	public int tudrukud(int mitmes) throws IOException{
		BufferedReader lugeja=kysilugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int kokku = 0;
		while(rida != null){
			String[] m = rida.split(",");
			String sugu = m[mitmes];
			if(sugu.equals ("n")){
				kokku++;
			}
			rida = lugeja.readLine();
		}
		lugeja.close();
		return kokku;
	}
} 