package io.imcvampire.simpleform;

public class Restaurant {
  private String name = "";
  private String address = "";
  private String type = "";
  private String sale = "";

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

  public void setSale(String sale) {
    this.sale = sale;
  }

  public String getSale() {
    return (sale);
  }

  public String toString() {
    return ("Name: " + getName() + " - Sale: " + getSale());
  }
}