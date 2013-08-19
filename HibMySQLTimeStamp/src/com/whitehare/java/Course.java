package com.whitehare.java;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "COURSE")
public class Course
{
  private long   courseId;
  private String courseName;

  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "releasedate", nullable = false, length = 19)
  private Date   releasedate;

  private Date   myDate;

  public Course()
  {

  }

  public Course(String courseName)
  {
    this.courseName = courseName;
  }

  @Id
  @GeneratedValue
  @Column(name = "COURSE_ID")
  public long getCourseId()
  {
    return this.courseId;
  }

  public void setCourseId(long courseId)
  {
    this.courseId = courseId;
  }

  @Column(name = "COURSE_NAME", nullable = false, length = 100)
  public String getCourseName()
  {
    return this.courseName;
  }

  public void setCourseName(String courseName)
  {
    this.courseName = courseName;
  }

  public Date getReleasedate()
  {
    return this.releasedate;
  }

  public void setReleasedate(Date releasedate)
  {
    this.releasedate = releasedate;
  }

  @Column(name = "mydate")
  public Date getMyDate()
  {
    return this.myDate;
  }

  public void setMyDate(Date myDate)
  {
    this.myDate = myDate;
  }

}
