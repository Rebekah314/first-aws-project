package org.launchcode.firstawsproject.service;

import org.launchcode.firstawsproject.model.Product;
import org.launchcode.firstawsproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product getProduct(long productId) {
        return productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        //TO DO: define a custom exception to return a 404 back to the user here!!
    }
}
