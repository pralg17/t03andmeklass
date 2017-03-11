import com.sun.xml.internal.ws.util.StringUtils;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Data{


	public static void main(String[] args) throws IOException {


		String webUrl = "http://www.tlu.ee/~jaagup/andmed/muu/5klass.txt";
		String out = new Scanner(new URL(webUrl).openStream(), "UTF-8").useDelimiter("\\A").next();
		System.out.println(out);

		String lines[] = out.split("\\r?\\n");




		//IOUtils.toString(URL url)
		//File text = new File("test.txt");
		//text.createNewFile();

	}
}