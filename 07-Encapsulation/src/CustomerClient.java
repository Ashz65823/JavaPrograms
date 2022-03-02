
public class CustomerClient {

	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setBalance(2000);
		System.out.println(customer.getBalance());
		System.out.println(customer.isGoodCustomer());
		
		Customer customer2=new Customer();
		customer2.setBalance(120000);
		System.out.println(customer2.getBalance());
		System.out.println(customer2.isGoodCustomer());
	}
}
