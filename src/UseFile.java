import java.io.*;
import java.util.ArrayList;
import java.util.List;

class UseFile {

    UseFile() {
    }

    void CreateFile(String filename, String content) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(filename), "utf-8"
        ))) {
            writer.write(content);
            writer.close();
        } catch (IOException ex) {
            System.out.println("IOException");
        }
    }

    Double AvarageHeigt(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        List<String> heights = new ArrayList<>();
        String s;
        while ((s = reader.readLine()) != null) {
            heights.add(s);
        }

        int count = 0;
        double sum = 0.0;
        for (String s1 : heights) {
            // System.out.println(s1);
            String[] elements = s1.split(" ");
            int onePersonHeight = Integer.parseInt(elements[1]);
            // System.out.println(onePersonHeight);
            count++;
            sum = sum + onePersonHeight;
        }
        double avarage = sum / count;
        reader.close();
        return avarage;
    }
}