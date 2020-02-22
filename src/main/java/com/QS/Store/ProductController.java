package com.QS.Store;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.QS.Store.Models.Product;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/products")
	public List<Product> getProducts(){
		
		return productRepository.findAll();
	}
	
	@PostMapping("/products")
	public Product createProduct(@Valid @RequestBody Product product) {
		
		return productRepository.save(product);
	}
	
	@GetMapping("/products/{id}")
	public Optional<Product> getProductById(@PathVariable(value = "id") int productId) {
		
		return productRepository.findById(productId);
	}

}
