package com.whitehare.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.whitehare.course.Course;
import com.whitehare.student.Student;
import com.whitehare.student.util.HibernateUtil;

public class MainApp
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction = null;
    try
    {
      transaction = session.beginTransaction();

      Course course1 = new Course("Non-Euclidian Geometry");
      Course course2 = new Course("English History");
      Course course3 = new Course("Computer Science");
      Course course4 = new Course("Applied Science");
      Course course5 = new Course("American Literature");
      Course course6 = new Course("French Poetry");

      Set<Course> courses1 = new HashSet<Course>();
      courses1.add(course1);
      courses1.add(course3);
      courses1.add(course4);
      courses1.add(course2);

      Set<Course> courses2 = new HashSet<Course>();
      courses2.add(course2);
      courses2.add(course1);
      courses2.add(course5);
      courses2.add(course6);

      Student student1 = new Student("Eswar", courses1);
      Student student2 = new Student("Joe", courses2);

      session.save(student1);
      session.save(student2);

      transaction.commit();
    } catch (HibernateException e)
    {
      transaction.rollback();
      e.printStackTrace();
    } finally
    {
      session.close();
    }

  }

}
