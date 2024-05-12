package org.launchcode.firstawsproject.repository;

import org.launchcode.firstawsproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    //access modifiers are not needed in an interface

    @Query(value = "SELECT * FROM product_inventory WHERE product_name = ?1", nativeQuery = true)
    List<Product> getProductsByName(String productName);

    //"?1" is the syntax for the first argument of this method
    //So thw query becomes:
    //"Select all columns from the product_inventory table where the
    //product_name is equal to the first argument of this method
}
