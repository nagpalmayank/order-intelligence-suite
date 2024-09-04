package com.business.order_intelligence_suite.controller;


import com.business.order_intelligence_suite.dto.ProductDTO;
import com.business.order_intelligence_suite.entity.Product;
import com.business.order_intelligence_suite.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
  @Autowired
  private ProductService productService;

  @PostMapping("/save")
  public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {
    return productService.createProduct(productDTO);
  }

  @GetMapping("/list")
  public List<ProductDTO> getProduct() {
    return productService.getProduct();
  }
//
//  @GetMapping("/{productID}")
//  public Product getById(@PathVariable Long productID) {
//    return productService.getById(productID);
//  }
//
//  @GetMapping()
//  public List<Product> getByProductName(@RequestParam String productName) {
//    return productService.getByProductName(productName);
//
//  }
//
//  @DeleteMapping("/{ProductID}")
//  public void deleteProductById(@PathVariable Long productID) {
//    productService.deleteProductById(productID);
//  }
//
//  @DeleteMapping()
//  public void deleteByName(@RequestParam String productName) {
//    productService.deleteByName(productName);
//  }

}
