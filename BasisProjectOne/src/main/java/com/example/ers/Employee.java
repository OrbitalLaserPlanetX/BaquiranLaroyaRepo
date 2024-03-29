package com.example.ers;

import org.apache.log4j.Logger;

public class Employee {
	
	final static Logger loggy = Logger.getLogger(Employee.class);

	int usedId;
	String username;
	String password;
	String firstname;
	String lastname;
	String email;
	String type; // for determining if is employee of finance manager.

	public Employee() {

	}

	public Employee(int usedId, String username, String password, String firstname, String lastname, String email, String type) {
		this.usedId = usedId;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.type = type;
	}

	public int getUsedId() {
		return usedId;
	}

	public void setUsedId(int usedId) {
		this.usedId = usedId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstname;
	}

	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}

	public String getLastName() {
		return lastname;
	}
	
	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Employee [usedId=" + usedId + ", username=" + username + ", password=" + password + ", firstname="
				+ firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
}