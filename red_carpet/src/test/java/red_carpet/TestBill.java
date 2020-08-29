package red_carpet;

import org.testng.annotations.Test;

public class TestBill {
	

	@Test(description="test billing 2")
	public void testDebitBill() 
	{
		System.out.println("test debit bill pass");
	}

	
	@Test(description="test billing", priority=0)
	public void testBill() 
	{
		System.out.println("another class test bill pass");
	}
	

}
