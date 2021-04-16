
public class Customer {
	private int id;
	public String fname;
	public String lname;
	public String email;
	public String phone;
	private String password;
	public String dob;
	public String card_number;
	public String address;
	public String username;
	
	
	public Customer(int id, String fname, String lname, String email, String phone, String password, String dob, String address,
			String username) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.dob = dob;
		this.address = address;
		this.username = username;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
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
		return card_number;
	}

	public void setCard_number(String card_number) {
		this.card_number = card_number;
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
	
	public void print_customer() {
		System.out.println("ID: " + id);
		System.out.println("First Name: " + fname);
		System.out.println("Last Name: " + lname);
	}
}
