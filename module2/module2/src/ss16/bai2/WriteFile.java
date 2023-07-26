package ss16.bai2;

import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.IOException;
import java.nio.Buffer;

public class WriteFile {
    public static void main(String[] args) {

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file duoc tao ra.txt"));
            bufferedWriter.write("dakjsdhjk");
            bufferedWriter.write("123");
            bufferedWriter.write("\n456");
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }
