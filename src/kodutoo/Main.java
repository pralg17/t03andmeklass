package kodutoo;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Palk palgad = new Palk("MOCK_DATA.csv");
        System.out.printf("Average wage: %.2f", palgad.average());
        System.out.println("\nMax wage: " + palgad.minMax("max"));
        System.out.println("\nMin wage: " + palgad.minMax("min"));
    }
}

/*
Average wage: 497.26
Max wage: Philip, Ramos, 998.86
Min wage: Phyllis, Cooper, 0.88
 */
