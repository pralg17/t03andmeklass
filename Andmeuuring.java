import java.io.*;
import java.net.*;
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
	public double maksimum(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		String rida=lugeja.readLine(); 
		rida=lugeja.readLine();
		double maxarv=0;

		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  double rahvaarv=Double.parseDouble(m[tulbanr]);
			  if(maxarv<rahvaarv){
				  maxarv = rahvaarv;
			  }
			 } catch(Exception e){
				 System.out.println("Viga");
			 }
			 rida=lugeja.readLine();
		}
		lugeja.close();
		return maxarv;
	}
	public String maksimumLinn(int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		String rida=lugeja.readLine(); 
		rida=lugeja.readLine();
		double maxarv=0;
		String linn="a";

		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  double rahvaarv=Double.parseDouble(m[1]);
			  if(maxarv<rahvaarv){
				  maxarv = rahvaarv;
				  linn = m[tulbanr];
			  }
			 } catch(Exception e){
				 System.out.println("Viga");
			 }
			 rida=lugeja.readLine();
		}
		lugeja.close();
		return linn;
	}
}

/*
Kõige suurema rahvaarvuga linn on Tallinn kus on 434810.0 inimest
*/
