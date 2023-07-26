package ss16.CopyFile;

import java.io.*;
//import java.nio.file.Files;
//import java.nio.file.Path;

public class CopyFile {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/ss16/CopyFile/source.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/ss16/CopyFile/des.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                bufferedWriter.write(line);
                bufferedWriter.newLine();

            }
            System.out.println(bufferedReader.readLine());
            bufferedWriter.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
