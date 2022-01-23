package Concrete;

import Abstract.ICustomerCheckService;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
