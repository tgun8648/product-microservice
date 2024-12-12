package com.sysco.b2b.b2b_system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "supplier_brand_name")
    private String supplierBrandName;

    @Column(name = "supplier_id", nullable = false)
    private String supplierId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "product_description")
    private String productDescription;

    @Column(name = "product_images")
    private String productImages;


}
