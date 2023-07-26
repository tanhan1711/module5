package ss16.ReadCSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileCSV {
    public static void main(String[] args) {


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/ss16/ReadCSV/countries.csv"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(bufferedReader.readLine());
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
