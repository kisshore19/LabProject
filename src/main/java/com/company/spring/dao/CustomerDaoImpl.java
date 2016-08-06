/**
 * 
 */
package com.company.spring.dao;

import org.springframework.stereotype.Repository;

import com.company.hibernate.entities.Customer;

/**
 * @author ogvkisshorre
 * 
 */
@Repository("customerDao")
public class CustomerDaoImpl extends AbstractDao implements CustomerDao {

	public void saveCustomer(Customer customer) {
		persist(customer);
	}

}
