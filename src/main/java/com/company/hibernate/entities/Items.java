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
@Table(name = "ITEMS")
public class Items implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6466545367789589221L;

	@Id
	@GeneratedValue
	@Column(name = "ID", columnDefinition = "int")
	private int id;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ITEM_ID", nullable = false, insertable = false, updatable = false)
	private List<CustomerOrders> customerOrder;

	@Column(name = "ITEM_NAME", columnDefinition = "varchar")
	private String itemName;

	@Column(name = "OPEN_BAL_QTY", columnDefinition = "int")
	private int openBalQty;

	@Column(name = "ITEM_PRICE", columnDefinition = "float")
	private float itemPrice;

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

	public List<CustomerOrders> getCustomerOrder() {
		if (customerOrder == null) {
			customerOrder = new ArrayList<CustomerOrders>();
		}
		return customerOrder;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getOpenBalQty() {
		return openBalQty;
	}

	public void setOpenBalQty(int openBalQty) {
		this.openBalQty = openBalQty;
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

}
