package com.product.clone.services;

import com.product.clone.dto.ProductDto;
import com.product.clone.entity.Product;
import com.product.clone.entity.User;
import com.product.clone.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final UserService userService;
    private final ProductRepository productRepository;

    public ProductService(UserService userService, ProductRepository productRepository) {
        this.userService = userService;
        this.productRepository = productRepository;
    }

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public ProductDto addProduct(ProductDto productDto){
        Product product =new Product();
        User user = userService.findByUserName(productDto.getUserName());
        product.setUser(user);
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        Product existProduct = productRepository.save(product);
        return new ProductDto(existProduct);
    }

}
