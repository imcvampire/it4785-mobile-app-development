package io.imcvampire.simpleform;

import java.lang.*;

public class Restaurant {
  private String name = "";
  private String address = "";
  private String type = "";
  private Number sale = 0;

  public String getName() {
    return (name);
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return (address);
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getType() {
    return (type);
  }

  public void setType(String type) {
    this.type = type;
  }

  public void setSale(Number sale) {
    this.sale = sale;
  }

  public Number getSale() {
    return (sale);
  }

  public String toString() {
    return ("Name: " + getName() + " - Sale: " + getSale() + "%");
  }
}