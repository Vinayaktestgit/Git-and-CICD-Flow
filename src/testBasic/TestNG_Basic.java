package testBasic;

import org.testng.annotations.Test;

public class TestNG_Basic {

	@Test(groups= {"Smoke"})
	public void Demo() {
		System.out.println("New Test NG Framework");
	}

	@Test
	
	public void DemoSecond()
	{
		System.out.println("Secound Test Case runin Test NG");
	}
	
	@Test
	public void Testme()
	{
		System.out.println("Hello ALl ");
		System.out.println(" It's New Test Method in code for git hub");
	}
}
