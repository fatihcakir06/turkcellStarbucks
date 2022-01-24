package concretes;

import abstracts.PersonChechService;
import entities.Customer;

public class CustomerCheckManager implements PersonChechService {
    @Override
    public boolean CheckIfRealPerson(Customer customer) {
        return true;
    }
}
