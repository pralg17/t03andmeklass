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
	public List maksimum(int nimi, int tyyp, int rahvaarv) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		boolean alustatud=false;
		String rida=lugeja.readLine(); //pealkirjarida
		rida=lugeja.readLine();
		int maxrahvas=0;
		String maxnimi="";
		String maxtyyp="";
		List<String> raamatukogu = new ArrayList<String>();
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			 	String nimi2 = m[nimi];
			 	String tyyp2 = m[tyyp];
			  int rahvas=Integer.parseInt(m[rahvaarv]);
			  if(alustatud){
				  if(rahvas>maxrahvas){
				  	maxrahvas=rahvas;
				  	maxnimi=nimi2;
				  	maxtyyp=tyyp2;
				  }
			  } else {
				  maxrahvas=rahvas;
				  alustatud=true;
			  }
			 } catch(Exception e){
				e.printStackTrace();
			 }
			 rida=lugeja.readLine();
		}
		raamatukogu.add(maxnimi);
    	raamatukogu.add(maxtyyp);
    	raamatukogu.add(String.valueOf(maxrahvas));
		lugeja.close();
		return raamatukogu;
	}
	
}