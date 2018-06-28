package com.java.app.interfaces;

import java.util.List;

public interface GenericDao<T> {

	T getById(Integer id);
	List<T> getAll();
	boolean delete(T ojbect);
	boolean update(T ojbect);
	boolean create(T ojbect);
	
}
