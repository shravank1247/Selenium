package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Intro_TestNG {
	
	//Each method is treated as TestCase
	//TestNG have JAVA compiler which can run methods without main method
	@Test
	public void NoMainMethod()
	{
		System.out.println("Running without main method");
	}

	@Test(groups= {"smoke"})
	public void Method1()
	{
		System.out.println("Running method1");
	}
	
	@Test
	public void Method2()
	{
		System.out.println("Running method2");
	}
	
	@Test
	public void Method2_A()
	{
		System.out.println("Running method2_A");
	}
	
	@Test
	public void Method2_B()
	{
		System.out.println("Running method2_B");
	}
	
	@Test 
	@Parameters({"URL"})
	public void Method2_C(String name)
	{
		System.out.println("Running Method2_C");
		System.out.println("URL Method2_C  "+name);
	}

}
