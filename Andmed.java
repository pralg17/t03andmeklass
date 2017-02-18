import java.io.*;
import java.net.*;
public class Andmed{
	String asukoht;
	public Andmed(String asukoht){
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
	public double MaxMass(int mitmes) throws IOException{
		BufferedReader lugeja=kysilugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		double maxm=0;
		int puuduvaid=0;
		boolean alustatud=false;
		while(rida!=null){
			String[] m=rida.split(",");
			try{
				double maksimum=Double.parseDouble(m[mitmes]);
				if(alustatud){
					if(maksimum > maxm){
						maxm=maksimum;
					}
				} else {
					maxm = maksimum;
					alustatud = true;
				}
			} catch(Exception andmeviga){
				puuduvaid++;
			}
			rida=lugeja.readLine();
		}
		if(puuduvaid>0){
			System.err.println("Puudu on: "+puuduvaid);
		}
		lugeja.close();
		return maxm;
	}
	
	public double MaxPikkus(int mitmes) throws IOException{
		BufferedReader lugeja=kysilugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		double maxp=0;
		int puuduvaid=0;
		boolean alustatud=false;
		while(rida!=null){
			String[] m=rida.split(",");
			try{
				double maksimum=Double.parseDouble(m[mitmes]);
				if(alustatud){
					if(maksimum > maxp){
						maxp = maksimum;
					}
				} else {
					maxp = maksimum;
					alustatud=true;
				}
			} catch(Exception andmeviga){
				puuduvaid++;
			}
			rida=lugeja.readLine();
		}
		if(puuduvaid>0){
			System.err.println("Puudu on: "+puuduvaid);
		}
		lugeja.close();
		return maxp;
	}
	
	public int MituPoissi(int mitmes) throws IOException{
		BufferedReader lugeja=kysilugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int mituP = 0;
		while(rida != null){
			String[] m = rida.split(",");
			String kontrollm = m[mitmes];
			if(kontrollm.equals ("m")){
				mituP++;
			}
			rida = lugeja.readLine();
		}
		lugeja.close();
		return mituP;
	}
	public int MituTüdrukut(int mitmes) throws IOException{
		BufferedReader lugeja=kysilugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int mituT = 0;
		while(rida != null){
			String[] m = rida.split(",");
			String kontrolln = m[mitmes];
			if(kontrolln.equals ("n")){
				mituT++;
			}
			rida = lugeja.readLine();
		}
		lugeja.close();
		return mituT;
	}
}	