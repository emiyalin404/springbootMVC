package net.javaguides.springboot.controller;

import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.service.ProductService;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam("ITEM_NAME") String ItemName) {
        System.out.println("13123" + ItemName);
        System.out.println(productService);
        System.out.println(productService.searchProducts(ItemName));
        return productService.searchProducts(ItemName);
        // return ResponseEntity.ok(productService.searchProducts(ItemName));
    }

    @GetMapping("/Alldata")
    public List<Product> AllProduct() {
        System.out.println("aaaaa");
        return productService.AllProduct();
    }

    @PostMapping("/AddProduct")
    public Map<String, Object> AddProduct(@RequestBody Product product) {
        String ItemNo = product.getITEM_NO();
        String ItemName = product.getITEM_NAME();
        String Tax = product.getTAX();
        String Creator = product.getCREATOR();
        System.out.println(ItemNo);
        System.out.println(ItemName);
        System.out.println(Tax);
        System.out.println(Creator);
        Map<String, Object> resultMap = new HashMap<>();
        if (ItemName == null) {
            resultMap.put("Status", "Y");
            resultMap.put("Message", "新增成功");
        } else {
            resultMap.put("Status", "N");
            resultMap.put("Message", "新增失败");
        }
        // System.out.println(resultMap);
        productService.AddProduct(product);
        return resultMap;
    }

    @PostMapping("/UpdateProduct")
    public Map<String, Object> UpdateProduct(@RequestBody Product product) {
        String ItemNo = product.getITEM_NO();
        String ItemName = product.getITEM_NAME();
        String EFF_DATE_TO = product.getEFF_DATE_TO();
        String Creator = product.getCREATOR();
        System.out.println(ItemNo);
        System.out.println(ItemName);
        System.out.println(EFF_DATE_TO);
        System.out.println(Creator);
        productService.UpdateProduct(product);

        Map<String, Object> resultMap = new HashMap<>();
        if (ItemName != null) {
            resultMap.put("Status", "Y");
            resultMap.put("Message", "修改成功");
        } else {
            resultMap.put("Status", "N");
            resultMap.put("Message", "修改失败");
        }
        return resultMap;
    }

    @PostMapping("/DeleteProduct")
    public Map<String, Object> DeleteProduct(@RequestBody Product product) {
        String ItemNo = product.getITEM_NO();
        System.out.println(ItemNo);
        Map<String, Object> resultMap = new HashMap<>();
        if (ItemNo != null) {
            resultMap.put("Status", "Y");
            resultMap.put("Message", "刪除成功");
        } else {
            resultMap.put("Status", "N");
            resultMap.put("Message", "刪除失败");
        }
        productService.DeleteProduct(product);
        return resultMap;
    }
    // @PostMapping("/searchSQL")
    // public List<Product> searchProductsSQL(@RequestBody Product product) {
    // String name = product.getName();
    // String description = product.getDescription();
    // System.out.println("成功");
    // return productService.searchProductsSQL(name, description);
    // }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }
}
