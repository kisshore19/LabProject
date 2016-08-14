/**
 * 
 */
package com.company.spring.dao;

import org.springframework.stereotype.Repository;

import com.company.hibernate.entities.Items;

/**
 * @author ogvkisshorre
 * 
 */
@Repository("itemsDao")
public class ItemsDaoImpl extends AbstractDao implements ItemsDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.company.spring.dao.ItemsDao#saveItem(com.company.hibernate.entities
	 * .Items)
	 */
	public void saveItem(Items items) {

		persist(items);
	}

}
