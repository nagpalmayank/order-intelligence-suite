package com.business.order_intelligence_suite.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long custId;
  private String custName;
  private String custContact;
  private String custGst;
  private String custAddress;
  private boolean visibility;

  public Long getCustId() {
    return custId;
  }

  public void setCustId(Long custId) {
    this.custId = custId;
  }

  public String getCustName() {
    return custName;
  }

  public void setCustName(String custName) {
    this.custName = custName;
  }

  public String getCustContact() {
    return custContact;
  }

  public void setCustContact(String custContact) {
    this.custContact = custContact;
  }

  public String getCustGst() {
    return custGst;
  }

  public void setCustGst(String custGst) {
    this.custGst = custGst;
  }

  public String getCustAddress() {
    return custAddress;
  }

  public void setCustAddress(String custAddress) {
    this.custAddress = custAddress;
  }

  public boolean isVisibility() {
    return visibility;
  }

  public void setVisibility(boolean visibility) {
    this.visibility = visibility;
  }

  @Override
  public String toString() {
    return "Customer{" +
        "custId=" + custId +
        ", custName='" + custName + '\'' +
        ", custContact='" + custContact + '\'' +
        ", custGst='" + custGst + '\'' +
        ", custAddress='" + custAddress + '\'' +
        ", visibility=" + visibility +
        '}';
  }
}
