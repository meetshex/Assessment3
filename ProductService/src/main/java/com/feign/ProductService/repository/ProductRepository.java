package com.feign.ProductService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feign.ProductService.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
