package com.example.online_shop.service;

import com.example.online_shop.entity.ProductEntity;

import java.util.List;

public interface ProductService {

    ProductEntity saveProduct();

    List<ProductEntity> getAllProducts();

    }
