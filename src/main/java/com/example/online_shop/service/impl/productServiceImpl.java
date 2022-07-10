package com.example.online_shop.service.impl;


import com.example.online_shop.entity.ProductEntity;
import com.example.online_shop.repository.ProductRepository;
import com.example.online_shop.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class productServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductEntity saveProduct() {
        ProductEntity meet = ProductEntity
                .builder()
                .productName("meet")
                .productIdentyfier("meet_1")
                .productCategory(null)
                .build();
        productRepository.save(meet);
        return meet;
    }

    @Override
    public List<ProductEntity> getAllProducts() {

        return productRepository.findAll();
    }
}
