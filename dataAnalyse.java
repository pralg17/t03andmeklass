import java.io.*;
import java.net.*;

public class dataAnalyse{
	String location;
	public dataAnalyse(String location){
		this.location=location;
	}
	
	BufferedReader askReader(){
		try{
			if(location.startsWith("http://")){
				return new BufferedReader(new InputStreamReader(new URL(location).openConnection().getInputStream()));
		}
		else {
			return new BufferedReader(new FileReader(location));
		}
		} catch(Exception ex){ //Milleks on see vajalik? Mis on 'ex'?
			return null;
		}
	}

	public int genderQuery(int columnNr) throws IOException{
		BufferedReader trawler=askReader();
		//boolean started = false;
		String line = trawler.readLine(); //subject title line
		line = trawler.readLine();
		int genderMale = 0;
		
		while(line!=null){
			String[] m = line.split(",");
			String sugu = m[columnNr];
			if (sugu.equals ("m")){
				genderMale++;
			}
			line = trawler.readLine();
		}
		trawler.close();
		return genderMale;
	}
	
}