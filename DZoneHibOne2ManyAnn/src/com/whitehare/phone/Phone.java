package com.whitehare.phone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "phone")
public class Phone
{
  private long   phoneId;
  private String phoneType;
  private String phoneNumber;

  public Phone()
  {

  }

  public Phone(String phoneType, String phoneNumber)
  {
    this.phoneType = phoneType;
    this.phoneNumber = phoneNumber;
  }

  @Id
  @GeneratedValue
  @Column(name = "phone_id")
  public long getPhoneId()
  {
    return phoneId;
  }

  public void setPhoneId(long phoneId)
  {
    this.phoneId = phoneId;
  }

  @Column(name = "phone_type", nullable = false, length = 10)
  public String getPhoneType()
  {
    return phoneType;
  }

  public void setPhoneType(String phoneType)
  {
    this.phoneType = phoneType;
  }

  @Column(name = "phone_number", nullable = false, length = 15)
  public String getPhoneNumber()
  {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
  }

}
