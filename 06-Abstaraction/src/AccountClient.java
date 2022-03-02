
public class AccountClient {

	public static void main(String[] args) {
		Account account=new Account();
		account.typeOfAccount=1;
		account.balance=10000;
		System.out.println(account.getIntrestAmount());
		
		System.out.println("Second Object");
		Account account2=new Account();
		account2.balance=20000;
		account2.typeOfAccount=2;
		System.out.println(account2.getIntrestAmount());
	}

}
