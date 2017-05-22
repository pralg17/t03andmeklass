import java.io.*;
import java.net.*;

public class Andmeuuring{
	String location;
	public Andmeuuring(String location){
		this.location=location;
	}
	BufferedReader getReader(){
	  try{
		if(location.startsWith("http://")){
			return new BufferedReader(new InputStreamReader(
			   new URL(location).openConnection().getInputStream()));
		}
		else {
			return new BufferedReader(new FileReader(location));
		}
	  } catch(Exception ex){		  
		  return null;
	  }
	}
	public String maximum(int reanumber) throws IOException{
		BufferedReader reader=getReader();
		boolean started=false;
		String line=reader.readLine(); //pealkirjaline
		String[] reanimi = line.split(",");
		String title = reanimi[reanumber];
		line=reader.readLine();
		int missing=0;
		double max=0;
		while(line!=null){
			String[] m=line.split(",");
			 try{
			  double rowinfo=Double.parseDouble(m[reanumber]);
			  if(started){
				  if(rowinfo>max){max=rowinfo;}
			  } else {
				  max=rowinfo;
				  started=true;
			  }
			 } catch(Exception dataerror){
				 missing++;
			 }
			 line=reader.readLine();
		}
		if(missing>0){System.err.println("Puudu "+missing);}
		reader.close();
		return "Kõige suurema "+title+" sisaldusega komm: " + max;
		
		
	}
	
}