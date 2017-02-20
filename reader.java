import java.io.*;
import java.net.*;
import java.util.*;
public class reader{
	String asukoht;
	public reader(String asukoht){
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
	public List maksimum(int eesnimi, int perenimi, int tulbanr) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine(); //pealkirjarida
		rida=lugeja.readLine();
		double maxraha=0;
		String maxfirstname="";
		String maxlastname="";
		List<String> tootaja = new ArrayList<String>();
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			 	String firstname = m[eesnimi];
			 	String lastname = m[perenimi];
			  double raha=Double.parseDouble(m[tulbanr]);
			  if(alustatud){
				  if(raha>maxraha){
				  	maxraha=raha;
				  	maxfirstname=firstname;
				  	maxlastname=lastname;
				  }
			  } else {
				  maxraha=raha;
				  alustatud=true;
			  }
			 } catch(Exception e){
				e.printStackTrace();
			 }
			 rida=lugeja.readLine();
		}
		tootaja.add(maxfirstname);
    	tootaja.add(maxlastname);
    	tootaja.add(String.valueOf(maxraha));
		lugeja.close();
		return tootaja;
	}
	
}