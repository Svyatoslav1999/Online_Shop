package com.example.online_shop;

import com.example.online_shop.entity.ProductEntity;
import com.example.online_shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class OnlineShopApplication implements CommandLineRunner {

@Autowired
private ProductService productService;
    public static void main(String[] args) {
        SpringApplication.run(OnlineShopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


    }
}
