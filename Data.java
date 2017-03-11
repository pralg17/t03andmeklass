import java.io.*;
import java.net.URL;

public class Data{


	public static void main(String[] args) throws IOException {

		int lineAmount = 0;

		String urlString = "http://www.tlu.ee/~jaagup/andmed/muu/5klass.txt";
		URL site = new URL(urlString);
		BufferedReader reader = new BufferedReader(new InputStreamReader(site.openStream()));



		while ((reader.readLine()) != null)
		{
			lineAmount += 1;
		}

		reader.close();


		System.out.println(lineAmount);
		//File text = new File("test.txt");
		//text.createNewFile();

	}
}