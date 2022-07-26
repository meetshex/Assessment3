package com.feign.UserService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.UserService.entity.FeignProduct;
import com.feign.UserService.repository.FeignRepository;

@RestController
@RequestMapping("/userservice")
public class FeignController {

	@Autowired
	private FeignRepository feignRep;
	
	@GetMapping("/AllProducts")
	public List<FeignProduct> getAllProducts() {
		return feignRep.getProducts();
	}
	
	@GetMapping("/ProductById/{product_id}")
	public FeignProduct findProductById(@PathVariable Integer product_id) {
		return feignRep.getProductById(product_id);
	}
	
}

