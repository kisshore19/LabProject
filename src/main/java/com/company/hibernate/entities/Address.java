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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author ogvkisshorre
 * 
 */
@Entity
@Table(name = "ADDRESS")
public class Address implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 48302020909112211L;

	@Id
	@GeneratedValue
	@Column(name = "ID", columnDefinition = "int")
	private Integer Id;

	@Column(name = "BUSINESS_DETAILS_ID", columnDefinition = "int", insertable = false, updatable = false)
	private Integer businessDetailsId;

	@Column(name = "CUSTOMER_ID", columnDefinition = "int", insertable = false, updatable = false)
	private Integer customerId;

	@Column(name = "HOUSE_NO", columnDefinition = "varchar")
	private String houseNo;

	@Column(name = "STREET_NAME", columnDefinition = "varchar")
	private String streetName;

	@Column(name = "VILLAGE", columnDefinition = "varchar")
	private String village;

	@Column(name = "CITY", columnDefinition = "varchar")
	private String city;

	@Column(name = "DISTRICT", columnDefinition = "varchar")
	private String district;

	@Column(name = "STATE", columnDefinition = "varchar")
	private String state;

	@Column(name = "COUNTRY", columnDefinition = "varchar")
	private String country;

	@Column(name = "PINCODE", columnDefinition = "int")
	private Integer pincode;

	@Column(name = "MOBILE_NO", columnDefinition = "int")
	private Integer mobileNo;

	@Column(name = "LAND_NO_1", columnDefinition = "int")
	private Integer landNo1;

	@Column(name = "LAND_NO_2", columnDefinition = "int")
	private Integer landNo2;

	@Column(name = "IS_ACTIVE", columnDefinition = "tinyint")
	private Integer isActive;

	@Column(name = "IS_PRIMARY_ADDRESS", columnDefinition = "tinyint")
	private Integer isPrimaryAddress;

	@Column(name = "INSERTED_TIMESTAMP", columnDefinition = "timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date insertedTimestamp;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_TIMESTAMP", columnDefinition = "timestamp")
	private Date updatedTimestamp;
	
	@Column(name = "UPDATED_BY", columnDefinition = "varchar")
	private String updatedBy;

	public int getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public int getBusinessDetailsId() {
		return businessDetailsId;
	}

	public void setBusinessDetailsId(Integer businessDetailsId) {
		this.businessDetailsId = businessDetailsId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getLandNo1() {
		return landNo1;
	}

	public void setLandNo1(Integer landNo1) {
		this.landNo1 = landNo1;
	}

	public int getLandNo2() {
		return landNo2;
	}

	public void setLandNo2(Integer landNo2) {
		this.landNo2 = landNo2;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	public int getIsPrimaryAddress() {
		return isPrimaryAddress;
	}

	public void setIsPrimaryAddress(Integer isPrimaryAddress) {
		this.isPrimaryAddress = isPrimaryAddress;
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
