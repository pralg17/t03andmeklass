import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.*;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
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

	for( int i = 1; i < data.length; i++ ){

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

	for( int i = 1; i < data.length; i++ ){

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


public float avgMass() {
	float counter = 0;
	float mass = 0;

	for( int i = 1; i < data.length; i++ ){

		counter = counter + 1;
		mass = mass + Integer.parseInt(data[i][2]);
	}

	return mass / counter;
}


public void writeData(String... input) throws IOException {
	List<String> lines = Arrays.asList(input);
	File fl = new File("results.txt");
	if(!fl.exists()){
		fl.createNewFile();
		Files.write(Paths.get("results.txt"), lines);

	}else{
		Files.write(Paths.get("results.txt"), lines);

	}

}




}






