package org.launchcode.firstawsproject.service;

import org.launchcode.firstawsproject.model.Product;
import org.launchcode.firstawsproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product updateProduct(long productId, Product product) {
        Product existingProduct = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        existingProduct.setProductName(product.getProductName());
        existingProduct.setColor(product.getColor());
        existingProduct.setPrice(product.getPrice());
        productRepository.save(existingProduct);
        return existingProduct;
    }

    public Product deleteProduct(long productId) {
        Product existingProduct = productRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        productRepository.deleteById(productId);
        return existingProduct;
    }
}
