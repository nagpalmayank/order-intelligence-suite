//package com.business.order_intelligence_suite.service;
//
//import com.business.order_intelligence_suite.entity.Customer;
//import com.business.order_intelligence_suite.repository.CustomerRepository;
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomerService {
//  @Autowired
//  private CustomerRepository customerRepository;
//
//  public Customer createCustomer(Customer customer)
//  {
//    return customerRepository.save(customer);
//  }
//  public List<Customer> getCustomer()
//  {
//    return customerRepository.findAll();
//  }
//  public Customer getCustomerById(Long customerID)
//  {
//    return customerRepository.findById(customerID).orElse(null);
//  }
//  public List<Customer> getCustomerByName(String customerName)
//  {
//    return customerRepository.finByCustomerName(customerName);
//  }
//}
