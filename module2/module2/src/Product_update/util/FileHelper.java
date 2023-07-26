package Product_update.util;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileHelper<E> {
    public  void write(String path, List<E> list, boolean isAppend){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path, isAppend))) {
            for(E e : list){
                System.out.println(e.toString());
                writer.write(e.toString());
                writer.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> read(String path){
        List<String> result = new ArrayList<>();

        if(Files.exists(Path.of(path))){
            try (BufferedReader reader = new BufferedReader(new FileReader(path))){
                String line;

                while ((line = reader.readLine()) != null){
                    result.add(line);
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}

