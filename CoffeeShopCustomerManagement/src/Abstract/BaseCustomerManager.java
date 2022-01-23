package Abstract;

import Concrete.Customer;

public abstract class BaseCustomerManager implements ICustomerService {
	
	@Override
	public void Save(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(customer.getFirstName() + " :: BaseCustomerManager's save method.");
	}

}
