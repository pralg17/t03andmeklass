import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        UseFile uf = new UseFile();
        uf.CreateFile("Pikkused.txt",
                "Hinrek 191\nPeeter 180\nAnne 158\nSiiri 163\nMadis 178");

        try {
            System.out.println("Keskmine pikkus on: "+ uf.AvarageHeigt("Pikkused.txt") + "cm");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            uf.CreateFile("Keskminepikkus.txt", uf.AvarageHeigt("Pikkused.txt").toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}



// Keskmine pikkus on: 174.0cm