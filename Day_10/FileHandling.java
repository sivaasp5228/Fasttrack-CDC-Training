import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("kpr.txt");
            BufferedReader br = new BufferedReader(reader);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error Reading file");
        }
    }
}