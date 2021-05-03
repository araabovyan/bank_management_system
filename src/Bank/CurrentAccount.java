package Bank;

public class CurrentAccount extends BankAccount {

	private static final long serialVersionUID = 1L;
	private String tradeLicenseNumber;

	public CurrentAccount(String name, double balance,String tradeLicenseNumber) throws Exception {
		super(name, balance, 5000);
		this.tradeLicenseNumber= tradeLicenseNumber;
		if(balance<5000) throw new Exception("Insufficient Balance");
	}

	public String getTradeLicenseNumber() {
		return tradeLicenseNumber;
	}

	public void setTradeLicenseNumber(String tradeLicenseNumber) {
		this.tradeLicenseNumber = tradeLicenseNumber;
	}
		
}
