package bai2.service;

import bai2.model.CanBo;

import java.util.List;

public interface ICanBoService {
    List<CanBo> findAll();
    void create(CanBo canBo);
    boolean findByName(String name);
    List<CanBo> search(String name);
}
