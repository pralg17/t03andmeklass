import java.io.*;
  public class failist{
   public static void main(String[] args) throws IOException{
     BufferedReader andmed= new BufferedReader(
     new FileReader("sisend.txt")
   );
  String rida=andmed.readLine();
  PrintWriter printer = new PrintWriter(new FileWriter("tulemus.txt"));
  while(rida!=null){
     String[] r=rida.split(",");
      double a1= Double.parseDouble(r[0]);
      double b1= Double.parseDouble(r[1]);
      double c1= Double.parseDouble(r[2]);
      double a2= Double.parseDouble(r[3]);
      double b2= Double.parseDouble(r[4]);
      double c2= Double.parseDouble(r[5]);
      double ppindala1 = a1*b1;
      double ruumala1 = a1*b1*c1;
      double ppindala2 = a2*b2;
      double ruumala2 = a2*b2*c2;
       printer.println("Toa poranda pindala on "+ppindala1+" ning selle toa ruumala on "+ruumala1+"\n\n"+
       "Toa poranda pindala on "+ppindala2+" ning selle toa ruumala on "+ruumala2+"\n\n");
        rida=andmed.readLine();
     }
     andmed.close();
     printer.close();
   }
 }

 // Toa poranda pindala on 30.0 ning selle toa ruumala on 90.0
 //
 // Toa poranda pindala on 100.0 ning selle toa ruumala on 300.0
