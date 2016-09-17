/**
 * 
 */
package com.company.struts.actions;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.company.hibernate.entities.Items;
import com.company.spring.services.BillService;

/**
 * @author ogvkisshorre
 * 
 */
public class BillingAction {

	/*
	 * Constants declaration
	 */
	final private static Logger LOGGER = Logger.getLogger(BillingAction.class.getName());
	final private static String SUCCESS = "success";
	final private static String FAIL = "fail";

	@Autowired
	BillService billService;

	private int id;
	private String name;
	private int age;
	private Date billDate;
	
	private List<Items> items;
	
	public void test(){
		StringBuilder optionsHtml = new StringBuilder();
		for (Items item : items) {
			optionsHtml.append("<option value=\"");
			optionsHtml.append(item.getId());
			optionsHtml.append("\">");
			optionsHtml.append(item.getItemName());
			optionsHtml.append("</option>");
			optionsHtml.append("\n");
		}
	}
	
	public String newBill() {
		setItems(billService.createNewBill());
		return SUCCESS;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

}
