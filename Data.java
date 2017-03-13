import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Data{

	String[][] data;


	public Data(String url) {

		String out = null;

		try{
			out = new Scanner(new URL(url).openStream(), "UTF-8").useDelimiter("\\A").next();
		}catch ( IOException e ){
			e.printStackTrace();
		}

		String[] lines = out.split("\n");
		String[][] linesCsv = new String[lines.length][];

		for( int i = 0; i < lines.length; i++ ){
			linesCsv[i] = lines[i].split(",");
		}

		this.data = linesCsv;
	}


}






