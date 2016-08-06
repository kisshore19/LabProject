/**
 * 
 */
package com.company.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.hibernate.entities.Customer;
import com.company.spring.dao.CustomerDao;

/**
 * @author ogvkisshorre
 * 
 */

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.company.spring.services.CustomerService#saveCustomer(com.company.
	 * hibernate.entities.Customer)
	 */

	@Autowired
	CustomerDao customerDao;

	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
	}

}
