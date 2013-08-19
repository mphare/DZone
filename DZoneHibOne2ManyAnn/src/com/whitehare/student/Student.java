package com.whitehare.student;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.whitehare.phone.Phone;

@Entity
@Table(name = "student")
public class Student
{
  private long       studentId;
  private String     studentName;
  private Set<Phone> studentPhoneNumbers = new HashSet<Phone>(0);

  public Student()
  {

  }

  public Student(String studentName, Set<Phone> studentPhoneNumbers)
  {
    this.studentName = studentName;
    this.studentPhoneNumbers = studentPhoneNumbers;
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

  @Column(name = "student_name", nullable = false, length = 100)
  public String getStudentName()
  {
    return studentName;
  }

  public void setStudentName(String studentName)
  {
    this.studentName = studentName;
  }

  @OneToMany(cascade = CascadeType.ALL)
  @JoinTable(name = "student_phone", joinColumns = { @JoinColumn(name = "student_id") }, inverseJoinColumns = { @JoinColumn(name = "phone_id") })
  public Set<Phone> getStudentPhoneNumbers()
  {
    return studentPhoneNumbers;
  }

  public void setStudentPhoneNumbers(Set<Phone> studentPhoneNumbers)
  {
    this.studentPhoneNumbers = studentPhoneNumbers;
  }

}
