package com.vaannila.course;

public class Course implements java.io.Serializable
{
  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private long              courseId;
  private String            courseName;

  public Course()
  {

  }

  public Course(String courseName)
  {
    this.courseName = courseName;
  }

  public long getCourseId()
  {
    return courseId;
  }

  public void setCourseId(long courseId)
  {
    this.courseId = courseId;
  }

  public String getCourseName()
  {
    return courseName;
  }

  public void setCourseName(String courseName)
  {
    this.courseName = courseName;
  }

}
