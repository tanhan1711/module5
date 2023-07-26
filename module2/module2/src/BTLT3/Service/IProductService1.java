package BTLT3.Service;

import java.util.List;

public interface IProductService1<E>{
    List<E> findAll();
    void create(E e);
    boolean findByName(String name);
    void delete(int Id);
    List<E> search(String name);
    boolean findById(int id);
}
