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
@Table(name = "CUSTOMER_ORDERS")
public class CustomerOrders implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7052315578738624973L;

	@Id
	@GeneratedValue
	@Column(name = "ID", columnDefinition = "int")
	private int id;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ORDER_ID", nullable = false, insertable = false, updatable = false)
	private List<CustomerBill> customerBills_;

	@Column(name = "ITEM_ID", columnDefinition = "int", nullable = true, insertable = false, updatable = false)
	private int itemId;

	@Column(name = "CUSTOMER_ID", columnDefinition = "int", insertable = false, updatable = false)
	private int customerId;

	@Column(name = "ITEM_QTY", columnDefinition = "int")
	private int itemQty;

	@Column(name = "ITEM_PRICE", columnDefinition = "float")
	private float itemPrice;

	@Column(name = "INSERTED_TIMESTAMP", columnDefinition = "timestamp")
	private Date insertedTimestamp;

	@Column(name = "UPDATED_TIMESTAMP", columnDefinition = "timestamp")
	private Date updatedTimestamp;

	@Column(name = "UPDATED_BY", columnDefinition = "varchar")
	private String updatedBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
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

	/**
	 * @return the customerBills
	 */
	public List<CustomerBill> getCustomerBills() {
		if (customerBills_ == null) {
			customerBills_ = new ArrayList<CustomerBill>();
		}
		return customerBills_;
	}

}
