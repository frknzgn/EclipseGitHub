 package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Concrete.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublic;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapStub;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException  {
	    KPSPublicSoapProxy proxy = new KPSPublicSoapProxy(); 
			
	    	return proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName(),customer.getLastName(),customer.getBirthYear());
	    }
}