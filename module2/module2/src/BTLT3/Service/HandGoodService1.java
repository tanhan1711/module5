package BTLT3.Service;

import BTLT3.models.HandGood1;
import BTLT3.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HandGoodService1 implements IProductService1<HandGood1> {
    private ArrayList<HandGood1> handGood1s = new ArrayList<>();
    private ReadAndWriteFile readAndWriteFile2 = new ReadAndWriteFile();

    public HandGoodService1() {
        handGood1s = mapToObject();
    }

    private ArrayList<HandGood1> mapToObject() {
        ArrayList<HandGood1> result1 = new ArrayList<>();

        List<String> lines = ReadAndWriteFile.read("src/BTLT3/data/HandGood.csv");
        for (String line : lines) {
            if (!line.isEmpty()) {
                String[] tmp = line.split(",");
                System.out.println(tmp);
                int id = Integer.parseInt(tmp[0]);
                String name = tmp[1];
                int price = Integer.parseInt(tmp[2]);
                String manufacturer = tmp[3];
                String country = tmp[4];
                String status = tmp[5];
                HandGood1 handGood1 = new HandGood1(id, name, price, manufacturer, country,status);
                result1.add(handGood1);
            }
        }
        return result1;
    }


    public List<HandGood1> findAll(){
        return handGood1s;
    }

    public void create(HandGood1 handGood1){
        handGood1s.add(handGood1);
        readAndWriteFile2.write("src/BTLT3/data/HandGood.csv", handGood1s,false);

    }

    public boolean findByName(String name){
        for (int i = 0; i < handGood1s.size(); i++) {
//            if(trucks.get(i).getDriverPlate().equals(driverPlate)){
//                return true;
//            }

            return handGood1s.get(i).getName().equals(name);
        }

        return false;
    }

    public void delete(int id){
        for (int i = 0; i < handGood1s.size(); i++) {
            if(handGood1s.get(i).getId()==id){
                handGood1s.remove(i);
                break;
            }
        }
    }
    public boolean findById(int id){
        for (int i = 0; i < handGood1s.size(); i++) {
//            if(trucks.get(i).getDriverPlate().equals(driverPlate)){
//                return true;
//            }

            return ( handGood1s.get(i).getId()==(id));
        }

        return false;
    }

    public List<HandGood1> search(String name){
        return handGood1s.stream().filter(e -> e.getName().contains(name)).collect(Collectors.toList());
    }
}
