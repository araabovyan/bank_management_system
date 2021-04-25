package banking.system;

public class Account {
	private String accountNumber;
	private double accountBalance;
	private String accountDescription;
	private double loanBalance;
	
	public Account(String accountNumber, double accountBalance, String accountDescription) {
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.accountDescription = accountDescription;
		this.loanBalance = 0;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	private void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	private void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getAccountDescription() {
		return accountDescription;
	}
	private void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}	
	public double getLoanBalance() {
		return loanBalance;
	}
	private void setLoanBalance(double loanBalance) {
		this.loanBalance = loanBalance;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ ", accountDescription=" + accountDescription + ", loanBalance=" + loanBalance + "]";
	}

	public void depositAmount(double amount) {
		System.out.println("You are going to enter deposit of " + amount);
		setAccountBalance(this.accountBalance + amount);
		System.out.println("Your balance now is " + this.accountBalance);
	}
	
	public void withdraw(double amount) {
		System.out.println("You are going to withdraw amount of " + amount);
		if(amount < this.accountBalance) {
			setAccountBalance(this.accountBalance - amount);
			System.out.println("Your balance now is " + this.accountBalance);
		}else {
			System.out.println("You do not have enough money!");
		}
		
	}
	public void loan(double amount) {
		System.out.println("You are going to get a loan amount of " + amount);
		setAccountBalance(this.accountBalance + amount);
		setLoanBalance(this.loanBalance + amount);
		System.out.println("Your account balance is " + this.accountBalance + "\nYour loan balance is " + this.loanBalance);
	}

}
