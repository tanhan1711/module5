package BTLT3.Service;

import BTLT3.models.Authentic1;
import BTLT3.util.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AuthenticServices1 implements IProductService1<Authentic1> {
    private ArrayList<Authentic1> authentic1s = new ArrayList<>();
    private ReadAndWriteFile readAndWriteFile1 = new ReadAndWriteFile();


    public AuthenticServices1() {
        authentic1s = mapToObject();
    }

    public List<Authentic1> findAll() {
        return authentic1s;
    }

    public void create(Authentic1 authentic1) {
        authentic1s.add(authentic1);
        readAndWriteFile1.write("src/BTLT3/data/Authentic.csv", authentic1s,false);
    }

    public boolean findByName(String name) {
        for (int i = 0; i < authentic1s.size(); i++) {
            return authentic1s.get(i).getName().equals(name);
        }
        return false;
    }

    public void delete(int id) {
        for (int i = 0; i < authentic1s.size(); i++) {
            if (authentic1s.get(i).getId() == id) {
                authentic1s.remove(i);
                break;
            }
        }
        readAndWriteFile1.write("src/BTLT3/data/Authentic.csv", authentic1s,false);
    }

    public boolean findById(int id) {
        for (int i = 0; i < authentic1s.size(); i++) {
            return (authentic1s.get(i).getId() == (id));
        }
        return false;
    }

    public List<Authentic1> search(String name) {
        return authentic1s.stream().filter(e -> e.getName().contains(name)).collect(Collectors.toList());
    }

    private ArrayList<Authentic1> mapToObject() {
        ArrayList<Authentic1> result = new ArrayList<>();

        List<String> lines = ReadAndWriteFile.read("src/BTLT3/data/Authentic.csv");
        for (String line : lines) {
            if (!line.isEmpty()) {
                String[] tmp = line.split(",");
                System.out.println(tmp);
                int id = Integer.parseInt(tmp[0]);
                String name = tmp[1];
                int price = Integer.parseInt(tmp[2]);
                String manufacturer = tmp[3];
                String warrantyTime = tmp[4];
                Authentic1 authentic1 = new Authentic1(id, name, price, manufacturer, warrantyTime);
                result.add(authentic1);
            }
        }
            return result;
        }
    }


