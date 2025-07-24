package model.dao;

import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Seller finById(Integer id);
    List<Seller> findAll();
}
