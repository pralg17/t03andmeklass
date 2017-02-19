import java.io.*;

public class GuitarData {
	
	public static void main(String[] args) throws IOException {
		DataAnalysis guitarData = new DataAnalysis("guitars.txt");
		
		String maxPriceBrand = guitarData.maxPriceGuitarData()[0];
		String maxPriceModel = guitarData.maxPriceGuitarData()[1];
		String maxPrice = guitarData.maxPriceGuitarData()[2];
		String maxPriceGuitarStrings = guitarData.maxPriceGuitarData()[3];
		
		String minPriceBrand = guitarData.minPriceGuitarData(maxPrice)[0];
		String minPriceModel = guitarData.minPriceGuitarData(maxPrice)[1];
		String minPrice = guitarData.minPriceGuitarData(maxPrice)[2];
		String minPriceGuitarStrings = guitarData.minPriceGuitarData(maxPrice)[3];
		
		int rightHandedCount = guitarData.rightHanded();
		int leftHandedCount = guitarData.leftHanded();
		
		System.out.printf("Kalleim elektrikitarr andmestikus on %s-keelne %s %s, mille hind on %s eurot.\n", maxPriceGuitarStrings, maxPriceBrand, maxPriceModel, maxPrice);
		System.out.printf("Odavaim elektrikitarr andmestikus on %s-keelne %s %s, mille hind on %s eurot.\n", minPriceGuitarStrings, minPriceBrand, minPriceModel, minPrice);
		
		System.out.printf("Paremakaelistele moeldud pille on andmestikus %d tykki ja vasakukaelistele %d tykki.\n\n", rightHandedCount, leftHandedCount);
		
	}
}

/*

[karlbork@greeny t03andmeklass]$ java GuitarData
Kalleim elektrikitarr andmestikus on 8-keelne Ibanez JCRG20138-BGA, mille hind on 4109.00 eurot.
Odavaim elektrikitarr andmestikus on 6-keelne Ibanez GRG121DX-BKF, mille hind on 253.00 eurot.
Paremakaelistele moeldud pille on andmestikus 14 tykki ja vasakukaelistele 7 tykki.

*/