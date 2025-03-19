package Pack2;

import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void createOrgTest() {

		String URL = System.getProperty("url");
		String Browser = System.getProperty("browser","chrome");
		String Username = System.getProperty("username");
		String Password = System.getProperty("Password");

		
		System.out.println(URL);
		System.out.println(Browser);
		System.out.println(Username);
		System.out.println(Password);
		System.out.println("execute createOrgTest");
	}

	@Test
	public void modifyOrgTest() {

		System.out.println("execute modifyOrgtest");
	}

}
