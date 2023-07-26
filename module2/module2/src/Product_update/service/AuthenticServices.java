package Product_update.service;

import Product_update.exception.NotFoundProductException;
import Product_update.model.Authentic;
import Product_update.util.ConstantUtil;
import Product_update.util.FileHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AuthenticServices implements IProduct1Service<Authentic>{
    private ArrayList<Authentic> authenticList = new ArrayList<>();
    private FileHelper fileHelper = new FileHelper();
    public AuthenticServices() {
        authenticList = mapToObject();
    }

    private ArrayList<Authentic> mapToObject() {
        ArrayList<Authentic> result = new ArrayList<>();

        List<String> lines = fileHelper.read(ConstantUtil.FilePath.authentic);
        for (String line : lines){
            if(!line.isEmpty()){
                String[] tmp = line.split(",");
                int id = Integer.parseInt(tmp[0]);
                String name = tmp[1];
                int price = Integer.parseInt(tmp[2]);
                String manufacturer = tmp[3];
                int warranty = Integer.parseInt(tmp[4]);
                Authentic authentic = new Authentic(id,name,price,manufacturer,warranty);
                result.add(authentic);
            }
        }

        return result;
    }


    @Override
    public List<Authentic> findAll() {
        return authenticList;
    }

    @Override
    public void create(Authentic authentic) {
        authenticList.add(authentic);
        fileHelper.write(ConstantUtil.FilePath.authentic, authenticList,false);
    }

    @Override
    public boolean findByName(String name) {
        for (int i = 0; i < authenticList.size(); i++) {
            return authenticList.get(i).getName().equals(name);
        }
        return false;
    }

    @Override
    public void delete(int id) throws NotFoundProductException {
        for (int i = 0; i < authenticList.size(); i++) {
            if (authenticList.get(i).getId() == id) {
                authenticList.remove(i);
                fileHelper.write(ConstantUtil.FilePath.authentic, authenticList,false);
                break;
            }
        }
        throw new NotFoundProductException("Not Found ");
//        fileHelper.write(ConstantUtil.FilePath.authentic, authenticList,false);
    }

    @Override
    public List<Authentic> search(String name) {
        return authenticList.stream().filter(e -> e.getName().contains(name)).collect(Collectors.toList());
    }

    @Override
    public boolean findById(int id) {
        for (int i = 0; i < authenticList.size(); i++) {
            return (authenticList.get(i).getId() == (id));
        }
        return false;
    }
}
