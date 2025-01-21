package com.sysco.b2b.b2b_system.dto;

import com.sysco.b2b.b2b_system.enums.ProductCategory;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private Long id;

    @NotBlank(message = "Product name is required")
    @Size(max = 100, message = "Product name cannot exceed 100 characters")
    private String productName;

    @NotBlank(message = "Supplier brand name is required")
    private String supplierBrandName;

    @NotBlank(message = "Supplier ID is required")
    private String supplierId;

    @NotNull(message = "Quantity is required")
    @Min(value = 1, message = "Quantity must be at least 1")
    private Integer quantity;

    private String productDescription;

    private String productImages;

    @NotNull(message = "Price is required")
    @Min(value = 0, message = "Price must be at least 0")
    private Double price;

    private ProductCategory category;

}

//java validation library