package coffeeCustomer.concrete;

import java.rmi.RemoteException;
import java.util.Locale;

import coffeeCustomer.abstracts.CustomerCheckService;
import coffeeCustomer.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		boolean result = false;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			result =client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName().toUpperCase(new Locale("tr")), 
					customer.getLastName().toUpperCase(new Locale("tr")), 
					customer.getDateOFBirth());
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return result;
	}

}
