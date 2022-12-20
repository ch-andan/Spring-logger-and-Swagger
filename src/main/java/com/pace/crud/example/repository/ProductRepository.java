package com.pace.crud.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pace.crud.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
}
