import java.io.*;
import java.net.*;
import java.util.*;
public class Data{
	
	String location;
	
	public Data(String location){
		this.location=location;
	}
	BufferedReader getStream(){
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
	public void findTopBands(List<String> bands){
		
		List<Integer> skipList = new ArrayList<Integer>();
		int max = 0, index, i;
		String band = "";
		System.out.println("--------------------------------");
		System.out.printf("%s%4s%s%-20s%s%-5s%s\n", "|", "Top", "|", "Band", "|", "Fans","|");
		System.out.println("--------------------------------");
		for (int j = 0; j < 10; j++) {
			for (i = 0; i < bands.size(); i++) {
				if (!skipList.contains(i)) {
					if (max < Integer.parseInt(bands.get(i).split(",")[2])){
						max = Integer.parseInt(bands.get(i).split(",")[2]);
						band = bands.get(i).split(",")[1];
						skipList.add(i);
					}
				}
			}		
			System.out.printf("%s%4s%s%-20s%s%-5s%s\n", "|", (int)(j+1), "|", band, "|", max, "|");
			max = 0;
		}
		System.out.println("--------------------------------");
	}
	public String findFromTable(int param) throws IOException{
		BufferedReader stream=getStream();
		String line=stream.readLine();
		line=stream.readLine();
		double max=0;
		double min = 100000;
		List<String> allBands = new ArrayList<String>();
		String band = "";
		String result = "";
		while(line!=null){
			String[] m=line.split(",");
			try{
				double current=Double.parseDouble(m[2]);
				if (param == 1){
					if(current>max){max=current; band=m[1]; result=band+", "+
									(int)current+" fans";}
				}
				else if (param == 2){
					if(current<min){min=current; band=m[1]; result=band+", "+
									(int)current+" fans";}
				}
				else if (param == 3){
					allBands.add(line);
				}
			} catch(Exception veaandmed){
				;
			}
			line=stream.readLine();
		}
		if (param == 3){
			findTopBands(allBands);
			
		}
		stream.close();
		return result;
	}
	
}