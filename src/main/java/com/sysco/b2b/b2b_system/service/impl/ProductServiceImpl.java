package com.sysco.b2b.b2b_system.service.impl;

import com.sysco.b2b.b2b_system.dto.ProductDto;
import com.sysco.b2b.b2b_system.entity.Product;
import com.sysco.b2b.b2b_system.exception.ResourceNotFoundExcpetion;
import com.sysco.b2b.b2b_system.mapper.ProductMapper;
import com.sysco.b2b.b2b_system.repository.ProductRepository;
import com.sysco.b2b.b2b_system.service.ProductService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Override
    public ProductDto createProduct(ProductDto productDto) {
        // Convert ProductDto to Product entity
        Product product = modelMapper.map(productDto, Product.class);

        // Save the Product entity
        Product savedProduct = productRepository.save(product);

        // Convert saved Product entity back to ProductDto
        return modelMapper.map(savedProduct, ProductDto.class);
    }

    @Override
    public ProductDto getProductByID(Long productId) {
        // Retrieve the product by ID
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundExcpetion("Product not found with ID: " + productId));

        // Return the product entity as a ProductDto using ModelMapper
        return modelMapper.map(product, ProductDto.class);
    }

    @Override
    public List<ProductDto> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream()
                .map(product -> modelMapper.map(product, ProductDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProductDto updateProduct(Long productId, ProductDto updatedProduct) {
        // Find existing product or throw exception
        Product existingProduct = productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundExcpetion("Product not found with ID: " + productId));

        // Update fields
        existingProduct.setProductName(updatedProduct.getProductName());
        existingProduct.setSupplierBrandName(updatedProduct.getSupplierBrandName());
        existingProduct.setSupplierId(updatedProduct.getSupplierId());
        existingProduct.setQuantity(updatedProduct.getQuantity());
        existingProduct.setProductDescription(updatedProduct.getProductDescription());
        existingProduct.setProductImages(updatedProduct.getProductImages());

        // Save updated product
        Product updatedProductEntity = productRepository.save(existingProduct);

        // Return updated product as DTO
        return modelMapper.map(updatedProductEntity, ProductDto.class);
    }

    @Override
    public void deleteProduct(Long productId) {
        // Check if the product exists
        Product existingProduct = productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundExcpetion("Product not found with ID: " + productId));

        // Delete the product
        productRepository.delete(existingProduct);
    }


}












//throw exceptions
//catch from controller layer
//custom excpetions to bff
