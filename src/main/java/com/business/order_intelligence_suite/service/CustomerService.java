package com.business.order_intelligence_suite.service;

import com.business.order_intelligence_suite.entity.Customer;
import com.business.order_intelligence_suite.repository.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
  @Autowired
  private CustomerRepository customerRepository;

  public Customer createCustomer(Customer customer)
  {
    return customerRepository.save(customer);
  }
  public List<Customer> getAllCustomer()
  {
    return customerRepository.findAll();
  }
  public Customer getCustomerById(Long custId)
  {
    return customerRepository.findById(custId).orElseGet(null);
  }
  public List<Customer> getCustomerByName(String custName)
  {
    return customerRepository.findByCustName(custName);
  }
  public void deleteCustomerById(Long custId)
  {
    customerRepository.deleteById(custId);
  }
  public void disableCustomer(Long custId)
  {
    Customer customer=customerRepository.findById(custId).orElseGet(null);
     customer.setVisibility(false);
     customerRepository.save(customer);
  }
  public void enableCustomer(Long custId)
  {
    Customer customer=customerRepository.findById(custId).orElseGet(null);
    customer.setVisibility(true);
    customerRepository.save(customer);
  }
}
