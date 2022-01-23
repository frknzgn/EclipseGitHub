package Abstract;

import java.rmi.RemoteException;

import Concrete.Customer;

public interface ICustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
