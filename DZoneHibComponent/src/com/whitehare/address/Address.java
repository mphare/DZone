package com.whitehare.address;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address
{
  private String street;
  private String city;
  private String state;
  private String zipcode;

  public Address()
  {

  }

  @Column(name = "address_street")
  public String getStreet()
  {
    return street;
  }

  public void setStreet(String street)
  {
    this.street = street;
  }

  @Column(name = "address_city")
  public String getCity()
  {
    return city;
  }

  public void setCity(String city)
  {
    this.city = city;
  }

  @Column(name = "address_state")
  public String getState()
  {
    return state;
  }

  public void setState(String state)
  {
    this.state = state;
  }

  @Column(name = "address_zipcode")
  public String getZipcode()
  {
    return zipcode;
  }

  public void setZipcode(String zipcode)
  {
    this.zipcode = zipcode;
  }

  public Address(String street, String city, String state, String zipcode)
  {
    this.street = street;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
  }

}
