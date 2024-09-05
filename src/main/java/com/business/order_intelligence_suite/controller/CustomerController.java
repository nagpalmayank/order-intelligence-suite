package com.business.order_intelligence_suite.controller;

import com.business.order_intelligence_suite.entity.Customer;
import com.business.order_intelligence_suite.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
  @Autowired
  private CustomerService customerService;

  @PostMapping("/save")
  public Customer createCustomer(@RequestBody Customer customer) {
    return customerService.createCustomer(customer);
  }

  @GetMapping("/all")
  public List<Customer> getAllCustomer() {
    return customerService.getAllCustomer();
  }

  @GetMapping("/{custId}")
  public Customer getCustomerById(@PathVariable Long custId) {
    return customerService.getCustomerById(custId);
  }

  @GetMapping()
  public List<Customer> getCustomerByName(@RequestParam String custName) {
    return customerService.getCustomerByName(custName);
  }
  @DeleteMapping("/delete/{custId}")
  public void deleteCustomerById(@PathVariable Long custId)
  {
     customerService.deleteCustomerById(custId);
  }
  @GetMapping("/disabled/{custId}")
  public void disableCustomer(@PathVariable Long custId)
  {
    customerService.disableCustomer(custId);
  }
  @GetMapping("/enabled/{custId}")
  public void enableCustomer(@PathVariable Long custId)
  {
    customerService.enableCustomer(custId);
  }

}
