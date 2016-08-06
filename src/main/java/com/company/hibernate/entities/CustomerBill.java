/**
 * 
 */
package com.company.hibernate.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author ogvkisshorre
 * 
 */
@Entity
@Table(name="CUSTOMER_BILL")
public class CustomerBill  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4604934130177563855L;

	@Id
	@GeneratedValue
	@Column(name="ID", columnDefinition="int")
	private int id;
	
	@Column(name="CUSTOMER_ID", columnDefinition="int" , nullable = false, insertable = false, updatable = false)
	private int customerId;
	
	@Column(name="ORDER_ID", columnDefinition="int" , nullable = false, insertable = false, updatable = false)
	private int orderId;
	
	@Column(name="TOTAL_ORDER", columnDefinition="int")
	private int totalOrder;
	
	@Column(name="TAX", columnDefinition="float")
	private float tax;
	
	@Column(name="DISCOUNT", columnDefinition="float")
	private float discount;
	
	@Column(name="TOTAL_AMOUNT", columnDefinition="float")
	private float totalAmount;
	
	@Column(name="PAID_AMOUNT", columnDefinition="float")
	private float paidAmount;
	
	@Column(name="BALANCE_AMOUNT", columnDefinition="float")
	private float balanceAmount;

	@Column(name="INSERTED_TIMESTAMP", columnDefinition="timestamp")
	private Date insertedTimestamp;
	
	@Column(name="UPDATED_TIMESTAMP", columnDefinition="timestamp")
	private Date updatedTimestamp;
	
	@Column(name="UPDATED_BY", columnDefinition="timestamp")
	private String updatedBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getTotalOrder() {
		return totalOrder;
	}

	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public float getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(float paidAmount) {
		this.paidAmount = paidAmount;
	}

	public float getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(float balanceAmount) {
		this.balanceAmount = balanceAmount;
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
