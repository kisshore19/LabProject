/**
 * 
 */
package com.company.spring.dao;

import java.util.List;

import com.company.hibernate.entities.Items;

/**
 * @author ogvkisshorre
 * 
 */
public interface ItemsDao {
	void saveItem(Items items);

	List<Items> getAllItems();
	/*
	 * List<BusinessDetails> findAllActors();
	 * 
	 * void deleteActorByFirstName(String firstName);
	 * 
	 * BusinessDetails findActorByID(int id);
	 * 
	 * void updateActor(BusinessDetails actor);
	 */

}
