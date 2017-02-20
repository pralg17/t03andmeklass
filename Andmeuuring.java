import java.io.*;
import java.net.*;

public class Andmeuuring{
	String asukoht;
	public Andmeuuring(String asukoht){
	 	this.asukoht=asukoht;
	}
	
	BufferedReader kysilugeja(){
	 	try{
	 		if(asukoht.startsWith("http://")){
	 			return new BufferedReader(new InputStreamReader(
	 				new URL(asukoht).openConnection().getInputStream()));
			} else {
				return new BufferedReader(new FileReader(asukoht));
			}
		} catch(Exception ex){
				return null;
		}
	}


	//LEIAN, MITU INIMEST OSKAB KABET
	public int kesOskab (int mitmes) throws IOException{
		BufferedReader lugeja=kysilugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		int oskab = 0;
		int puuduvaid=0;
		while(rida != null){
			String[] m = rida.split(",");
			String kontrollm = m[4];
			try{
				if(kontrollm.equals ("jah") || kontrollm.equals ("natuke")){
					oskab++;
				}
				rida = lugeja.readLine();
			} catch(Exception veaandmed){
				puuduvaid++;
			}
		}
		if(puuduvaid>0){
			System.err.println("Siit on puudu: "+puuduvaid);
		}
		return oskab;
	}


	//LEIAN VAIKSEIMA MASSIGA ISIKU
	public double vaikseimMass(int mitmes) throws IOException{
		BufferedReader lugeja=kysilugeja();
		String rida=lugeja.readLine();
		rida=lugeja.readLine();
		double minm=0;
		int puuduvaid=0;
		boolean alustatud=false;
		while(rida!=null){
			String[] m=rida.split(",");
			try{
				double miinimum=Double.parseDouble(m[mitmes]);
				if(alustatud){
					if(miinimum < minm){
						minm=miinimum;
					}
				} else {
					minm = miinimum;
					alustatud = true;
				}
			} catch(Exception veaandmed){
				puuduvaid++;
			}
			rida=lugeja.readLine();
		}
		if(puuduvaid>0){
			System.err.println("Siit on puudu: "+puuduvaid);
		}
		lugeja.close();
		return minm;
	}
}