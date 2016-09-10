/**
 * 
 */
package com.company.struts.actions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.company.hibernate.entities.AccountDetails;
import com.company.hibernate.entities.Address;
import com.company.hibernate.entities.BusinessDetails;
import com.company.spring.services.BusinessDetailsService;

/**
 * @author ogvkisshorre
 * 
 */
public class BusinessDetailsAction {

	/*
	 * Constants declaration
	 */
	final private static Logger LOGGER = Logger.getLogger(BusinessDetailsAction.class.getName());
	final private static String SUCCESS = "success";
	final private static String FAIL = "fail";
	
	
	/*Spring injections*/
	@Autowired
	BusinessDetailsService businessDetailsService;
	

	/* Form variables */

	private int id;

	private String companyName;
	private String companyDomain;
	private Date companyStartDate;
	private List<AccountDetails> accountDetails;
	private List<Address> addresses;
	private Date insertedTimestamp;
	private Date updatedTimestamp;
	private String updatedBy;

	public String execute() {
		return SUCCESS;
	}

	public String saveBusinessDetails() {
		LOGGER.info(getCompanyName());
		LOGGER.info(getCompanyDomain());
		LOGGER.info(getCompanyStartDate());
		BusinessDetails businessDetails = new BusinessDetails();
		
		businessDetails.setCompanyName(getCompanyName());
		businessDetails.setCompanyDomain(getCompanyDomain());
		businessDetails.setCompanyStartDate(getCompanyStartDate());
		
		
		businessDetailsService.saveBusinessDetails(businessDetails);
		

		return SUCCESS;
	}

	/* getters and setters for the form variables */

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Date getCompanyStartDate() {
		return companyStartDate;
	}

	public void setCompanyStartDate(Date companyStartDate) {
		this.companyStartDate = companyStartDate;
	}

	public String getCompanyDomain() {
		return companyDomain;
	}

	public void setCompanyDomain(String companyDomain) {
		this.companyDomain = companyDomain;
	}

	public Date getInsertedTimestamp() {
		return insertedTimestamp;
	}

	public void setInsertedTimestamp(Date insertedTimestamp) {
		this.insertedTimestamp = insertedTimestamp;
	}

	public Date getUpdatedTimestamp() {
		return updatedTimestamp;
	}

	public void setUpdatedTimestamp(Date updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public List<AccountDetails> getAccountDetails() {
		if (accountDetails == null) {
			accountDetails = new ArrayList<AccountDetails>();
		}
		return accountDetails;
	}

	public List<Address> getAddresses() {
		if (addresses == null) {
			addresses = new ArrayList<Address>();
		}
		return addresses;
	}

}
