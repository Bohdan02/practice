package lesson117;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File f = new File("src/lesson117/input.txt");
        FileInputStream fis = null;
        int count = 0;

        int counter = 0;

        try {
            fis = new FileInputStream(f);
            while( (count = fis.read()) != -1 ) {
                System.out.println((char) count);
                if(count == 'k'|| count =='K'){
                    counter++;
                }
            }
        }catch(IOException e){
            System.out.println("File not found");
        }finally {
            try {fis.close();} catch(IOException e){}
        }
        System.out.println("Number of 'k' : " + counter);
    }
}
