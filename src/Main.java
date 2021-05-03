package coffeeCompanies;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {
	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Mustafa Samet", "Turan", 2000,"16258269684");
		
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager(new MernisServiceAdapter());
		baseCustomerManager.save(customer1);
		
		System.out.println();
	}
}
