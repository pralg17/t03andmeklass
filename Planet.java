import java.io.*;
public class Planet{
	float distanceFromSun;
	float movementSpeed;
	float lengthOfYear;
	String name;
	String filePath;
	BufferedReader file;
	
	public Planet(String filePath){
		this.filePath = filePath;
	}

	public Planet(String name, String distanceFromSun, String movementSpeed) {
		if (name == null || name.length() == 0) {
		throw new RuntimeException("Puudub planeedi nimi.");
    	}
		if (distanceFromSun == null || distanceFromSun.length() == 0) {
		throw new RuntimeException("Puudub info planeedi kaugus kohta Päikesest.");
    	}
		if (movementSpeed == null || movementSpeed.length() == 0) {
			throw new RuntimeException("Puudub info planeedi liikumise kiiruse kohta.");
		}
	this.distanceFromSun = Float.parseFloat(distanceFromSun);
	this.movementSpeed = Float.parseFloat(movementSpeed);
	this.name = name;
	}
	
	BufferedReader file() {
		try {
			return new BufferedReader(new FileReader(filePath));
		} catch (Exception e) {
			return null;
		}
	}

	public void yearLengthFromFile() throws IOException{
		BufferedReader fromFile = file();
		String line = fromFile.readLine();
		String output = "";
		while (line != null) {
			String[] data = line.split(",");
			Planet planet = new Planet(data[0], data[1], data[2]);
			output += planet.yearLength() + "\n";
			line = fromFile.readLine();
		}
		saveToFile("tulemus.txt", output);
		fromFile.close();
	}
	
	public String yearLength() {
		double aroundSun = 2 * Math.PI * distanceFromSun;
		double yearLength = (aroundSun / movementSpeed) / 24 / 365;
		return "Planeedi " + name + " aasta pikkus on " + yearLength + " Maa aastat";
	}
	
	public void saveToFile(String filePath, String contents) {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(filePath));
			pw.println(contents);
			pw.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}