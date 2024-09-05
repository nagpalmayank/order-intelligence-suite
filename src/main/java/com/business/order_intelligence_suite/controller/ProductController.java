package com.business.order_intelligence_suite.controller;


import com.business.order_intelligence_suite.dto.ProductDTO;
import com.business.order_intelligence_suite.service.ProductService;
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
@RequestMapping("/products")
public class ProductController {
  @Autowired
  private ProductService productService;

  @PostMapping("/save")
  public ProductDTO createProduct(@RequestBody ProductDTO productDTO) {
    return productService.createProduct(productDTO);
  }

  @GetMapping("/list")
  public List<ProductDTO> getAllProduct() {
    return productService.getAllProduct();
  }

  @GetMapping("/{productId}")
  public ProductDTO getProductById(@PathVariable Long productId) {
    return productService.getProductById(productId);
  }

  @GetMapping("/")
  public List<ProductDTO> getProductByName(@RequestParam String productName) {
    return  productService.getProductByName(productName);
  }
  @GetMapping("/disable/{productId}")
  public void disableProduct(@PathVariable Long productId)
  {
    productService.disableProduct(productId);
  }
  @GetMapping("/enable/{productId}")
  public void enableProduct(@PathVariable Long productId)
  {
     productService.enableProduct(productId);
  }
//
//  @DeleteMapping("/{ProductID}")
//  public void deleteProductById(@PathVariable Long productID) {
//    productService.deleteProductById(productID);
//  }
//
//  @DeleteMapping()
//  public void deleteProductByName(@RequestParam String productName) {
//    productService.deleteByName(productName);
//  }

}
