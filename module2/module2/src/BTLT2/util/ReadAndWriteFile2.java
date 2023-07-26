package BTLT2.util;

import BTLT2.models.Truck;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile2 {
    public void writeFile(String pathFile, List<Truck> trucks, boolean append){
        File file = new File((pathFile));
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,append);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Truck t :trucks){
                bufferedWriter.write(t.toString());
            }
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
//    public List<String> read(String path){
//        List<String> result = new ArrayList<>();
//
//        if(Files.exists(Path.of(path))){
//            try (BufferedReader reader = new BufferedReader(new FileReader(path))){
//                String line;
//
//                while ((line = reader.readLine()) != null){
//                    result.add(line);
//                }
//            }
//            catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        return result;
//    }
}
