package Adapters;

import java.rmi.RemoteException;

import Abstracts.*;
import Entities.*;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerValidatorService {
	@Override
	public boolean checkRealPerson(Player player) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName().toUpperCase(),
					player.getLastName().toUpperCase(), player.getDateOfBirth());
		} catch (NumberFormatException | RemoteException e) {
			
			e.printStackTrace();
		}	
		return true;
	}

}
