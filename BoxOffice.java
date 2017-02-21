import java.io.*;
public class BoxOffice{
	String asukoht;
	public BoxOffice(String asukoht){
		this.asukoht=asukoht;
	}
	BufferedReader kysiLugeja(){
	  try{
		return new BufferedReader(new FileReader(asukoht));
		} catch(Exception ex){		  
		  return null;
		}
	}
	public int OpenMax2016(int mitmes) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		String rida=lugeja.readLine();
		int maxOpening2016 = 0;
		while(rida!=null){
			String[] m=rida.split(",");
			String[] m2=m[mitmes].split("/");
			int opening = Integer.parseInt(m[5]);			
			if(m2[2].equals("16")){
				if(maxOpening2016<opening){
					maxOpening2016=opening;
				}
			}	
			rida=lugeja.readLine();
		}
	lugeja.close();
	return maxOpening2016;
	}
	public int OpenMax2015(int mitmes) throws IOException{
		BufferedReader lugeja=kysiLugeja();
		String rida=lugeja.readLine();
		int maxOpening2015 = 0;
		while(rida!=null){
			String[] m=rida.split(",");
			String[] m2=m[mitmes].split("/");
			int opening = Integer.parseInt(m[5]);			
			if(m2[2].equals("15")){
				if(maxOpening2015<opening){
					maxOpening2015=opening;
				}
			}		
			rida=lugeja.readLine();
		}
	lugeja.close();
	return maxOpening2015;
	}
}