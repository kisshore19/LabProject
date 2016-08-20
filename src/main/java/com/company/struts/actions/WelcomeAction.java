package com.company.struts.actions;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.company.hibernate.entities.BusinessDetails;
import com.company.spring.services.BusinessDetailsService;
import com.opensymphony.xwork2.Action;

public class WelcomeAction {

	private static final Logger LOGGER = Logger.getLogger(WelcomeAction.class.getName());

	private String companyName;

	@Autowired
	BusinessDetailsService businessDetailsService;

	public String execute() {

		BusinessDetails businessDetails = new BusinessDetails();
		businessDetails.setId(2);
		businessDetails = businessDetailsService.getBusinessDetails(businessDetails);
		LOGGER.info("Company Name : " + businessDetails.getCompanyName());
		LOGGER.info("Company Domain : " + businessDetails.getCompanyDomain());

		return Action.SUCCESS;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
