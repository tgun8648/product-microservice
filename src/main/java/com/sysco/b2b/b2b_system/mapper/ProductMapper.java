package com.sysco.b2b.b2b_system.mapper;

import com.sysco.b2b.b2b_system.dto.ProductDto;
import com.sysco.b2b.b2b_system.entity.Product;

//remove
//use model mapper
//dependency injection
public class ProductMapper {

    // Converts Product entity to ProductDto
    public static ProductDto mapToProductDto(Product product) {
        return new ProductDto(
                product.getId(),
                product.getProductName(),
                product.getSupplierBrandName(),
                product.getSupplierId(),
                product.getQuantity(),
                product.getProductDescription(),
                product.getProductImages()
        );
    }

    // Converts ProductDto to Product entity
    public static Product mapToProduct(ProductDto productDto) {
        return new Product(
                productDto.getId(),
                productDto.getProductName(),
                productDto.getSupplierBrandName(),
                productDto.getSupplierId(),
                productDto.getQuantity(),
                productDto.getProductDescription(),
                productDto.getProductImages()
        );
    }
}
