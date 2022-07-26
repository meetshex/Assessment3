package com.feign.ProductService.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import com.feign.ProductService.entity.Product;
import com.feign.ProductService.repository.ProductRepository;

@Service
public class ProductService {

	@Resource
	private ProductRepository productRepository;
	

	//POST AND GET
	
	public Product saveProduct(Product product1) {
		return productRepository.save(product1);
	}
	
	public List<Product> getProduct(){
		return productRepository.findAll();
	}
	
	public Product getProductById(int product_id) {
		return productRepository.findById(product_id).orElse(null);
	}
	
	// POST AND GET END
	
	}