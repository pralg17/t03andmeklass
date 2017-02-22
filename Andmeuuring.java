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
	//Leian v2hima arvu synde 2011. aastal.
	public int v2him(int mitmes) throws IOException{
		BufferedReader lugeja=kysilugeja();
		String rida=lugeja.readLine(); //pealkirjarida
		rida=lugeja.readLine();
		int min =0;
		boolean alustatud=false;
		while(rida!=null){
			String[] m=rida.split(";");
			  int miinimum=Integer.parseInt(m[mitmes]);
			  if(alustatud){
					if(miinimum < min){
							min=miinimum;
						}
			  } else {
				  min = miinimum;
				  alustatud=true;
			  }
				rida=lugeja.readLine();
			}
      lugeja.close();
			return min;
		}
	}
