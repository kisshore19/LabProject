package com.company.hibernate.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="BANK_DETAILS")
public class BankDetails implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 77728350640147583L;

	@Id
	@GeneratedValue
	@Column(name="ID", columnDefinition="int")
	private int id;
	
	@Column(name="ACCOUNT_DETAILS_ID", columnDefinition="int", insertable=false, updatable=false)
	private int accountDetailsId;
	
	@Column(name="BANK_NAME", columnDefinition="varchar")
	private String bankName;
	
	@Column(name="Account_Number", columnDefinition="int")
	private long accountNumber;
	
	@Column(name="IFCI_CODE", columnDefinition="varchar")
	private String ifciCode;
	
	@Column(name="ADDRESS", columnDefinition="varchar")
	private String address;
	
	@Column(name="BRANCH", columnDefinition="varchar")
	private String branch;
	
	@Column(name="INSERTED_TIMESTAMP", columnDefinition="timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date insertedTimestamp;
	
	@Column(name="UPDATED_TIMESTAMP", columnDefinition="timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTimestamp;
	
	@Column(name="UPDATED_BY", columnDefinition="varchar")
	private String updatedBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAccountDetailsId() {
		return accountDetailsId;
	}

	public void setAccountDetailsId(int accountDetailsId) {
		this.accountDetailsId = accountDetailsId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfciCode() {
		return ifciCode;
	}

	public void setIfciCode(String ifciCode) {
		this.ifciCode = ifciCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
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
	
	

}
