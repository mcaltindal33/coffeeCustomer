package coffeeCustomer.concrete;

import coffeeCustomer.abstracts.CustomerService;
import coffeeCustomer.entities.Customer;

public abstract class BaseCustomerManager  implements CustomerService{

	public BaseCustomerManager() {
		super();
	}

	@Override
	public void save(Customer customer) {
		System.out.println(customer.getFirstName() + " kayýt edildi.");
	}


}
