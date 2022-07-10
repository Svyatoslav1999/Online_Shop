package com.example.online_shop.repository;

import com.example.online_shop.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepository extends JpaRepository<ProductEntity, Long> {
}
