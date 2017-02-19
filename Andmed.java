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
	public double MaxDiameeter(int mitmes) throws IOException{
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



	public int mituAntoonovka(int mitmes) throws IOException{
		BufferedReader lugeja=kysilugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int mituAntoonovka = 0;
		while(rida != null){
			String[] m = rida.split(",");
			String kontrollm = m[mitmes];
			if(kontrollm.equals ("Antoonovka")){
				mituAntoonovka++;
			}
			rida = lugeja.readLine();
		}
		lugeja.close();
		return mituAntoonovka;
	}

	public int mituKuldrenett(int mitmes) throws IOException{
		BufferedReader lugeja=kysilugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int mituKuldrenett = 0;
		while(rida != null){
			String[] m = rida.split(",");
			String kontrollm = m[mitmes];
			if(kontrollm.equals ("Kuldrenett")){
				mituKuldrenett++;
			}
			rida = lugeja.readLine();
		}
		lugeja.close();
		return mituKuldrenett;
	}

		public int mituLiivisibul(int mitmes) throws IOException{
    		BufferedReader lugeja=kysilugeja();
    		String rida=lugeja.readLine();
    		rida=lugeja.readLine();
    		int mituLiivisibul = 0;
    		while(rida != null){
    			String[] m = rida.split(",");
    			String kontrollm = m[mitmes];
    			if(kontrollm.equals ("Liivi sibul")){
    				mituLiivisibul++;
    			}
    			rida = lugeja.readLine();
    		}
    		lugeja.close();
    		return mituLiivisibul;
    	}



}