/**
 * 
 */
package com.company.spring.dao;

import java.util.List;

import org.hibernate.Query;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.company.spring.dao.ItemsDao#getAllItems()
	 */
	public List<Items> getAllItems() {
		Query query = getSession().getNamedQuery("selectAllItems");
		return query.list();
	}

}
