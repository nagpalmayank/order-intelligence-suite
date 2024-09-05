package com.business.order_intelligence_suite.repository;

import com.business.order_intelligence_suite.entity.Customer;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

  List<Customer> findByCustName(String custName);
}
