/**
 * 
 */
package com.company.spring.rest.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.spring.rest.responseBeans.Status;

/**
 * @author ogvkisshorre
 *
 */

@RestController
@RequestMapping("businessResource")
public class BusinessResource {
	
	@RequestMapping(path="createBusiness",method=RequestMethod.POST,consumes="application/json")
	public Status createBusiness(){
		Status status=new Status();
		status.setReference(""+Math.random());
		status.setResponseMessage("SUCCESS");
		return status;
		
	}

}
