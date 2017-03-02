import java.io.*;
import java.net.*;
import java.util.*;
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
    public List minimum(int nimi, int tulbanr) throws IOException{
 		BufferedReader lugeja=kysiLugeja();
 		boolean alustatud=false;
 		String rida=lugeja.readLine();
 		rida=lugeja.readLine();
		double pikkus=0;
		String eesnimi ="";
		List<String> opilane = new ArrayList<String>();
 		while(rida!=null){
 			String[] m=rida.split(",");
 			try{
				String nimed = m[nimi];
				double minpikkus = Double.parseDouble(m[tulbanr]);
				if(alustatud){
					if(minpikkus<pikkus){
						pikkus=minpikkus;
						eesnimi=nimed;}
				}else{
					pikkus=minpikkus;
					alustatud=true;
				}
			}catch(Exception viga){
 				System.err.println("Viga!");
			}
				rida=lugeja.readLine();
 		}
		opilane.add(eesnimi);
		opilane.add(String.valueOf(pikkus));
		lugeja.close();
 		return opilane;
 	}
	public List maksimum(int nimi, int tulbanr) throws IOException{
 		BufferedReader lugeja=kysiLugeja();
 		boolean alustatud=false;
 		String rida=lugeja.readLine();
 		rida=lugeja.readLine();
		double mass=0;
		String eesnimi ="";
		List<String> opilane = new ArrayList<String>();
 		while(rida!=null){
 			String[] m=rida.split(",");
 			try{
				String nimed = m[nimi];
				double maxmass = Double.parseDouble(m[tulbanr]);
				if(alustatud){
					if(maxmass>mass){
						mass=maxmass;
						eesnimi=nimed;}
				}else{
					mass=maxmass;
					alustatud=true;
				}
			}catch(Exception viga){
 				System.err.println("Viga!");
			}
				rida=lugeja.readLine();
 		}
		opilane.add(eesnimi);
		opilane.add(String.valueOf(mass));
		lugeja.close();
 		return opilane;
 	}
}