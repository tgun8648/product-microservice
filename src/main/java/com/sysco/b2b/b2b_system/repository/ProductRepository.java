package com.sysco.b2b.b2b_system.repository;

import com.sysco.b2b.b2b_system.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
