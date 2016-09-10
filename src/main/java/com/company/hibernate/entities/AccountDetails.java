/**
 * 
 */
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

/**
 * @author ogvkisshorre
 * 
 */
@Entity
@Table(name = "ACCOUNT_DETAILS")
public class AccountDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 65909214806923389L;

	@Id
	@GeneratedValue
	@Column(name = "ID", columnDefinition = "int")
	private Integer id;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ACCOUNT_DETAILS_ID", nullable=false)
	private List<BankDetails> bankDetails;

	@Column(name = "TIN_NO", columnDefinition = "varchar")
	private String tinNo;

	@Column(name = "TAN_NO", columnDefinition = "varchar")
	private String tanNo;

	@Column(name = "PAN_NO", columnDefinition = "varchar")
	private String panNo;

	@Column(name = "INSERTED_TIMESTAMP", columnDefinition = "timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date insertedTimestamp;

	@Column(name = "UPDATED_TIMESTAMP", columnDefinition = "timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updatedTimestamp;

	@Column(name = "UPDATED_BY", columnDefinition = "varchar")
	private String updatedBy;

	@Column(name = "ACCOUNT_NAME", columnDefinition = "varchar")
	private String accountName;

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getTinNo() {
		return tinNo;
	}

	public void setTinNo(String tinNo) {
		this.tinNo = tinNo;
	}

	public String getTanNo() {
		return tanNo;
	}

	public void setTanNo(String tanNo) {
		this.tanNo = tanNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
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

	public List<BankDetails> getBankDetails() {
		if (bankDetails == null) {
			bankDetails = new ArrayList<BankDetails>();
		}
		return bankDetails;
	}

}
