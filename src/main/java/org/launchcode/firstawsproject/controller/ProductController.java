package org.launchcode.firstawsproject.controller;

import org.launchcode.firstawsproject.model.Product;
import org.launchcode.firstawsproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    //insert product into database
    @PostMapping("/product")
    public ResponseEntity<Product> saveProduct(Product product) {
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

    //update an existing product in database

    //delete an existing product in database

    //get product by name using raw SQL statement

}
