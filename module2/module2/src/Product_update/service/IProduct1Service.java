package Product_update.service;

import Product_update.exception.NotFoundProductException;

import java.util.List;

public interface IProduct1Service<E> {
    List<E> findAll();
    void create(E e);
    boolean findByName(String name);
     void delete(int Id) throws NotFoundProductException;
    List<E> search(String name);
    boolean findById(int id);

}
