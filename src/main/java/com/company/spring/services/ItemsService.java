/**
 * 
 */
package com.company.spring.services;

import java.util.List;

import com.company.hibernate.entities.Items;

/**
 * @author ogvkisshorre
 *
 */
public interface ItemsService {
	void saveItem(Items items);
	List<Items> getAllItems();
}
