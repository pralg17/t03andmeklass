import java.io.IOException;

public class Run{

public static void main(String[] args) throws IOException {
	Data dt = new Data("http://www.tlu.ee/~jaagup/andmed/muu/5klass.txt");
	String avgFem = "Naiste keskmine kogus on: " + Float.toString(dt.avgFemales()) + "\n";
	String avgMales = "Meeste keskmine kogus on: " + Float.toString(dt.avgMales()) + "\n";
	String avgHeight = "Inimeste keskmine pikkus on: " + Float.toString(dt.avgHeight()) + "\n";
	String avgMass = "Inimeste keskmine kaal on: " + Float.toString(dt.avgMass()) + "\n";


	dt.writeData(avgFem, avgMales, avgHeight, avgMass);









}
}
