package com.feign.UserService.repository;


import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//import com.feign.UserService.controller.FeignController;
import com.feign.UserService.entity.FeignProduct;





@FeignClient(value="ProductService", url="http://localhost:8084/productservice/")
public interface FeignRepository {

@GetMapping("/AllProducts")
List<FeignProduct> getProducts();

@GetMapping("/ProductById/{product_id}")
public FeignProduct getProductById(@PathVariable("product_id") Integer product_id);



}