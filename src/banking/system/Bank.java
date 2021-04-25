package banking.system;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<User> users;
	private String name;
	private String address;
	
	public Bank(String name, String address) {
		this.users = new ArrayList<>();
		this.name = name;
		this.address = address;
	}
	
	public void addUser(User u) {
		users.add(u);
	}
	
	public void removeUser(User u) {
		users.remove(u);
	}
	
	public List<User> getUsers() {
		return users;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Bank [users=" + users + ", name=" + name + ", address=" + address + "]";
	}	
}
