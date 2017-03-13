
public class Run{

	public static void main(String[] args) {
		Data dt = new Data("http://www.tlu.ee/~jaagup/andmed/muu/5klass.txt");

		//System.out.println(dt.data[0][0]);
		System.out.println(dt.avgMales());
		System.out.println(dt.avgFemales());
		System.out.println(dt.avgHeight());
	}
}
