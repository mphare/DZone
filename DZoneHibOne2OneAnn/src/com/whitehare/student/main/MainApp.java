package com.whitehare.student.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.whitehare.address.Address;
import com.whitehare.student.Student;
import com.whitehare.student.util.HibernateUtil;

public class MainApp
{

  /**
   * @param args
   */
  public static void main(String[] args)
  {

    MainApp mainApp = new MainApp();

    mainApp.addData();
    mainApp.listStudents();
  }

  /**
   * 
   */
  public void addData()
  {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction = null;

    try
    {
      transaction = session.beginTransaction();
      Address address1 = new Address("OMR Road", "Chennai", "TN", "60097");
      Address address2 = new Address("Ring Road", "Banglore", "Karnataka", "56000");

      Student student1 = new Student("Eswar", address1);
      Student student2 = new Student("Joe", address2);

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

  /**
   * 
   */
  public void listStudents()
  {
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction = null;

    try
    {
      // transaction = session.getTransaction();
      List students = session.createQuery("from Student").list();
      for (Iterator iterator = students.iterator(); iterator.hasNext();)
      {
        Student student = (Student) iterator.next();
        System.out.println(student.getStudentName());
      }
      // transaction.commit();

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
