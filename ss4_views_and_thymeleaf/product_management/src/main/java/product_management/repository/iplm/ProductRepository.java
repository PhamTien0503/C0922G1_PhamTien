package product_management.repository.iplm;

import org.springframework.stereotype.Repository;
import product_management.model.Product;
import product_management.repository.IProductRepository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductRepository implements IProductRepository {
    static List<Product>productList=new ArrayList<>();
    static {
        productList.add(new Product(1,"Sirius","Yamaha",20,340000000,"perfect"));
        productList.add(new Product(2,"Dream","Honda",20,140000000,"Slow"));
        productList.add(new Product(3,"Cup","Honda",19,120000000,"Old"));
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product findById(int id) {
        Product product=null;
        for (Product pr:productList) {
            if (pr.getId()==id){
                product=pr;
            }
        }
        return product;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public void remove(int id) {
        Product product=null;
        for (Product pr:productList) {
            if (pr.getId()==id){
                product=pr;
            }
        }
        productList.remove(product);

    }

    @Override
    public void update(int id, Product product) {
        Product productUpdate=null;
        for (Product pr:productList) {
            if (pr.getId()==id){
                productUpdate=pr;
            }
        }
        productUpdate.setName(product.getName());
        productUpdate.setMaker(product.getMaker());
        productUpdate.setQuantity(product.getQuantity());
        productUpdate.setCost(product.getCost());
        productUpdate.setDescription(product.getDescription());
    }

    @Override
    public List<Product> search(String name) {
        List<Product>products=new ArrayList<>();
        for (Product pr:productList) {
            if (pr.getName().contains(name)){
                products.add(pr);
            }
        }
        return products;
    }
}
