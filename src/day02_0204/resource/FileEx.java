package day02_0204.resource;

import java.io.FileWriter;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) {

        FileWriter file = null;

        try {
            file =  new FileWriter("data.txt");
            file.write("java Aveanced ");
        } catch (IOException e) {
            throw new RuntimeException(e);
            //throw new RuntimeException(e);
        } finally {
            try {
                file.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
