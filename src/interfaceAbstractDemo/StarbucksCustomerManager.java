package interfaceAbstractDemo;

import interfaceAbstractDemo.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());
		
	}
	
}
