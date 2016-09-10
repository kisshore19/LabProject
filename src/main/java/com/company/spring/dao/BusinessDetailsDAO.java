package com.company.spring.dao;

import com.company.hibernate.entities.BusinessDetails;

public interface BusinessDetailsDAO {

	void saveBusinessDetails(BusinessDetails actor);

	BusinessDetails getBusinessDetails(BusinessDetails businessDetails);

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
