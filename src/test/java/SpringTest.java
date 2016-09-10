
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.company.hibernate.entities.AccountDetails;
import com.company.hibernate.entities.Address;
import com.company.hibernate.entities.BankDetails;
import com.company.hibernate.entities.BusinessDetails;
import com.company.hibernate.entities.Customer;
import com.company.hibernate.entities.CustomerBill;
import com.company.hibernate.entities.CustomerOrders;
import com.company.hibernate.entities.Items;
import com.company.spring.configurations.ApplicationConfiguration;
import com.company.spring.services.BusinessDetailsService;
import com.company.spring.services.CustomerService;
import com.company.spring.services.ItemsService;

public class SpringTest {

	public static void main(String args[]) {

		AbstractApplicationContext abstractApplicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		BusinessDetailsService businessDetailsService = (BusinessDetailsService) abstractApplicationContext.getBean("businessDetailsService");
		
		CustomerService customerService= (CustomerService) abstractApplicationContext.getBean("customerService");
		
		ItemsService itemsService = (ItemsService) abstractApplicationContext.getBean("itemsService");
		
		System.out.println(itemsService.getAllItems());
		/*CustomerBill customerBill=new CustomerBill();
		customerBill.setTotalAmount(2000.00f);
		customerBill.setPaidAmount(2000.0f);
		
		
		CustomerOrders customerOrders=new CustomerOrders();
		customerOrders.setItemPrice(50);
		customerOrders.setItemQty(10);
		
		customerOrders.getCustomerBills().add(customerBill);

		Address address=new Address();
		address.setCity("Konaseema_2");
		
		
		
		Items items=new  Items();
		items.setItemName("Cow Ghee");
		items.setItemPrice(450.00f);
		
		
		items.getCustomerOrder().add(customerOrders);
		
		
		
		
		Customer customer=new Customer();
		
		
		customer.setCustomerName("SriHari HARI");
		customer.getAddresses().add(address);
		customer.getCustomerOrders().add(customerOrders);
		customer.getCustomerBills().add(customerBill);
		
		BankDetails bankDetails=new  BankDetails();
		bankDetails.setBankName("AXIS BANK");
		
		
		AccountDetails accountDetails=new AccountDetails();
		accountDetails.getBankDetails().add(bankDetails);
		accountDetails.setAccountName("Current Account");
		accountDetails.setPanNo("1003");
//		accountDetails.setId(100);
		
//		AccountDetails accountDetails=new AccountDetails();
		BusinessDetails businessDetails = new BusinessDetails();
		
		businessDetails.setCompanyName("JNATHRI");
		businessDetails.setCompanyDomain("Lead success");
		
		businessDetails.getAccountDetails().add(accountDetails);
		businessDetails.getAddresses().add(address);
		businessDetailsService.saveBusinessDetails(businessDetails);*/
		
		
		//customerService.saveCustomer(customer);
		
		//itemsService.saveItem(items);
	}
}
