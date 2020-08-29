package red_carpet;


import org.testng.annotations.Test;

public class TestRegistration{
	
	@Test(description="user login",priority=2)
	public void testLogin() 
	{
		System.out.println("Hello World");
	}
	
	@Test(description="user logout",priority=1)
	public void testlogout() 
	{
		System.out.println("second test");
	}
	
	
	@Test(description="user account",priority=0)
	public void testuseraccount() 
	{
		System.out.println("user account");
	}
}
