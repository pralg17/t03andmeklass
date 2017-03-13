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


	public float avgMales() {
		float counter = 0;
		float avgMale = 0;

		for( int i = 0; i < data.length; i++ ){

			counter = counter + 1;
			if( data[i][3].equals("m") ){
				avgMale++;
			}
		}

		return avgMale / counter;
	}


	public float avgFemales() {
		float counter = 0;
		float avgFemale = 0;

		for( int i = 0; i < data.length; i++ ){

			counter = counter + 1;
			if( data[i][3].equals("n") ){
				avgFemale++;
			}
		}

		return avgFemale / counter;
	}


	public float avgHeight() {
		float counter = 0;
		float height = 0;

		for( int i = 1; i < data.length; i++ ){

			counter = counter + 1;
			height = height + Integer.parseInt(data[i][1]);
		}

		return height / counter;
	}

}






