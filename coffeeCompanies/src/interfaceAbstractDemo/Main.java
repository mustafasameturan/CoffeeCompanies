package interfaceAbstractDemo;

import interfaceAbstractDemo.Entities.Customer;

public class Main {
	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Mustafa Samet", "Turan", "27.03.2000","11111111");
		
		BaseCustomerManager baseCustomerManager = new NeroCustomerManager();
		baseCustomerManager.Save(customer1);
	}
}
