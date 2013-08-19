package com.whitehare.address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address
{
  private long   addressId;
  private String street;
  private String city;
  private String state;
  private String zipcode;

  public Address()
  {

  }

  public Address(String street, String city, String state, String zipcode)
  {
    this.street = street;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
  }

  @Id
  @GeneratedValue
  @Column(name = "address_id")
  public long getAddressId()
  {
    return addressId;
  }

  public void setAddressId(long addressId)
  {
    this.addressId = addressId;
  }

  @Column(name = "address_street", nullable=false, length=100)
  public String getStreet()
  {
    return street;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  @Column(name = "address_city", nullable = false, length=50)
  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  @Column(name = "address_state", nullable=false, length=50)
  public String getState()
  {
    return state;
  }

  public void setState(String state)
  {
    this.state = state;
  }

  @Column(name = "address_zipcode", nullable=false,length=10)
  public String getZipcode()
  {
    return zipcode;
  }

  public void setZipcode(String zipcode)
  {
    this.zipcode = zipcode;
  }

}
