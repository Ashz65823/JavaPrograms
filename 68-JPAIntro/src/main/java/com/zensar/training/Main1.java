package com.zensar.training;

import javax.persistence.EntityManager;
import com.zensar.training.bean.Contact;
import com.zensar.training.util.JPAUtil;

public class Main1 {
public static void  insert()
{
	/*
	 * EntityManagerFactory
	 * emf=Persistence.createEntityManagerFactory("JPAIntro");//obj to create entity
	 * manager to wch db to initalize EntityManager
	 * em=emf.createEntityManager();//like seesion-->will have function
	 */
	EntityManager em=JPAUtil.createEntityManager("JPAIntro");
	Contact contact=new Contact();
	contact.setName("James");
	contact.setEmail("james@gmail.com");
	
	em.getTransaction().begin();
	em.persist(contact);
	em.getTransaction().commit();
	JPAUtil.shutDown();
}
	public static void load()
	{
		/*
		 * EntityManagerFactory
		 * emf=Persistence.createEntityManagerFactory("JPAIntro");//obj to create entity
		 * manager to wch db to initalize EntityManager
		 * em=emf.createEntityManager();//like seesion-->will have function
		 */
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		Contact contact=em.find(Contact.class, 3);//session load
		System.out.println(contact);

		JPAUtil.shutDown();
	}
	
	public static void update()
	{
		/*
		 * EntityManagerFactory
		 * emf=Persistence.createEntityManagerFactory("JPAIntro");//obj to create entity
		 * manager to wch db to initalize EntityManager
		 * em=emf.createEntityManager();//like seesion-->will have function
		 *///this is replaced by util class
		
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		
		Contact contact=em.find(Contact.class, 1);
		contact.setName(contact.getName().toUpperCase());
		em.getTransaction().begin();
		em.merge(contact);
		em.getTransaction().commit();
		System.out.println("Update !!");
		JPAUtil.shutDown();
	}
	static void delete()
	{
		/*
		 * EntityManagerFactory
		 * emf=Persistence.createEntityManagerFactory("JPAIntro");//obj to create entity
		 * manager to wch db to initalize EntityManager
		 * em=emf.createEntityManager();//like seesion-->will have function
		 */	
		EntityManager em=JPAUtil.createEntityManager("JPAIntro");
		Contact contact=em.find(Contact.class, 2);
		contact.setName(contact.getName().toUpperCase());
		em.getTransaction().begin();
		em.remove(contact);
		em.getTransaction().commit();
		System.out.println("Deleted!!");
		JPAUtil.shutDown();
	}
	
	public static void main(String[] args) {
		//insert();
		//load();
		update();
		//delete();
	}

}
