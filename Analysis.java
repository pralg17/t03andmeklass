import java.io.*;
import java.net.*;
public class Analysis{
	String location;
	public Analysis(String location){
		this.location=location;
	}
	BufferedReader askReader(){
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


	public double fuelEuros(int rowNr) throws IOException{
		BufferedReader reader=askReader();
		boolean started=false;
		String rida=reader.readLine(); //heading
		rida=reader.readLine();
		int missing=0;
		double finalPrice=0;
		double fuelConsumption=6.5;
		double fuelPrice=1.2;
		while(rida!=null){
			String[] m=rida.split(",");
			 try{
			  double distance=Double.parseDouble(m[rowNr]);
				finalPrice=Math.round(((distance*fuelConsumption)/100)*fuelPrice);

			 } catch(Exception errorData){
				 missing++;
			 }
			 rida=reader.readLine();
		}
		if(missing>0){System.err.println("Info puudub "+missing);}
		reader.close();
		return finalPrice;
	}

}
