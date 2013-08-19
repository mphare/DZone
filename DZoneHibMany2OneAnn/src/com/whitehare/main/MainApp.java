package com.whitehare.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.whitehare.address.Address;
import com.whitehare.student.Student;
import com.whitehare.util.HibernateUtil;

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
      Address address = new Address("OMR Road", "Chennai", "TN", "600097");

      Student student1 = new Student("Eswar", address);
      Student student2 = new Student("Joe", address);

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
