package com.business.order_intelligence_suite.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long productId;
  private String productName;
  private String BrandName;

  private String mrp;
  private String category;
  private String discount;
  private String costPrice;
  private String sellingPrice;
  private String source;
  private boolean visibility;
  @CreatedDate
  private LocalDateTime createdDate;
  @LastModifiedDate
  private LocalDateTime updatedDate;

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

  public String getSellingPrice() {
    return sellingPrice;
  }

  public void setSellingPrice(String sellingPrice) {
    this.sellingPrice = sellingPrice;
  }

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public boolean isVisibility() {
    return visibility;
  }

  public void setVisibility(boolean visibility) {
    this.visibility = visibility;
  }

  public LocalDateTime getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDateTime createdDate) {
    this.createdDate = createdDate;
  }

  public LocalDateTime getUpdatedDate() {
    return updatedDate;
  }

  public void setUpdatedDate(LocalDateTime updatedDate) {
    this.updatedDate = updatedDate;
  }

  @Override
  public String toString() {
    return "Product{" +
        "productID=" + productId +
        ", productName='" + productName + '\'' +
        ", BrandName='" + BrandName + '\'' +
        ", mrp='" + mrp + '\'' +
        ", category='" + category + '\'' +
        ", discount='" + discount + '\'' +
        ", costPrice='" + costPrice + '\'' +
        ", sellingPrice='" + sellingPrice + '\'' +
        ", source='" + source + '\'' +
        ", visibility=" + visibility +
        ", createdDate=" + createdDate +
        ", updatedDate=" + updatedDate +
        '}';
  }
}
