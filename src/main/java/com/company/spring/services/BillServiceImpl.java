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
@Service("billService")
@Transactional
public class BillServiceImpl implements BillService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.company.spring.services.OrderService#createNewOrder()
	 */

	@Autowired
	ItemsDao itemsDao;

	public List<Items> createNewBill() {
		String html = "<tr>" +
						"<td>" +
							"<label id='itemNo'>1</label>" +
						"</td>" +
						"<td>" +
							"<s:select list='items' listValue='itemName' listKey='id' name='itemID0'/>" +
						"</td>" +
						"<td>" +
							"<input type='number' name='itemQty'>" +
						"</td>" +
						"<td>" +
							"<input type='number' name='itemPrice'>" +
						"</td>" +
						"<td>" +
							"<input type='number' name='itemsTotalPrice'>" +
						"</td>" +
						"<td>" +
							"<button onclick='addNewBillingItem(billingItemsTableId);'>+</button>" +
						"</td>" +
						"</tr>";
		return itemsDao.getAllItems();


	}

}
