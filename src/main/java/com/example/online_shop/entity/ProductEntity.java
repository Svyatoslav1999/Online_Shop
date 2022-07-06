package com.example.online_shop.entity;

import javax.persistence.*;

@Entity
@Table(name = "Products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 25, nullable = false)
    private String productName;

    @Column(unique = true)
    private String productIdentyfier;

    @Column(columnDefinition = "DOUBLE(5,2) not null")
    private Double productPrice;

    @OneToOne
    private ProductCategoryEntity productCategory;



}
