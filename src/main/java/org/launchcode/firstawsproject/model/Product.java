package org.launchcode.firstawsproject.model;

//NOTE: Lombok is installed, so this program will recognize Lombok annotations

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "product_inventory")
@Data   //this is Lombok annotation that implicitly includes getters and setters
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "color")
    private String color;

    @Column(name = "price")
    private int price;




}
