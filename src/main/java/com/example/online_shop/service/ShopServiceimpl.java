package com.example.online_shop.service;


import com.example.online_shop.entity.ProductEntity;
import com.example.online_shop.repository.ShopRepository;
import liquibase.pro.packaged.O;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShopServiceimpl implements ShopService {

    private  final ShopRepository shopRepository;

    @Override
    public List<ProductEntity> findAllProducts() {
        return shopRepository.findAll();
    }
}
