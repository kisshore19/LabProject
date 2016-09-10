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
	private Integer id;
	
	@Column(name="CUSTOMER_ID", columnDefinition="int" , nullable = false, insertable = false, updatable = false)
	private Integer customerId;
	
	@Column(name="ORDER_ID", columnDefinition="int" , nullable = false, insertable = false, updatable = false)
	private Integer orderId;
	
	@Column(name="TOTAL_ORDER", columnDefinition="int")
	private Integer totalOrder;
	
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

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public int getTotalOrder() {
		return totalOrder;
	}

	public void setTotalOrder(Integer totalOrder) {
		this.totalOrder = totalOrder;
	}

	public float getTax() {
		return tax;
	}

	public void setTax(Float tax) {
		this.tax = tax;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(Float discount) {
		this.discount = discount;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public float getPaidAmount() {
		return paidAmount;
	}

	public void setPaidAmount(Float paidAmount) {
		this.paidAmount = paidAmount;
	}

	public float getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(Float balanceAmount) {
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
