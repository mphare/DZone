package com.whitehare.main;

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
    Session session = HibernateUtil.getSessionFactory().openSession();
    Transaction transaction = null;
    try
    {
      transaction = session.beginTransaction();

      Address address = new Address("OMR Road", "Chennai", "TN", "640097");

      Student student = new Student("Eswar", address);
      session.save(student);
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
