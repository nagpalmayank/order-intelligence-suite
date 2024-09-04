package com.business.order_intelligence_suite.service;

import com.business.order_intelligence_suite.converter.ProductConverter;
import com.business.order_intelligence_suite.dto.ProductDTO;
import com.business.order_intelligence_suite.entity.Product;
import com.business.order_intelligence_suite.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  public ProductDTO createProduct(ProductDTO productDTO) {
    Product product = ProductConverter.convertToEntity(productDTO);
    productRepository.save(product);
    productDTO.setProductId(product.getProductId());
    return productDTO;
  }

  public List<ProductDTO> getProduct() {
    //List<Product> gfg = ProductConverter.convertToEntity(productDTO);
    return null;
  }

//  public Product getById(Long productID) {
//    return productRepository.findById(productID).orElse(null);
//  }
//  public List<Product> getByProductName(String productName)
//  {
//    return productRepository.findByProductName(productName);
//
//  }
//  public void deleteProductById(Long productID)
//  {
//     productRepository.deleteById(productID);
//  }
//  public void deleteProductByName(String productName)
//  {
//    productRepository.deleteByName(productName);
//  }
}
