package coffeeCustomer.concrete;

import coffeeCustomer.abstracts.CustomerCheckService;
import coffeeCustomer.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer))
		{
			System.out.println(customer.getFirstName() + " kayýt edildi.");
			
		}
		else {
			System.out.println("doðrulanmadý");
		}
		
	}

	
	
	
}
