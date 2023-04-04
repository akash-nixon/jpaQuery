package com.testsigma.jpaQuery.Repository;

import com.testsigma.jpaQuery.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
