package com.business.order_intelligence_suite.repository;

import com.business.order_intelligence_suite.entity.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
   List<Product> findByProductName(String productName);

  // default void deleteByName(String productName);
}
