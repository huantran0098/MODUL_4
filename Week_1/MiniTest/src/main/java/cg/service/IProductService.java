package cg.service;

import cg.model.Product;

import java.util.ArrayList;

public interface IProductService {
    ArrayList<Product> findAll();
    Product findById(int id);
    ArrayList<Product> findByKeyword(String keyword);
    Product save(Product product);
    Product delete(int id);
}
