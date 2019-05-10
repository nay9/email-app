package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int inboxSize;
	private String altEmail;
	
	
	public Email(String firstName, String lastName) {
		//set a name for new employee
		this.firstName = setFirstName();
		this.lastName = setLastName();
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//set a department for new employee
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
	
		//set a new password for employee
		this.password = randPassword(8);
		System.out.println("Your password is " + this.password);
	}
	
	private String randPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%&";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}


	public String getFirstName() {
		return firstName;
	}


	public String setFirstName() {
		System.out.println("Enter the first name:");
		Scanner input = new Scanner(System.in);
		return this.firstName = input.nextLine();
	}


	public String getLastName() {
		return lastName;
	}


	public String setLastName() {
		System.out.println("Enter the last name:");
		Scanner input = new Scanner(System.in);
		return this.lastName = input.nextLine();
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getDepartment() {
		return department;
	}


	public String setDepartment() {
		System.out.println("Enter the department\n1. Sales\n2. Development\n3. Accounting\n0. N/A");
		Scanner input = new Scanner(System.in);
		int depChoice = input.nextInt();
		if(depChoice ==1) { 
			return "Sales"; 
		} else if(depChoice ==2) {
			return "Development";
		} else if(depChoice ==3) {
			return "Accounting";
		} else {
			return "N/A";
		}
	}


	public int getInboxSize() {
		return inboxSize;
	}


	public void setInboxSize(int inboxSize) {
		this.inboxSize = inboxSize;
	}


	public String getAltEmail() {
		return altEmail;
	}


	public void setAltEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	
	
	
	
}
