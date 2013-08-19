package com.whitehare.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.whitehare.phone.Phone;
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

      Set<Phone> phoneNumbers = new HashSet<Phone>();

      phoneNumbers.add(new Phone("house", "1234567890"));
      phoneNumbers.add(new Phone("mobile", "2468101214"));

      Student student = new Student("Eswar", phoneNumbers);
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
