package day11.io.rw;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("/Users/taegeun/exercise/mememe.txt")) {
            String s = "testTTTTTTTTing\nsetIIIIIIIIImg";
            fw.write(s);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
