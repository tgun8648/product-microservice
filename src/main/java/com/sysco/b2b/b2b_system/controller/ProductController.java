package com.sysco.b2b.b2b_system.controller;

import com.sysco.b2b.b2b_system.dto.ProductDto;
import com.sysco.b2b.b2b_system.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("${api.base-url}/products")
public class ProductController extends AbstractController<ProductDto, Long> {

    private final ProductService productService;

    @Override
    public ResponseEntity<ProductDto> create(ProductDto dto) {
        ProductDto savedProduct = productService.createProduct(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedProduct);
    }

    @Override
    public ResponseEntity<ProductDto> getById(Long id) {
        ProductDto productDto = productService.getProductByID(id);
        return ResponseEntity.ok(productDto);
    }

    @Override
    public ResponseEntity<List<ProductDto>> getAll() {
        List<ProductDto> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @Override
    public ResponseEntity<ProductDto> update(Long id, ProductDto dto) {
        ProductDto updatedProduct = productService.updateProduct(id, dto);
        return ResponseEntity.ok(updatedProduct);
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        productService.deleteProduct(id);
        return new ResponseEntity<>("Product deleted successfully.", HttpStatus.OK);
    }
}






//error handleing, exception handlening
//abstract controller
//base url in a config file



