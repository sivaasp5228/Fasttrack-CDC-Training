// There is a class in java like Scanner for file handling.
// CRUD - Create, Read, Update, Delete Operations Using File Handling in Java
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class FileHandling {
    public static void main(String[] args) {
        //File file = new File("data.txt");
        //System.out.println("File Name : " + file.getName());
        //System.out.println("Exists : " + file.exists());
        //System.out.println("Path : " + file.getAbsolutePath());
        //FileCreation
        //File file = new File("kpr.txt");
        //try {
        //    if (file.createNewFile()) {
        //        System.out.println("File Created");
        //    } else {
        //        System.out.println("File Already Exists");
        //    }
        //}
        //catch (IOException e) {
        //    System.out.println("Unable to create file");
        //}

        //FileWriter
        //try {
        //    FileWriter fw = new FileWriter("kpr.txt",true);

        //    fw.write("Hello KPRCAS \n Welcome to Java Programming \n File Handling in Java \n Meiyazhagan \n Sivaa");
        //    fw.close();
        //    System.out.println("Data written to file successfully");
        //} catch (IOException e) {
        //    System.out.println("error writing file");
        //}

        //FileReader
        //try {
        //    FileReader fr = new FileReader("kpr.txt");
        //    int data;
        //    while((data = fr.read())  != -1) {
        //        System.out.print((char)data);
        //    }
        //    fr.close();
        //} catch (IOException e) {
        //    System.out.println("error reading file");
        //}

        //Buffered Reader

    }
}