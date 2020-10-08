package lesson114;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String pathToDir = "C:\\data";
        Path p = Paths.get(pathToDir);
        System.out.println(Files.exists(p));
        try {
            Files.createDirectories(p);
        } catch (IOException e) {
            System.out.println("Couldnt not create dir");
        }
        File f2 = new File(pathToDir+2);
        f2.mkdir();

        File f = new File("C:/data/input.txt");
        try {
            f.createNewFile();
        }catch (IOException e){
            System.out.println("Could not create file");
        }
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(f);
            pw.print("lesson 114 input output");
        }catch(FileNotFoundException e){
            System.out.println("Could not find file");
        }finally {
            pw.flush();
            pw.close();
        }

        System.out.println(f.length());

        f.renameTo(new File("C:/data/inputNew.txt"));

        f.renameTo(new File("C:/data2/input.txt"));
    }
}
