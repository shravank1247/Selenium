import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		Thread.sleep(2000);
		//Find enabled or disabled element without using isEnabled() function
		if(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$view_date2']")).getAttribute("style").contains("0.5"))
			System.out.println("End date is disabled :::");
		else
			System.out.println("End date is Enabled in One Way :::");
		
		/*//using predefined function isEnabled()
		if(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$view_date2']")).isEnabled())
			System.out.println("End date is disabled in isEnabled :::");
		else
			System.out.println("End date is isEnabled in One Way :::");
			*/
		
		Thread.sleep(2000);
		//Change two way trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.cssSelector("input[name='ctl00$mainContent$view_date2']")).getAttribute("style").contains("0.5"))
			System.out.println("End date is disabled :::");
		else
			System.out.println("End date is enabled in Round Trip");
		
	}

}
