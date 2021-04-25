package banking.system;

import java.util.Arrays;

public class User {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String password;
	private String dob;
	private String cardNumber;
	private String address;
	private String username;
	private Account[] accounts;
	
	
	public User(int id, String firstName, String lastName, String email, String phone, String password, String dob, String address,
			String username) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.dob = dob;
		this.address = address;
		this.username = username;
		this.accounts = new Account[10];
	}
	
	public void addAccount(Account a) {
		int i = 0;
		for(; i < accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = a;
				return;
			}
		}
		if(i == accounts.length - 1) {
			resizeAccounts();
		}
	}
	
	public void removeAccount(Account a) {
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] == a) {
				accounts[i] = null;
			}
		}
	}
	
	private void resizeAccounts() {
		Account[] temp = new Account[this.accounts.length * 10];
		
		int j = 0;
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i] != null) {
				temp[j++] = accounts[i];
			}
		}
		accounts = temp;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getCard_number() {
		return cardNumber;
	}

	public void setCard_number(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public boolean verify_password(String p) {
		return this.password == p;
	}
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Account[] getAccounts() {
		return accounts;
	}
	
	@Override
	public String toString() {
		
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phone=" + phone + ", dob=" + dob + ", cardNumber=" + cardNumber
				+ ", address=" + address + ", username=" + username + ", accounts=" + Arrays.toString(accounts) + "]";
	}

	public void printCustomer() {
		System.out.println("ID: " + id);
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name: " + lastName);
		for(Account account: accounts) {
			if(account != null) {
				System.out.println(account);
			}
		}
	}
}
