package com.company.spring.dao;

import org.springframework.stereotype.Repository;

import com.company.hibernate.entities.BusinessDetails;

@Repository("businessDetailsDAO")
public class BusinessDetailsDAOImpl extends AbstractDao implements BusinessDetailsDAO {

	public void saveActor(BusinessDetails businessDetails) {
		persist(businessDetails);
	}
	
	public BusinessDetails getBusinessDetails(BusinessDetails businessDetails) {
		return (BusinessDetails)getSession().get(BusinessDetails.class, businessDetails.getId());
	}

	/*@SuppressWarnings("unchecked")
	public List<BusinessDetails> findAllActors() {
		Criteria createCriteria = getSession().createCriteria(BusinessDetails.class);
		return (List<BusinessDetails>)createCriteria.list();
	}

	public void deleteActorByFirstName(String firstName) {
		Query query = getSession().createSQLQuery("delete from actor where first_name =:firstName ");
		query.setString("firstName", firstName);
		query.executeUpdate();
		
	}

	public BusinessDetails findActorByID(int id) {
		Criteria createCriteria = getSession().createCriteria(BusinessDetails.class);
		createCriteria.add(Restrictions.idEq(id));
		return (BusinessDetails)createCriteria.uniqueResult();
	}

	public void updateActor(BusinessDetails actor) {
		getSession().update(actor);
		
	}*/

}
