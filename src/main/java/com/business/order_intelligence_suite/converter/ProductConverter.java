package com.business.order_intelligence_suite.converter;


import com.business.order_intelligence_suite.dto.ProductDTO;
import com.business.order_intelligence_suite.entity.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductConverter {

  public static ProductDTO convertToDTO(Product product){
    ProductDTO productDTO = new ProductDTO();
    productDTO.setProductId(product.getProductId());
    productDTO.setProductName(product.getProductName());
    productDTO.setBrandName(product.getBrandName());
    productDTO.setCategory(product.getCategory());
    productDTO.setMrp(product.getMrp());
    productDTO.setCostPrice(product.getCostPrice());
    productDTO.setDiscount(product.getDiscount());
    productDTO.setSource(product.getSource());
    return productDTO;
  }

  public static Product convertToEntity(ProductDTO productDTO){
    Product product = new Product();
    product.setProductId(productDTO.getProductId());
    product.setProductName(productDTO.getProductName());
    product.setBrandName(productDTO.getBrandName());
    product.setCategory(productDTO.getCategory());
    product.setMrp(productDTO.getMrp());
    product.setCostPrice(productDTO.getCostPrice());
    product.setDiscount(productDTO.getDiscount());
    product.setSource(productDTO.getSource());
    return product;
  }
  public static List<ProductDTO> convertEntityListToDTOList(List<Product> productList)
  {
    List<ProductDTO> productDTOList = new ArrayList<>();
    for(Product product : productList){
        productDTOList.add(convertToDTO(product));
    }
    return productDTOList;
  }

  public static List<Product> convertDTOListToEntityList(List<ProductDTO> productDTOList)
  {
      List<Product> productList = new ArrayList<>();
      for(ProductDTO productDTO: productDTOList)
      {
          productList.add(convertToEntity(productDTO));
      }
      return productList;
  }
}








