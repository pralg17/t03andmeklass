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
 //
 // Auto kaugus maantee algusest on 3.0 km ja kiirus on 3.0 km/h.
 //  Auto asukoht 3 sekundi pärast on 3.000833 km,
 //  5 minuti pärast 3.25 km,
 //  ja 2 tunni pärast 9.0 km.
 //
 // Auto kaugus maantee algusest on 15.0 km ja kiirus on 100.0 km/h.
 //  Auto asukoht 3 sekundi pärast on 15.027766666666666 km,
 //  5 minuti pärast 23.333333333333332 km,
 //  ja 2 tunni pärast 215.0 km.
 //
 // Auto kaugus maantee algusest on 50.0 km ja kiirus on 95.0 km/h.
 //  Auto asukoht 3 sekundi pärast on 50.026378333333334 km,
 //  5 minuti pärast 57.916666666666664 km,
 //  ja 2 tunni pärast 240.0 km.
 //
 // Auto kaugus maantee algusest on 30.0 km ja kiirus on 99.0 km/h.
 //  Auto asukoht 3 sekundi pärast on 30.027489000000006 km,
 //  5 minuti pärast 38.25000000000001 km,
 //  ja 2 tunni pärast 228.00000000000003 km.
