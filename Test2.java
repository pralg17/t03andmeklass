import java.io.File;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Test2 {
	public static void main(String[] argument)throws IOException{
		int[] data=faililugeja("Elekter.txt");
		//System.out.println(Arrays.toString(data));
		int vastus = keskmine(data);
		int vastus1 = suurim(data);
		int vastus2 = indeks(data, vastus1);
		double vastus3 = standardhälve(data);
		PrintWriter faili1=new PrintWriter(new FileWriter("vastus1.txt"));
		faili1.println("Programm uurib elektri tarbimist kuu jooksul");
		faili1.println("Keskmine tarbimine päevas on "+vastus+" MWh");
		faili1.println("Suurim elektritarbimine on "+vastus1+" MWh See toimus "+vastus2+" Päeval");
		faili1.println("Suurim elektritarbimise standardhälve "+vastus3 );
		faili1.close();
	}
	 public static int[] faililugeja(String file){
		 try{
			 File f=new File(file);
			 Scanner s= new Scanner(f);
			 int ctr=0;
			 while(s.hasNextInt()){
				 ctr++;
				 s.nextInt();
			 }
			 int[] arr = new int[ctr];
			 Scanner s1 = new Scanner(f);
			 for(int i =0; i<arr.length; i++)
				 arr[i]=s1.nextInt();
			 return arr;
		 }
		 catch(Exception e){
			 return null;
		 } 
	 }
	 public static int keskmine(int[] data){
		int tulemus=1;
		for (int i=0; i<data.length; i++)
			tulemus=tulemus+data[i];
		tulemus=tulemus/data.length;
		return tulemus;
	}
	public static int suurim(int[] data){
		int tulemus=0;
		for (int i=0; i<data.length; i++)
			if(tulemus<data[i])
				tulemus=data[i];	
		return tulemus;
	}
	public static int indeks(int[] data, int arv){
		int tulemus=0;
		for (int i=0; i<data.length; i++)
			if(arv<data[i])
				tulemus=i;
		return tulemus;
	}
	public static double standardhälve(int[] data){
		int tulemus=0;
		double tulemused=0;
		int ruut=0;
		int[] ar = new int[data.length];
		for (int i=0; i<data.length; i++){
			tulemus=tulemus+data[i];}
		tulemus=tulemus/data.length;
		for (int i=0; i<data.length; i++){
			ruut = data[i]-tulemus;
			ar[i]=ruut;}
		for (int i=0; i<ar.length; i++)
			tulemus=tulemus+data[i];
		tulemus=tulemus/data.length;
		tulemused=Math.sqrt(tulemus);
		return Math.round(tulemused);
	}
}