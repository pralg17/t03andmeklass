import java.io.*;
public class BoxOfficeData{
	public static void main(String[] args) throws IOException{
		BoxOffice uuring=new BoxOffice("boxofficeData.txt");
		System.out.println("Aasta 2015 suurim avanädalavahetus oli "+uuring.OpenMax2015(7)+" dollarit.");
		System.out.println("Aasta 2016 suurim avanädalavahetus oli "+uuring.OpenMax2016(7)+" dollarit.");
	}
}
//Filmid 10.10.2015 - 08.10.2016 (Domestic)
//Raha on toodud $
//Aasta 2016 suurim avanädalavahetus oli 179139142 dollarit
//Aasta 2015 suurim avanädalavahetus oli 247966675 dollarit


