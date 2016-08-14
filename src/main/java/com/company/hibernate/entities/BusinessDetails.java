package com.company.hibernate.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "BUSINESS_DETAILS")
public class BusinessDetails implements Serializable {

	/**
	 * This entity has a relationship with the account details (one to many)
	 */
	private static final long serialVersionUID = 5053985622370488637L;

	@Id
	@GeneratedValue
	@Column(name = "ID", columnDefinition = "int")
	private int id;

	/*For uni-direction one - to - many 	we need to use these steps 
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="BUSINESS_DETAILS_ID") and this column should be null acceptable */
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="BUSINESS_DETAILS_ID", nullable=false)
	private List<AccountDetails> accountDetails;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="BUSINESS_DETAILS_ID", nullable=false)
	private List<Address>  addresses;

	@Column(name = "COMPANY_NAME", columnDefinition = "varchar")
	private String companyName;

	@Column(name = "COMPANY_START_DATE", columnDefinition = "datetime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date companyStartDate;

	@Column(name = "COMPANY_DOMAIN", columnDefinition = "varchar")
	private String companyDomain;

	@Column(name = "INSERTED_TIMESTAMP", columnDefinition = "timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date insertedTimestamp;

	@Column(name = "UPDATED_TIMESTAMP", columnDefinition = "timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTimestamp;

	@Column(name = "UPDATED_BY", columnDefinition = "varchar")
	private String updatedBy;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public List<AccountDetails> getAccountDetails() {
		if (accountDetails == null) {
			accountDetails = new ArrayList<AccountDetails>();
		}
		return accountDetails;
	}

	public List<Address> getAddresses() {
		if(addresses == null){
			addresses = new ArrayList<Address>();
		}
		return addresses;
	}
	

}
