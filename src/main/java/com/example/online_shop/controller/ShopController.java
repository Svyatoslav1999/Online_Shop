package com.example.online_shop.controller;

import com.example.online_shop.entity.ProductEntity;
import com.example.online_shop.repository.ShopRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/onlineshop")
public class ShopController {

    private  final ShopRepository shopRepository;

    public ShopController(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }


@GetMapping("")
    public List<ProductEntity> findAllProducts() {
    return shopRepository.findAll();
}
}

