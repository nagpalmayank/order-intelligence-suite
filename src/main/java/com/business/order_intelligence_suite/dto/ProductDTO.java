package com.business.order_intelligence_suite.dto;


public class ProductDTO {

  private Long productId;
  private String productName;
  private String BrandName;
  private String mrp;
  private String category;
  private String discount;
  private String costPrice;
  private String source;

  public Long getProductId() {
    return productId;
  }

  public void setProductId(Long productId) {
    this.productId = productId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getBrandName() {
    return BrandName;
  }

  public void setBrandName(String brandName) {
    BrandName = brandName;
  }

  public String getMrp() {
    return mrp;
  }

  public void setMrp(String mrp) {
    this.mrp = mrp;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getDiscount() {
    return discount;
  }

  public void setDiscount(String discount) {
    this.discount = discount;
  }

  public String getCostPrice() {
    return costPrice;
  }

  public void setCostPrice(String costPrice) {
    this.costPrice = costPrice;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }
}
