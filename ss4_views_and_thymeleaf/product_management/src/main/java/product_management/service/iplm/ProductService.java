package product_management.service.iplm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import product_management.model.Product;
import product_management.repository.IProductRepository;
import product_management.service.IProductService;

import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(int id) {
        return productRepository.findById(id);
    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public void remove(int id) {
        productRepository.remove(id);

    }

    @Override
    public void update(Product product) {
        productRepository.update(product);
    }

    @Override
    public List<Product> search(String name) {
        return productRepository.search(name);
    }
}
