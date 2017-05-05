import java.io.IOException;

/**
 * Created by tatja on 4/21/2017.
 */
public class KasutaLinnad {
    public static void main(String[] args) throws IOException{
        System.out.println("Teeme mitu tegevust eesti maakonnalinnaga!");
        Linnad kasutus = new Linnad("http://www.tlu.ee/~tanjak/javaandmed/andmed.txt");
        System.out.println(" Eesti suurimas maakonnalinnas on " + kasutus.maksimum(3) + " elanikut");
        System.out.println(" Eesti väiksemas maakonnalinnas on " + kasutus.minimum(3) + " elanikut");
    }
}
