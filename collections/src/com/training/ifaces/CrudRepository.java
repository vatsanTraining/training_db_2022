package com.training.ifaces;

import java.util.*;

public interface CrudRepository<T> {

	 boolean add(T T);
	T findById(int id);
	 boolean remove(T T);
	 List<T> findAll();
	 T update(T old,T recent);
	
	
}
