package com.product.clone.dto;

import com.product.clone.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    private Long id;
    private String name;
    private Long price;
    private String userName;
    public ProductDto(Product existProduct) {

    }
}
