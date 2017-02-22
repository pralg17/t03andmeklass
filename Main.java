import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		
		Data file = new Data("metal_bands_2017.csv");
		System.out.println(file.findFromTable(Integer.parseInt(args[0])));
		
	}
}

/* Console output

[richkaja@greeny t03andmeklass]$ java Main 1
Iron Maiden, 4195 fans

[richkaja@greeny t03andmeklass]$ java Main 2
�mheten, 0 fans

[richkaja@greeny t03andmeklass]$ java Main 3
--------------------------------
| Top|Band                |Fans |
--------------------------------
|   1|Iron Maiden         |4195 |
|   2|Iron Maiden         |4195 |
|   3|Opeth               |4147 |
|   4|Metallica           |3712 |
|   5|Megadeth            |3105 |
|   6|Amon Amarth         |3054 |
|   7|Slayer              |2955 |
|   8|Death               |2690 |
|   9|Dream Theater       |2329 |
|  10|Black Sabbath       |2307 |
--------------------------------


*/