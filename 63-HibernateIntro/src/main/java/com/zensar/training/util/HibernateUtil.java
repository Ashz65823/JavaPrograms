package com.zensar.training.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory sessionFactory;
	private static Session session;
	
	public static void init()
	{
		ServiceRegistry registry;//predefined interface-->Used to create a metadata source
		registry = new StandardServiceRegistryBuilder().configure().build();//look for hibernate.cng.xml
		MetadataSources metaSources = new MetadataSources(registry);//create mete source object-->details about db we connect-->configaration
		Metadata metaData = metaSources.getMetadataBuilder().build();
		sessionFactory = metaData.getSessionFactoryBuilder().build();
		session=sessionFactory.openSession();
		//Initialize session
	}
	public static Session getSession()
	{
		return session;
	}
	public static void cleanUp()
	{
		session.close();
		sessionFactory.close();
	}

}
