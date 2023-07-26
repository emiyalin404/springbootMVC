package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String ItemName);

    // List<Product> searchProductsSQL(String name, String description);
    List<Product> AllProduct();

    Product AddProduct(Product product);

    Product UpdateProduct(Product product);

    Product createProduct(Product product);

    Product DeleteProduct(Product product);
}
