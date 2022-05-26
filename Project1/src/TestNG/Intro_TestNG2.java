package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Intro_TestNG2 {
	
	//Each method is treated as TestCase
	//TestNG have JAVA compiler which can run methods without main method
	
	@Test 
	public void Method3()
	{
		System.out.println("Running Method3");
	}

	@Test 
	@Parameters({"keyname","keyvalue"})
	public void Method33(String keyname, String keyvalue)
	{
		System.out.println("Running Method33");
		System.out.println("Running Method33 keyname "+keyname);
		System.out.println("Running Method33 keyvalue "+keyvalue);
	}
	
	@Test(groups= {"smoke"})
	public void Method4()
	{
		System.out.println("Running method4");
	}
	
	
	@Test //@Test (dependsOnMethods={"Method8"})
	public void Method5()
	{
		System.out.println("Running method5");
	}
	
	@Test(enabled=false)
	public void Method6()
	{
		System.out.println("Running Method6");
	}
	
	@Test(timeOut=400)
	public void Method7()
	{
		System.out.println("Running Method7");
	}
	
	@Test
	public void Method8()
	{
		System.out.println("Running Method8");
	}
	
	@DataProvider
	public Object[][] DataSet()
	{
		Object[][] data = new Object[3][2];
		
		//1st data set
		data[0][0]="firstsetuser";
		data[0][1]="firstsetpwd";
		
		//2st data set
		data[1][0]="secondsetuser";
		data[1][1]="secondsetpwd";
		
		//1st data set
		data[2][0]="thirdsetuser";
		data[2][1]="thirdsetpwd";
		
		return data;
	}
	
	@Test(dataProvider="DataSet")
	public void printdata(String name, String pwd)
	{
		System.out.println("Print data provider data set name:: " +name+" and its pwd is:: "+pwd);
	}

}
