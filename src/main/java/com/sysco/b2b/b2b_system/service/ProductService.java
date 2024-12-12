package com.sysco.b2b.b2b_system.service;

import com.sysco.b2b.b2b_system.dto.ProductDto;

import java.util.List;

public interface ProductService {
    ProductDto createProduct(ProductDto productDto);

    ProductDto getProductByID(Long productId);

    List<ProductDto> getAllProducts();

    ProductDto updateProduct(Long productId, ProductDto updatedProduct);

    void deleteProduct(Long productId);

}
