package coffeeCustomer;


import coffeeCustomer.concrete.NeroCustomerManager;
import coffeeCustomer.entities.Customer;

public class Main {

	public static void main(String[] args) {
		NeroCustomerManager neroCustomerManager = new NeroCustomerManager();
		neroCustomerManager.save(new Customer(1, "Mustafa �a�r�", "Alt�ndal", 37, "12345678911"));
	}

}
