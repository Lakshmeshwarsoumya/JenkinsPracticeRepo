package pack1;

import org.testng.annotations.Test;

public class ContactTest {
	@Test
	public void createContactTest() {

		String URL = System.getProperty("url");
		String Browser = System.getProperty("browser","chrome");
		String Username = System.getProperty("username");
		String Password = System.getProperty("Password");

		
		System.out.println(URL);
		System.out.println(Browser);
		System.out.println(Username);
		System.out.println(Password);
		System.out.println("execute createcontacttest");
	}

	@Test
	public void modifyContactTest() {

		System.out.println("execute modifycontacttest");
		
	}
	

}
