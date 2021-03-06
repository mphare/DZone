package com.whitehare.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course
{
  private long   courseId;
  private String courseName;

  public Course()
  {
  }

  public Course(String courseName)
  {
    this.courseName = courseName;
  }

  @Id
  @GeneratedValue
  @Column(name = "course_id")
  public long getCourseId()
  {
    return courseId;
  }

  public void setCourseId(long courseId)
  {
    this.courseId = courseId;
  }

  @Column(name = "course_name", nullable = false, length = 100)
  public String getCourseName()
  {
    return courseName;
  }

  public void setCourseName(String courseName)
  {
    this.courseName = courseName;
  }

}
