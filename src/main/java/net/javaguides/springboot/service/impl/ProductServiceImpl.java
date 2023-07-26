package net.javaguides.springboot.service.impl;

import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.repository.ProductRepository;
import net.javaguides.springboot.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> searchProducts(String ItemName) {
        return productRepository.searchProducts(ItemName);
    }

    @Override
    public List<Product> AllProduct() {
        return productRepository.AllProduct();
    }

    @Override
    @Transactional
    public Product AddProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product UpdateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product DeleteProduct(Product product) {
        return productRepository.save(product);
    }

    // @Override
    // public List<Product> searchProductsSQL(String name, String description) {
    // return productRepository.searchProductsSQL(name, description);
    // }
}
