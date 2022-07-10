package com.example.online_shop.service;

import com.example.online_shop.entity.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ShopService {

    List<ProductEntity> findAllProducts();
}
