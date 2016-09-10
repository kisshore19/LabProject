package com.company.spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.company.hibernate.entities.BusinessDetails;
import com.company.spring.dao.BusinessDetailsDAO;

@Service("businessDetailsService")
@Transactional
public class BusinessDetailsServiceImpl implements BusinessDetailsService {

	@Autowired
	BusinessDetailsDAO businessDetailsDAO;

	public void saveBusinessDetails(BusinessDetails businessDetails) {
		businessDetailsDAO.saveBusinessDetails(businessDetails);

	}

	public BusinessDetails getBusinessDetails(BusinessDetails businessDetails) {
		return businessDetailsDAO.getBusinessDetails(businessDetails);
	}

	/*
	 * public List<Actor> findAllActors() { return actorDao.findAllActors(); }
	 * 
	 * public void deleteActorByFirstName(String firstName) {
	 * actorDao.deleteActorByFirstName(firstName);
	 * 
	 * }
	 * 
	 * public Actor findActorByID(int id) { return actorDao.findActorByID(id); }
	 * 
	 * public void updateActor(Actor actor) {
	 * 
	 * actorDao.updateActor(actor); }
	 */
}
