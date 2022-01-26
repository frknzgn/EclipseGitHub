package gameMarketingDemo.core.adapters.concretes;

import java.rmi.RemoteException;

import gameMarketingDemo.core.adapters.abstracts.GamerCheckService;
import gameMarketingDemo.entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapterManager implements GamerCheckService {

	@Override
	public boolean ifCheckRealPerson(Gamer gamer) throws NumberFormatException, RemoteException {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		
		return proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationilityId()),gamer.getFirsName().toUpperCase(),gamer.getLastName().toUpperCase(),gamer.getBirthYear());
		
	}

}
