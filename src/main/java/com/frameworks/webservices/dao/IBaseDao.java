package com.frameworks.webservices.dao;

import java.io.Serializable;
import java.util.List;

public interface IBaseDao<T, ID extends Serializable> {

	public Class<T> getEntityClass();
	
	public void save(T paramT, Long paramLong);

	public void delete(T paramT);

	public void flush();
	
	public void refresh(T paramT);
	  
	public T getById(ID paramID);
	  
	public List<T> getAll();
	
	public long getCountAll();
}
