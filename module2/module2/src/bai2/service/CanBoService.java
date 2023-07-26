package bai2.service;

import bai2.model.CanBo;
import bai2.util.ConstantUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CanBoService implements ICanBoService {
    List<CanBo>canBos = new ArrayList<>();

    public CanBoService() {
        canBos.add(new CanBo("long", ConstantUtil.TypeofPosition1.giamdoc,20000));
        canBos.add(new CanBo("long1", ConstantUtil.TypeofPosition1.truongphong,10000));
        canBos.add(new CanBo("long2", ConstantUtil.TypeofPosition1.khong,5000));
    }

    @Override
    public List<CanBo> findAll() {
        return canBos;
    }

    @Override
    public void create(CanBo canBo) {
         canBos.add(canBo);
    }

    @Override
    public boolean findByName(String name) {
        for (int i = 0; i <canBos.size() ; i++) {
            return canBos.get(i).equals(name);
        }
        return false;
    }

    @Override
    public List<CanBo> search(String name) {
        return canBos.stream().filter(e -> e.getHoTen().contains(name)).collect(Collectors.toList());
    }
}
