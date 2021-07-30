package coffeeCustomer.concrete;

import coffeeCustomer.abstracts.CustomerCheckService;
import coffeeCustomer.entities.Customer;


public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}
}
