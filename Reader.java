import java.io.*;
import java.net.*;
import java.util.*;

public class Reader{
	String Location	;
	public Reader(String Location){
		this.Location=Location;
	}
	BufferedReader askReader(){
	  try{
		if(Location.startsWith("http://")){
			return new BufferedReader(new InputStreamReader(
			   new URL(Location).openConnection().getInputStream()));
		}
		else {
			return new BufferedReader(new FileReader(Location));
		}
	  } catch(Exception ex){		  
		  return null;
	  }
	}
	public List getMax(int firstName, int lastName, int columnNum) throws IOException{
		BufferedReader reader1=askReader();
		boolean Started=false;
		String Row=reader1.readLine();
		Row=reader1.readLine();
		double maxMoney=0;
		String maxFirstname="";
		String maxLastname="";
		List<String> Worker = new ArrayList<String>();
		while(Row!=null){
			String[] m=Row.split(",");
			 try{
			 	String firstNameOutput = m[firstName];
			 	String lastNameOutput = m[lastName];
			  double Money=Double.parseDouble(m[columnNum]);
			  if(Started){
				  if(Money>maxMoney){
				  	maxMoney=Money;
				  	maxFirstname=firstNameOutput;
				  	maxLastname=lastNameOutput;
				  }
			  } else {
				  maxMoney=Money;
				  Started=true;
			  }
			 } catch(Exception e){
				e.printStackTrace();
			 }
			 Row=reader1.readLine();
		}
		Worker.add(maxFirstname);
    	Worker.add(maxLastname);
    	Worker.add(String.valueOf(maxMoney));
		reader1.close();
		return Worker;
	}
	
}