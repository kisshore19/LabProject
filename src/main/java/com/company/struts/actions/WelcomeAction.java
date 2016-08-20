package com.company.struts.actions;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.company.hibernate.entities.BusinessDetails;
import com.company.spring.configurations.ApplicationConfiguration;
import com.company.spring.services.BusinessDetailsService;
import com.opensymphony.xwork2.Action;

@SuppressWarnings("resource")
public class WelcomeAction {
	private static final Logger LOGGER = Logger.getLogger(WelcomeAction.class.getName());

	private String companyName;

	public String execute() {

		AbstractApplicationContext abstractApplicationContext = new AnnotationConfigApplicationContext(
				ApplicationConfiguration.class);
		BusinessDetailsService businessDetailsService = (BusinessDetailsService) abstractApplicationContext
				.getBean("businessDetailsService");

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
