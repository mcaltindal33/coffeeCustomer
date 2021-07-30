package coffeeCustomer;


import coffeeCustomer.abstracts.CustomerService;
import coffeeCustomer.concrete.NeroCustomerManager;
import coffeeCustomer.entities.Customer;

public class Main {

	public static void main(String[] args) {
		CustomerService customerService = new NeroCustomerManager();
		customerService .save(new Customer(1, "Mustafa Çaðrý", "Altýndal", 37, "12345678911"));
	}

}
