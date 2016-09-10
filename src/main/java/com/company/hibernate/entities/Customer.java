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

/**
 * @author ogvkisshorre
 * 
 */
@Entity
@Table(name = "CUSTOMER")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1595944196510125660L;

	@Id
	@GeneratedValue
	@Column(name = "ID", columnDefinition = "int")
	private Integer id;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "CUSTOMER_ID", nullable = false, insertable = false, updatable = false)
	private List<Address> addresse;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "CUSTOMER_ID", nullable = false, insertable = false, updatable = false)
	private List<CustomerOrders> customerOrders;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "CUSTOMER_ID", nullable = false, insertable = false, updatable = false)
	private List<CustomerBill> customerBills;

	@Column(name = "CUSTOMER_NAME", columnDefinition = "varchar")
	private String customerName;

	@Column(name = "AGE", columnDefinition = "int")
	private Integer age;

	@Column(name = "DOB", columnDefinition = "date")
	private Date dob;

	@Column(name = "INSERTED_TIMESTAMP", columnDefinition = "timestamp")
	private Date insertedTimestamp;

	@Column(name = "UPDATED_TIMESTAMP", columnDefinition = "timestamp")
	private Date updatedTimestamp;

	@Column(name = "UPDATED_BY", columnDefinition = "varchar")
	private String updatedBy;

	public int getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
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

	public List<Address> getAddresses() {
		if (addresse == null) {
			addresse = new ArrayList<Address>();
		}
		return addresse;
	}

	/**
	 * @return the customerOrders
	 */
	public List<CustomerOrders> getCustomerOrders() {
		if (customerOrders == null) {
			customerOrders = new ArrayList<CustomerOrders>();
		}
		return customerOrders;
	}

	/**
	 * @return the customerBills
	 */
	public List<CustomerBill> getCustomerBills() {
		if (customerBills == null) {
			customerBills = new ArrayList<CustomerBill>();
		}
		return customerBills;
	}

}
