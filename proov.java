import java.io.*;
 public class proov{
 	public static void main(String[] args) throws IOException{
 		uuring proov=new uuring("http://www.tlu.ee/~jaagup/andmed/muu/kobras2015.txt");
 		System.out.println("Suurim tulemus antud v6istlusel oli " + proov.MaxTulemus(3) + " punkti");
 		System.out.println("Viimsist osales v6istlusel " + proov.MituViimsist(1) + " 6pilast");
 
 	}
 }
