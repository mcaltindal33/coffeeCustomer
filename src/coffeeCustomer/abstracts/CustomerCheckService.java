package coffeeCustomer.abstracts;

import coffeeCustomer.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
