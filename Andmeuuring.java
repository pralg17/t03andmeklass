import java.io.*;
import java.net.*;
public class Andmeuuring{
	String nimi;
	public Andmeuuring(String nimi){
		this.nimi=nimi;
	}
	public double maksimum(int tulbanr) throws IOException{
		BufferedReader lugeja=new BufferedReader(new FileReader(nimi));//failiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine(); //pealkirjarida
		rida=lugeja.readLine();
		int puuduvaid=0;
		double maxsammud=0;
		while(rida!=null){
			String[] m=rida.split(",");
				try{
				double sammud=Double.parseDouble(m[tulbanr]);
				if(alustatud){
					if(sammud>maxsammud){maxsammud=sammud;}
				} 
				else {
					maxsammud=sammud;
					alustatud=true;
				}
				} 
				catch(Exception veaandmed){
					puuduvaid++;
			}
			rida=lugeja.readLine();
		}
		if(puuduvaid>0){System.err.println("Puuudu "+puuduvaid);}
		lugeja.close();
		return maxsammud;
	}
	public double minimum(int tulbanr) throws IOException{
		BufferedReader lugeja=new BufferedReader(new FileReader(nimi));//failiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine(); //pealkirjarida
		rida=lugeja.readLine();
		int puuduvaid=0;
		double minsammud=50000;
		while(rida!=null){
			String[] m=rida.split(",");
				try{
				double sammud=Double.parseDouble(m[tulbanr]);
				if(alustatud){
					if(sammud<minsammud){minsammud=sammud;}
				} 
				else {
					minsammud=sammud;
					alustatud=true;
				}
				} 
				catch(Exception veaandmed){
					puuduvaid++;
			}
			rida=lugeja.readLine();
		}
		if(puuduvaid>0){System.err.println("Puuudu "+puuduvaid);}
		lugeja.close();
		return minsammud;
	
	}
}
