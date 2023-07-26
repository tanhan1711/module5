package Product_update.service;

import Product_update.exception.NotFoundProductException;
import Product_update.model.HandGood;
import Product_update.util.ConstantUtil;
import Product_update.util.FileHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HandGoodService implements IProduct1Service<HandGood>{
    ArrayList<HandGood> handGoodList = new ArrayList<>();
    FileHelper fileHelper = new FileHelper();
    public HandGoodService() {
        handGoodList = mapToObject();
    }

    private ArrayList<HandGood> mapToObject() {
        ArrayList<HandGood> result = new ArrayList<>();

        List<String> lines = fileHelper.read(ConstantUtil.FilePath.handgood);
        for (String line : lines){
            if(!line.isEmpty()){
                String[] tmp = line.split(",");
                int id = Integer.parseInt(tmp[0]);
                String name = tmp[1];
                int price = Integer.parseInt(tmp[2]);
                String manufacturer = tmp[3];
                String country = tmp[4];
                String status = tmp[5];
                HandGood handGood = new HandGood(id,name,price,manufacturer,country,status);
                result.add(handGood);
            }
        }

        return result;
    }

    @Override
    public List<HandGood> findAll() {
        return handGoodList;
    }

    @Override
    public void create(HandGood handGood) {
        handGoodList.add(handGood);
        fileHelper.write(ConstantUtil.FilePath.handgood, handGoodList,false);
    }

    @Override
    public boolean findByName(String name) {
        for (int i = 0; i < handGoodList.size(); i++) {
            return handGoodList.get(i).getName().equals(name);
        }
        return false;
    }

    @Override
    public void delete(int id) throws NotFoundProductException {
        for (int i = 0; i < handGoodList.size(); i++) {
            if (handGoodList.get(i).getId() == id) {
                handGoodList.remove(i);
                fileHelper.write(ConstantUtil.FilePath.handgood, handGoodList,false);
                break;
            }
        }
        throw new NotFoundProductException("not found");
//        fileHelper.write(ConstantUtil.FilePath.handgood, handGoodList,false);
    }

    @Override
    public List<HandGood> search(String name) {
        return handGoodList.stream().filter(e -> e.getName().contains(name)).collect(Collectors.toList());
    }

    @Override
    public boolean findById(int id) {
        for (int i = 0; i < handGoodList.size(); i++) {
            return (handGoodList.get(i).getId() == (id));
        }
        return false;
    }
}
