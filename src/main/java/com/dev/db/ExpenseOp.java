package com.dev.db;

import java.util.List;


import org.hibernate.Query;
import org.hibernate.Session;

import com.dev.bean.Expense;




public class ExpenseOp {

 

  public static List<Expense> getAllExpenses()
  {
	  
	  final Session session = HibernateUtil.getSession();
		try {
			 session.beginTransaction();
		 
			 List<Expense> expenses = session.createQuery("FROM Expense").list();	
			 return expenses;
		 
	}catch(Exception ex){
     
      ex.printStackTrace();
		
	}finally {
		
		HibernateUtil.closeSession();
	}
		return null;
  }   
  
  
  
  
  
  
  

  public static  boolean setExpense(Expense expense)
  {
	  
	  final Session session = HibernateUtil.getSession();
		try {
			    session.beginTransaction();
				session.saveOrUpdate(expense); 
				session.getTransaction().commit();
				
		 
	}catch(Exception ex){
     
      ex.printStackTrace();
      return false;
		
	}finally {
		
		HibernateUtil.closeSession();
	}
		return true;
  }   
  
  
  
  
 
  
}