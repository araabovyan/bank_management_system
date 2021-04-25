package banking.system;


public class Main {
	public static void main(String[] str) {
		
		Bank converseBank = new Bank("ConverseBank", "Davit Anhaght 25");
		User c1 = new User(1, "John", "Snow", "johnsnow@gmail.com", "+374123549", "youKnowNothing", "280AC", "Winterfell", "JOHN");
		c1.printCustomer();
		
		converseBank.addUser(c1);
		c1.addAccount(new Account("4568 4568 7894 0303", 4915.56, "VISA"));
		Account account = c1.getAccounts()[0];
		account.withdraw(5000);
		account.loan(100);
		account.withdraw(5000);
		
		System.out.println(" --------- ");
		c1.printCustomer();
	}
}
