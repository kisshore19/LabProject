/**
 * 
 */
package com.company.spring.dao;

import com.company.hibernate.entities.Customer;

/**
 * @author ogvkisshorre
 *
 */
public interface CustomerDao {
	void saveCustomer(Customer customer);

	/*List<BusinessDetails> findAllActors();

	void deleteActorByFirstName(String firstName);

	BusinessDetails findActorByID(int id);

	void updateActor(BusinessDetails actor);*/

}
