package concretes;

import abstracts.CustomerManager;
import abstracts.PersonChechService;
import entities.Customer;

public class StarbucksCustomerManager extends CustomerManager {
    private PersonChechService service;

    public StarbucksCustomerManager(PersonChechService service) {
        this.service = service;
    }

    @Override
    public void save(Customer customer) {
        if (service.CheckIfRealPerson(customer)){
            super.save(customer);
        }
        System.out.println("Hatalý iþlem");
    }


}
