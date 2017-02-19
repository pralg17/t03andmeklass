import java.io.*;
import java.net.*;
public class vgames{
	String asukoht;
	public vgames(String asukoht){
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
	public double biggestSales(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine(); //pealkirjarida
		rida=lugeja.readLine();
		int puuduvaid=0;
		double gameSales=0;
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  double sales=Double.parseDouble(m[tulbanr]);
			  if(alustatud){
				  if(sales>gameSales){gameSales=sales;}
			  } else {
				  gameSales=sales;
				  alustatud=true;
			  }
			 } catch(Exception veaandmed){
				 puuduvaid++;
			 }
			 rida=lugeja.readLine();
		}
		if(puuduvaid>0){System.err.println("Puuudu "+puuduvaid);}
		lugeja.close();
		return gameSales;
	}
	
}
