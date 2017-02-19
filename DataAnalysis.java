import java.io.*;
import java.net.*;
import java.text.DecimalFormat;

public class DataAnalysis {
	String fileLocation;
	
	public DataAnalysis(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	
	BufferedReader fileReader() {
		try {
			if(fileLocation.startsWith("http://")) {
				return new BufferedReader(new InputStreamReader(new URL(fileLocation).openConnection().getInputStream()));
			} else {
				return new BufferedReader(new FileReader(fileLocation));
			}
		} catch(Exception ex) {
			return null;
		}
	}
	
	/*
	public double maxGuitarPrice() throws IOException {
		BufferedReader fileReader = fileReader();
		
		boolean started;
		int missingData;
		double maxGuitarPrice;
		String fileRow;
		
		started = false;
		missingData = 0;
		maxGuitarPrice = 0;
		
		fileRow = fileReader.readLine();
		fileRow = fileReader.readLine();
		
		while(fileRow != null) {
			String[] guitars = fileRow.split(",");
			try {
				double guitarPrice = Double.parseDouble(guitars[2]);
				
				if(started) {
					if(guitarPrice > maxGuitarPrice) {
						maxGuitarPrice = guitarPrice;
					}
				} else {
					maxGuitarPrice = guitarPrice;
					started = true;
				}
			} catch(Exception dataErrors) {
				missingData++;
			}
			fileRow = fileReader.readLine();
		}
		
		if(missingData > 0) {
			System.err.println("Puuduvaid andmeridu on: " + missingData);
		}
		
		fileReader.close();
		return maxGuitarPrice;
	}
	*/
	
	
	public String[] maxPriceGuitarData() throws IOException {
		BufferedReader fileReader = fileReader();
		
		boolean started;
		int missingData, indexedGuitarStrings;
		double maxGuitarPrice;
		String fileRow, indexedGuitarModel, indexedGuitarBrand;
		
		started = false;
		missingData = 0;
		maxGuitarPrice = 0;
		indexedGuitarModel = "";
		indexedGuitarBrand = "";
		indexedGuitarStrings = 0;
		
		fileRow = fileReader.readLine();
		fileRow = fileReader.readLine();
		
		while(fileRow != null) {
			String[] guitars = fileRow.split(",");
			try {
				double guitarPrice = Double.parseDouble(guitars[2]);
				String guitarModel = guitars[1];
				String guitarBrand = guitars[0];
				int guitarStrings = Integer.parseInt(guitars[3]);
				
				if(started) {
					if(guitarPrice > maxGuitarPrice) {
						maxGuitarPrice = guitarPrice;
						indexedGuitarModel = guitarModel;
						indexedGuitarBrand = guitarBrand;
						indexedGuitarStrings = guitarStrings;
					}
				} else {
					maxGuitarPrice = guitarPrice;
					indexedGuitarModel = guitarModel;
					indexedGuitarBrand = guitarBrand;
					indexedGuitarStrings = guitarStrings;
					started = true;
				}
			} catch(Exception dataErrors) {
				missingData++;
			}
			fileRow = fileReader.readLine();
		}
		
		if(missingData > 0) {
			System.err.println("Puuduvaid andmeridu on: " + missingData);
		}
		
		DecimalFormat format = new DecimalFormat("0.00");
		String maxGuitarPriceString = format.format(maxGuitarPrice);
		
		String indexedGuitarStringsString = String.valueOf(indexedGuitarStrings);
		
		fileReader.close();
		return new String[] {indexedGuitarBrand, indexedGuitarModel, maxGuitarPriceString, indexedGuitarStringsString};
	}
	
	
	
	public String[] minPriceGuitarData(String maxPrice) throws IOException {
		BufferedReader fileReader = fileReader();
		
		boolean started;
		int missingData, indexedGuitarStrings;
		double minGuitarPrice, maxGuitarPrice;
		String fileRow, indexedGuitarModel, indexedGuitarBrand;
		
		started = false;
		missingData = 0;
		minGuitarPrice = Double.parseDouble(maxPrice);
		indexedGuitarModel = "";
		indexedGuitarBrand = "";
		indexedGuitarStrings = 0;
		
		fileRow = fileReader.readLine();
		fileRow = fileReader.readLine();
		
		while(fileRow != null) {
			String[] guitars = fileRow.split(",");
			try {
				double guitarPrice = Double.parseDouble(guitars[2]);
				String guitarModel = guitars[1];
				String guitarBrand = guitars[0];
				int guitarStrings = Integer.parseInt(guitars[3]);
				
				if(started) {
					if(guitarPrice < minGuitarPrice) {
						minGuitarPrice = guitarPrice;
						indexedGuitarModel = guitarModel;
						indexedGuitarBrand = guitarBrand;
						indexedGuitarStrings = guitarStrings;
					}
				} else {
					minGuitarPrice = guitarPrice;
					indexedGuitarModel = guitarModel;
					indexedGuitarBrand = guitarBrand;
					indexedGuitarStrings = guitarStrings;
					started = true;
				}
			} catch(Exception dataErrors) {
				missingData++;
			}
			fileRow = fileReader.readLine();
		}
		
		if(missingData > 0) {
			System.err.println("Puuduvaid andmeridu on: " + missingData);
		}
		
		DecimalFormat format = new DecimalFormat("0.00");
		String minGuitarPriceString = format.format(minGuitarPrice);
		
		String indexedGuitarStringsString = String.valueOf(indexedGuitarStrings);
		
		fileReader.close();
		return new String[] {indexedGuitarBrand, indexedGuitarModel, minGuitarPriceString, indexedGuitarStringsString};
	}
	
	
	
	public int rightHanded() throws IOException {
		BufferedReader fileReader = fileReader();
		
		boolean started;
		int missingData, rightHandedCount;
		String fileRow;
		
		//started = false;
		missingData = 0;
		rightHandedCount = 0;
		
		fileRow = fileReader.readLine();
		fileRow = fileReader.readLine();
		
		while(fileRow != null) {
			String[] guitars = fileRow.split(",");
			try {
				String leftOrRightHanded = guitars[4];
				
				//if(started) {
					if(leftOrRightHanded.equals("r")) {
						rightHandedCount++;
					}
				//} else {
				//	maxGuitarPrice = guitarPrice;
				//	started = true;
				//}
			} catch(Exception dataErrors) {
				missingData++;
			}
			fileRow = fileReader.readLine();
		}
		
		if(missingData > 0) {
			System.err.println("Puuduvaid andmeridu on: " + missingData);
		}
		
		fileReader.close();
		return rightHandedCount;
	}
	
	
	
	public int leftHanded() throws IOException {
		BufferedReader fileReader = fileReader();
		
		boolean started;
		int missingData, leftHandedCount;
		String fileRow;
		
		//started = false;
		missingData = 0;
		leftHandedCount = 0;
		
		fileRow = fileReader.readLine();
		fileRow = fileReader.readLine();
		
		while(fileRow != null) {
			String[] guitars = fileRow.split(",");
			try {
				String leftOrRightHanded = guitars[4];
				
				//if(started) {
					if(leftOrRightHanded.equals("l")) {
						leftHandedCount++;
					}
				//} else {
				//	maxGuitarPrice = guitarPrice;
				//	started = true;
				//}
			} catch(Exception dataErrors) {
				missingData++;
			}
			fileRow = fileReader.readLine();
		}
		
		if(missingData > 0) {
			System.err.println("Puuduvaid andmeridu on: " + missingData);
		}
		
		fileReader.close();
		return leftHandedCount;
	}
	
	
	
	
	
}

























