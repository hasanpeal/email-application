package email_application;

public class email_application 

{

	public static void main(String[] args) 
	
	{
		email object = new email("Peal","Hasan");
		object.change_password("xyz");
		object.set_alternate_email("peal.hasan225@dept.xyz.com");
		object.set_mailbox_capacity(1000);
		object.get_alternate_email();
		object.get_mailbox_capacity();
		object.get_password();
		System.out.println(object.display_information());
	}

}
