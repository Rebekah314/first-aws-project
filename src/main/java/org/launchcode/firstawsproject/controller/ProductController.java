package org.launchcode.firstawsproject.controller;

import org.launchcode.firstawsproject.model.Product;
import org.launchcode.firstawsproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    //insert product into database
    @PostMapping("/product")
    public ResponseEntity<Product> saveProduct(@RequestBody Product product) {
        Product savedProduct = productService.saveProduct(product);
        return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
    }

    //get single product by its id
    @GetMapping("/product")
    public ResponseEntity<Product> getProduct(@RequestParam(name = "productId") long productId) {
        Product product = productService.getProduct(productId);
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    //get all products from database
    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    //update an existing product in database
    @PatchMapping("/product")
    public ResponseEntity<Product> updateProduct(@RequestParam(name = "productId") long productId,
                                                 @RequestBody Product product) {
        Product updatedProduct = productService.updateProduct(productId, product);
        return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
    }

    //delete an existing product in database
    @DeleteMapping("/product")
    public ResponseEntity<Product> deleteProduct(@RequestParam(name="productId") long productId) {
        Product deletedProduct = productService.deleteProduct(productId);
        return new ResponseEntity<>(deletedProduct, HttpStatus.OK);
    }

    //get product by name using raw SQL statement
    @GetMapping("/products-by-name")
    public List<Product> getProductsByName(@RequestParam(name="productName") String productName) {
        return productService.getProductsByName(productName);
    }



}
