package com.business.order_intelligence_suite.service;

import com.business.order_intelligence_suite.converter.ProductConverter;
import com.business.order_intelligence_suite.dto.ProductDTO;
import com.business.order_intelligence_suite.entity.Product;
import com.business.order_intelligence_suite.repository.ProductRepository;
import java.util.List;
import java.util.Optional;
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

  public List<ProductDTO> getAllProduct() {
    List<Product> productList = productRepository.findAll();
    return ProductConverter.convertEntityListToDTOList(productList);
  }

  public ProductDTO getProductById(Long productId) {
    Optional<Product> product = productRepository.findById(productId);
    return ProductConverter.convertToDTO(product.orElseGet(null));
  }

  public List<ProductDTO> getProductByName(String productName) {
    List<Product> product = productRepository.findByProductName(productName);
    return ProductConverter.convertEntityListToDTOList(product);
  }

  public void disableProduct(Long productId) {
    Product product = productRepository.findById(productId).orElseGet(null);
    product.setVisibility(false);
    productRepository.save(product);
  }
  public void enableProduct(Long productId)
  {
    Product product=productRepository.findById(productId).orElseGet(null);
    product.setVisibility(true);
    productRepository.save(product);
  }

//  public void deleteProductById(Long productID) {
//    productRepository.deleteById(productID);
//  }
//
//  public void deleteProductByName(String productName) {
//    productRepository.deleteByName(productName);
//  }
}
