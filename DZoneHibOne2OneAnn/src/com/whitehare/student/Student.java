package com.whitehare.student;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.whitehare.address.Address;

@Entity
@Table(name = "STUDENT")
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
  @Column(name = "STUDENT_ID")
  public long getStudentId()
  {
    return studentId;
  }

  public void setStudentId(long studentId)
  {
    this.studentId = studentId;
  }

  @Column(name = "STUDENT_NAME", nullable = false, length = 100)
  public String getStudentName()
  {
    return studentName;
  }

  public void setStudentName(String studentName)
  {
    this.studentName = studentName;
  }

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "ADDRESS_ID")
  public Address getStudentAddress()
  {
    return studentAddress;
  }

  public void setStudentAddress(Address studentAddress)
  {
    this.studentAddress = studentAddress;
  }

}
