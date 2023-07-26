package ss16.bai2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {


    public static void main(String[] args) {
        try {
            BufferedReader  bufferedReader = new BufferedReader(new FileReader("src/ss16/bai2/doc.txt"));
            String line ;
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
            }
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }
