
public class Account {
	public String account_number;
	public String account_balance;
	public String account_description;
	
	public Account(String account_number, String account_balance, String account_description) {

		this.account_number = account_number;
		this.account_balance = account_balance;
		this.account_description = account_description;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getAccount_balance() {
		return account_balance;
	}

	public void setAccount_balance(String account_balance) {
		this.account_balance = account_balance;
	}

	public String getAccount_description() {
		return account_description;
	}

	public void setAccount_description(String account_description) {
		this.account_description = account_description;
	}
	
	

}
