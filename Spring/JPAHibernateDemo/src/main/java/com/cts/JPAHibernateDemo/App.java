package com.cts.JPAHibernateDemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.cts.jpa.hib.demo.model.Employee;
import com.cts.jpa.hib.demo.util.JPAUtil;

public class App 
{
    public static void main( String[] args )
    {
    	EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
		String query="Select * from Employee e";
		Query qry=em.createQuery(query);
		
		List<Employee> data=(List<Employee>)qry.getResultList();
		
		for(Employee e :data)
		{
			System.out.println(e);
		}
		
		em.close();
		JPAUtil.shutdown();
    }
}
