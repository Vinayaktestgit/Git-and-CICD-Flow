package testBasic;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestDemo2 {

	@AfterTest
	public void CarLoan()
	{
		System.out.println("After Test Test Run");
	}
	
	@Test(groups= {"Smoke"})
	public void HomeLoan() {
		System.out.println("My Home Loan");
	}
	
	@Test
	public void MobileLoan()
	{
		System.out.println("My Mobile Loan");
	}
	
	@BeforeTest
	public void BikeLoan() {
		System.out.println("Run Before Test  ");
	}
	
}
