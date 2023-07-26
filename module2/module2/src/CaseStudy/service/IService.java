package CaseStudy.service;

import java.util.List;

public interface IService<E> {
    List<E> findAll();
    void create();

    void delete(int Id);
    List<E> search(String name);
    void display();
}
