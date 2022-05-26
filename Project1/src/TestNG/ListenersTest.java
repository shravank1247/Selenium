package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//ITestListener interface which implements TestNG listerners... It is same as EVENTS in testcomplete
//mist include listener in testng file


public class ListenersTest implements ITestListener {

	
	 @Override		
	    public void onFinish(ITestContext arg0) {					
	        // TODO Auto-generated method stub		
		 
		 System.out.println("OnFInish");
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext arg0) {					
	        // TODO Auto-generated method stub				
	    	System.out.println("OnStart");		
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	        		
	    }		

	    @Override		
	    public void onTestFailure(ITestResult result) {					
	        // TODO Auto-generated method stub				
	    	System.out.println("OnTestfailure  "+result);	
	    }		

	    @Override		
	    public void onTestSkipped(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	    	System.out.println("OnTestSkipper");
	    }		

	    @Override		
	    public void onTestStart(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	    	System.out.println("OnTestStart");
	    }		

	    @Override		
	    public void onTestSuccess(ITestResult arg0) {					
	        // TODO Auto-generated method stub				
	    	System.out.println("OnTestSuccess");
	    }
	    
}
