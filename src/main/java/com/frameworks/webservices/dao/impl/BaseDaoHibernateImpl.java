package com.frameworks.webservices.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.frameworks.webservices.dao.IBaseDao;

@Component
@Transactional
public abstract class BaseDaoHibernateImpl<T, ID extends Serializable> implements IBaseDao<T, ID>{
	
	@Autowired
	private SessionFactory sessionFactory;

	protected final Session getSession(){
		return getSessionFactory().getCurrentSession();
	}
	
	public void save(T object, Long creator) {
		getSession().save(object);
	}

	public void delete(T object) {
		getSession().delete(object);
	}

	public void flush() {
		getSession().flush();
	}

	public void refresh(T object) {
		getSession().refresh(object);
	}
	
	public T getById(ID id) {
		return (T)getSession().get(getEntityClass(), id);
	}

	public List<T> getAll() {
		return getBaseCriteria().list();
	}
	
	public long getCountAll() {
		Long count = (Long)getBaseCriteria().setProjection(Projections.rowCount()).uniqueResult();
	    return ((count == null) ? 0L : count.longValue());
	}

	protected final Criteria getBaseCriteria() {
		return getSession().createCriteria(getEntityClass());
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
