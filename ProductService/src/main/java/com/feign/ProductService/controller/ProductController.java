package com.feign.ProductService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.ProductService.entity.Product;
import com.feign.ProductService.service.ProductService;


@RestController
@RequestMapping("/productservice")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	
	
	//GET and POST 
	
	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product1) {
	     return productService.saveProduct(product1);	
	}
	
	
	@GetMapping("/AllProducts")
	public List<Product> findAllProduct(){
		return productService.getProduct();
	}
	
	@GetMapping("/ProductById/{product_id}")
	public Product findProductById(@PathVariable int product_id) {
		return productService.getProductById(product_id);
	}
	//GET and POST END

		
}