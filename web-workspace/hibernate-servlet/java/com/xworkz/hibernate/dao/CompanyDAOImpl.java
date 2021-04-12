package com.xworkz.hibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.hibernate.entity.CompanyEntity;

public class CompanyDAOImpl implements CompanyDAO {

	@Override
	public void create(CompanyEntity entity) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz.jpa");
		EntityManager session = factory.createEntityManager();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();

	}

}
