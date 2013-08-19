package com.whitehare.student;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.whitehare.address.Address;

@Entity
@Table(name = "student")
public class Student
{
  private long    studentId;
  private String  studentName;
  private Address studentAddress;

  public Student()
  {

  }

  public Student(String studentName, Address studentAddress)
  {
    this.studentName = studentName;
    this.studentAddress = studentAddress;
  }

  @Id
  @GeneratedValue
  @Column(name = "student_id")
  public long getStudentId()
  {
    return studentId;
  }

  public void setStudentId(long studentId)
  {
    this.studentId = studentId;
  }

  @Column(name = "student_name", nullable=false, length=100)
  public String getStudentName()
  {
    return studentName;
  }

  public void setStudentName(String studentName)
  {
    this.studentName = studentName;
  }

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "address_id")
  public Address getStudentAddress()
  {
    return studentAddress;
  }

  public void setStudentAddress(Address studentAddress)
  {
    this.studentAddress = studentAddress;
  }

}
