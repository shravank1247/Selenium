import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
		//SoftAssert used to continue the execution even after failure and report once execution completes
		SoftAssert a = new SoftAssert();
		
		// limiting the driver scope to footer section
		List<WebElement> allLinks = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link : allLinks)
		{
			String url = link.getAttribute("herf");
			
			//To verify links working status & get the response 
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			
			//Using soft assertion
			a.assertTrue(respCode>=400, "Response for link is ::: \"+ link.getText()+ \" ::: \"+url+\" :::: is ::::: \"+respCode");
			
			//Using hard Assertion
			/*
			if(respCode>=400)
			{
				System.out.println("Broken link is ::: "+link.getText());
				Assert.assertTrue(false); // Hard Assertion
			}
			*/
			System.out.println("Response for link is ::: "+ link.getText()+ " ::: "+url+" :::: is ::::: "+respCode);
		}
		
		a.assertAll(); // to report failures

	}

}
