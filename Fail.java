import java.io.*;

public class Fail{
	
	String asukoht;
	
	//konstruktor
	public Fail(String asukoht){
		this.asukoht = asukoht;
	}
	
	//lugeja tekstifaili jaoks
	public BufferedReader kysiLugeja(){
		
	  try{
			return new BufferedReader(new FileReader(asukoht)); 
	  } catch(Exception ex){		  
		  return null;
	  }
	}
	
	// Mis aastatel kõige rohkem/vähem kinnisvara ostu-myyki
	public int[] maxMinArv() throws IOException{
		
		BufferedReader lugeja = kysiLugeja();
		String rida = lugeja.readLine();
		int[] tulemus = new int[4];
		int aastaTehingud = 0;
		int maxTehingud = 0;
		int minTehingud = 100000;
		int aasta = Integer.parseInt(rida.split(";")[0]);  //algne aasta
		while(rida != null){
			String[] m = rida.split(";");
			if(Integer.parseInt(m[0]) == aasta){
				aastaTehingud += Integer.parseInt(m[2]);
				//System.out.println(aastaTehingud);
				rida = lugeja.readLine();
				
			} else {
				if(aastaTehingud > maxTehingud){
					maxTehingud = aastaTehingud;
					//System.out.println(maxTehingud);
					tulemus[0] = aasta;
					tulemus[1] = maxTehingud;
				}
				if(aastaTehingud < minTehingud){
					minTehingud = aastaTehingud;
					//System.out.println(minTehingud);
					tulemus[2] = aasta;
					tulemus[3] = minTehingud;
				}
				aastaTehingud = 0;
				aasta++;
			}
		}
		return tulemus;
	}
	
	//Tehingute koguarv, koguvaartus ja keskmine kinnisvara hind kindlal aastal
	public double[] tehinguidAastas(String aasta) throws IOException{
		BufferedReader lugeja = kysiLugeja();
		String rida = lugeja.readLine();
		double[] kokku = new double[2];
		kokku[0] = 0;
		kokku[1] = 0;
		while(rida != null){
			String[] m = rida.split(";");
			if(m[0].equals(aasta)){
				kokku[0] += Double.parseDouble(m[2]);
				kokku[1] += Double.parseDouble(m[3]);
			} 
			rida = lugeja.readLine();
		}
		lugeja.close();
		return kokku;	
	}
	
}	