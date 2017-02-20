import java.io.*;
public class proov{
	public static void main(String[] args) throws IOException{
		uuring proov=new uuring("http://www.tlu.ee/~jaagup/andmed/muu/kobras2015.txt");
		System.out.println("Suurim tulemus antud võistlusel oli " + proov.MaxTulemus(3) + " punkti");
		System.out.println("Tallinna Reaalkoolist osales võistlusel " + proov.MituSakust(1) + " õpilast");

	}
}
/*
Suurim tulemus antud võistlusel oli 120.0 punkti
Saku Gümnaasiumist osales võistlusel 54.0 õpilast
*/
