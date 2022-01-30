package email_application;

import java.util.Scanner;

public class email 

{
	Scanner scan = new Scanner(System.in);
	private String firstname;
	private String lastname;
	private int default_password_length = 10;
	private String password;
	private String department;
	private String email;
	private String company= "xyz.com";
	private int mailbox_capacity = 500;
	private String alternative_email;
	
	public email(String firstname, String lastname)
	
	{
		this.firstname = firstname;
		this.lastname = lastname;
		
		System.out.println("New Worker: " + this.firstname + " " + this.lastname);
		
		this.department = setdepartment();
		this.password = generate_password(default_password_length);
		
		email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + "." + company;
	}
	
	private String setdepartment()
	
	{
		System.out.println("\nEnter the department:\n1 for sales\n2 for developement\n3 for accounting\n4 for none");
		int deptopt = scan.nextInt();
		if(deptopt == 1)
			
		{
			return "sales";
		}
		else if(deptopt == 2)
			
		{
			return "developement";
		}
		else if(deptopt == 3)
			
		{
			return "accounting";
		}
		else
			
		{
			return "";
		}
	}
	
	private String generate_password(int length)
	
	{
		String passwordset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i = 0; i < length; i++)
		{
			int rand = (int)(Math.random() * passwordset.length());
			password[i] = passwordset.charAt(rand);
		}
		
		return new String(password);
	} 
	
	public void set_mailbox_capacity(int capacity)
	
	{
		this.mailbox_capacity = capacity;
	}
	
	public void set_alternate_email(String alt_email)
	
	{
		this.alternative_email = alt_email;
	}
	
	public void change_password(String password)
	
	{
		this.password = password;
	}
	
	public int get_mailbox_capacity()
	
	{
		return mailbox_capacity;
	}
	
	public String get_alternate_email()
	
	{
		return alternative_email;
	}
	
	public String get_password()
	
	{
		return password;
	}
	
	public String display_information()
	
	{
		return "NAME: " + firstname + " " + lastname +
				"\nEMAIL: " + email +
				"\nMAILBOX CAPACITY: " + mailbox_capacity + "mb";
		
	}	

}
