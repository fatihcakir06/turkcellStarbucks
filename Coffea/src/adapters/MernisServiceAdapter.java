package adapters;

import abstracts.PersonChechService;
import entities.Customer;

public class MernisServiceAdapter implements PersonChechService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
