/**
 * 
 */
package com.company.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.hibernate.entities.Items;
import com.company.spring.dao.ItemsDao;

/**
 * @author ogvkisshorre
 * 
 */

@Service("itemsService")
@Transactional
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	ItemsDao itemsDao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.company.spring.services.ItemsService#saveItem(com.company.hibernate
	 * .entities.Items)
	 */
	public void saveItem(Items items) {

		itemsDao.saveItem(items);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.company.spring.services.ItemsService#getAllItems()
	 */
	public List<Items> getAllItems() {
		return itemsDao.getAllItems();
	}

}
