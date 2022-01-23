import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.Customer;
import Concrete.StarbucksCustomerManager;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Customer customer = new Customer(1, "FUdRKAN", "q", "@@", "18", 19917);
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		
		customerManager.Save(customer);
	}

}
