import java.io.*;
public class temperatuurideLugeja{
  public static void main(String[] args) throws IOException{
    BufferedReader lugeja= new BufferedReader(
    new FileReader("temperatuurid.txt")
    );
    String rida=lugeja.readLine();
	int loendur=0;
    PrintWriter kirjutaja = new PrintWriter(new FileWriter("vastus.txt"));
    while(rida!=null){
      loendur++;
      String[] r=rida.split(" ");
      double a=Double.parseDouble(r[0]);
      double b=Double.parseDouble(r[1]);
      double c=Double.parseDouble(r[2]);
      double d=Double.parseDouble(r[3]);
      double e=Double.parseDouble(r[4]);
	  double f=Double.parseDouble(r[5]);
	  double g=Double.parseDouble(r[6]);
	  double h=Double.parseDouble(r[7]);
	  double i=Double.parseDouble(r[8]);
	  double j=Double.parseDouble(r[9]);
	  double k=Double.parseDouble(r[10]);
	  double l=Double.parseDouble(r[11]);
      double aastaKeskmine = (a+b+c+d+e+f+g+h+i+j+k+l)/12;
      kirjutaja.println("Aasta keskmine temperatuur Eestis on "+aastaKeskmine);
      rida=lugeja.readLine();
    }
    lugeja.close();
    kirjutaja.close();
  }
}