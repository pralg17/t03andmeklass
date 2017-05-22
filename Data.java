import java.io.*;
import java.net.*;
public class Data {
	String location;
	public Data(String location){
		this.location=location;
	}
	BufferedReader reader(){
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

	public double Diameter(int rowCount, String dataType) throws IOException{
		BufferedReader bufReader=reader();
		String row=bufReader.readLine();
		row=bufReader.readLine();
		double maxm=0;
    double result;
		int missingData=0;
		boolean hasBegun=false;
    if (dataType == "max") {
      while(row!=null){
			String[] m=row.split(",");
			try{
				double mainMax=Double.parseDouble(m[rowCount]);
				if(hasBegun){
					if(mainMax > maxm){
						maxm=mainMax;
					}
				} else {
					maxm = mainMax;
					hasBegun = true;
				}
			} catch(Exception dataError){
				missingData++;
			}
			row=bufReader.readLine();
		}
		if(missingData>0){
			System.err.println("Missing information for " + missingData + " samples.");
		}
		bufReader.close();
    result = maxm;

  }
  if (dataType == "min") {
    while(row!=null){
    String[] m=row.split(",");
    try{
      double mainMax=Double.parseDouble(m[rowCount]);
      if(hasBegun){
        if(mainMax < maxm){
          maxm=mainMax;
        }
      } else {
        maxm = mainMax;
        hasBegun = true;
      }
    } catch(Exception dataError){
      missingData++;
    }
    row=bufReader.readLine();
  }
  if(missingData>0){
    System.err.println("Missing information for " + missingData + " samples.");
  }
  bufReader.close();
  result = maxm;
}

  return maxm;
	}


	public int kuldrenettCount(int rowCount) throws IOException{
		BufferedReader bufReader=reader();
		String row=bufReader.readLine();
		row=bufReader.readLine();
		int kuldrenettCount = 0;
		while(row != null){
			String[] m = row.split(",");
			String kontrollm = m[rowCount];
			if(kontrollm.equals ("Kuldrenett")){
				kuldrenettCount++;
			}
			row = bufReader.readLine();
		}
		bufReader.close();
		return kuldrenettCount;
	}

		public int liiviCount(int rowCount) throws IOException{
    		BufferedReader bufReader=reader();
    		String row=bufReader.readLine();
    		row=bufReader.readLine();
    		int liiviCount = 0;
    		while(row != null){
    			String[] m = row.split(",");
    			String kontrollm = m[rowCount];
    			if(kontrollm.equals ("Liivi sibul")){
    				liiviCount++;
    			}
    			row = bufReader.readLine();
    		}
    		bufReader.close();
    		return liiviCount;
    	}



}
