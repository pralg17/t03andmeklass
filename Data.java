import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Data{

	String url;
	String[][] data;

	public Data(String url) {
		this.url = url;
	}

	public Data() throws IOException {


		String out = new Scanner(new URL(url).openStream(), "UTF-8").useDelimiter("\\A").next();

		String[] lines = out.split("\n");
		String[][] linesCsv = new String[lines.length][];

		for( int i = 0; i < lines.length; i++ ){
			linesCsv[i] = lines[i].split(",");
			}

		this.data = linesCsv;
	}

}






