package com.example.online_shop.entity;

import com.example.online_shop.enums.ProductFreshness;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter

@AllArgsConstructor
@NoArgsConstructor
@Builder


@Entity
@Table(name = "Products")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(length = 25, nullable = false)
    private String productName;

    @Column(unique = true, name = "productIdetyfier",nullable = false)
    private String productIdentyfier;

    @Enumerated(EnumType.STRING)
    private ProductFreshness productFreshness;

    @Column(columnDefinition = "DOUBLE(5,2) not null", name = "productPrice")
    private Double productPrice;

    @OneToOne
    private ProductCategoryEntity productCategory;



}
