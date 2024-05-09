package org.launchcode.firstawsproject.repository;

import org.launchcode.firstawsproject.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
