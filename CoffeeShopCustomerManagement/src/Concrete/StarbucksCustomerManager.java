package Concrete;

import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;

public class StarbucksCustomerManager extends BaseCustomerManager implements ICustomerCheckService{
	ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager() {
		super();
	}

	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		super();
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void Save(Customer customer) throws Exception {
		if(_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			throw new Exception("Not valid.");
		}
		
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		return true;
	}

}
