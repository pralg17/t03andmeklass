import java.io.*;
 import java.net.*;
 public class uuring{
 	String asukoht;
 	public uuring(String asukoht){
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
 
 	public double MaxTulemus(int mitmes) throws IOException{
 		BufferedReader lugeja=kysilugeja();
 		String rida=lugeja.readLine();
 		rida=lugeja.readLine();
 		double max=0;
 		int puuduvaid=0;
 		boolean alustatud=false;
 		while(rida!=null){
 			String[] m=rida.split(",");
 			try{
 				double maksimum=Double.parseDouble(m[mitmes]);
 				if(alustatud){
 					if(maksimum > max){
 						max=maksimum;
 					}
 				} else {
 					max = maksimum;
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
 		return max;
 
 	}
 
 	public double MituViimsist(int mitmes) throws IOException{
 		BufferedReader lugeja=kysilugeja();
 		String rida=lugeja.readLine();
 		rida=lugeja.readLine();
 		int mituR = 0;
 		while(rida != null){
 			String[] m = rida.split(",");
 			String kontroll = m[mitmes];
  			if(kontroll.equals ("Viimsi Keskkool")){
  				mituR++;
  			}
  			rida = lugeja.readLine();
  		}
  		lugeja.close();
  		return mituR;
 
 
 }
 
 }