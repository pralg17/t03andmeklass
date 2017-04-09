import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Reader Research=new Reader("wages.csv");
		System.out.println("Worker with the highest wage:");
		System.out.println(Research.getMax(1,2,3));
	}
}

/*

Koodi käivitamisel:

Worker with the highest wage:
[Deborah, Webb, 986.09]

*/