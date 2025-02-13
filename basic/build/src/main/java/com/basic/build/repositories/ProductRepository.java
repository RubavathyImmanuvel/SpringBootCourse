package com.basic.build.repositories;

import com.basic.build.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//DB
public interface ProductRepository extends JpaRepository<Product, Long> { //Long->primary key
}
