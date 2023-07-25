package net.javaguides.springboot.controller;

import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("name") String query) {
        System.out.println("13123");
        return ResponseEntity.ok(productService.searchProducts(query));
    }

    @PostMapping("/searchSQL")
    public List<Product> searchProductsSQL(@RequestBody Product product) {
        String name = product.getName();
        String description = product.getDescription();
        System.out.println("成功");
        return productService.searchProductsSQL(name, description);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }
}
