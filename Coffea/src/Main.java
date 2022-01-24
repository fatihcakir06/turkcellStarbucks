import abstracts.CustomerManager;
import adapters.MernisServiceAdapter;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
	     CustomerManager customerManager = new NeroCustomerManager();
	      CustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());

	        Customer customer = new Customer(1,"ali","can");
	        customerManager.save(customer);
	        customerManager2.save(customer);
	    }
	}


