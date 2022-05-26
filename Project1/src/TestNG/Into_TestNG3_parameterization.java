package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Into_TestNG3_parameterization {
	
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

