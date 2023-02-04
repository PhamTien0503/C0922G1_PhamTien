package product_management.repository;

import product_management.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();
    Product findById(int id);
    void save(Product product);
    void remove(int id);
    void update(int id,Product product);
    List<Product> search(String name);

}
