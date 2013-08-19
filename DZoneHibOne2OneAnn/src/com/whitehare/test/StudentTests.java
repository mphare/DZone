package com.whitehare.test;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.whitehare.student.Student;
import com.whitehare.student.util.HibernateUtil;

public class StudentTests
{

  @Test
  public void listStudents()
  {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction = null;

    try
    {
      transaction = session.getTransaction();
      List students = session.createQuery("from student").list();
      for (Iterator iterator = students.iterator(); iterator.hasNext();)
      {
        Student student = (Student) iterator.next();
        System.out.println(student.getStudentName());
      }
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
