package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    List<Product> searchProductsSQL(String name, String description);

    Product createProduct(Product product);
}
