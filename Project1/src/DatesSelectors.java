import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class DatesSelectors {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		driver.findElement(By.cssSelector("input#ctl00_mainContent_view_date1")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.ui-state-highlight")).click();
		
		//Navigate to next month (future) & select
		driver.findElement(By.cssSelector("input#ctl00_mainContent_view_date1")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
		Thread.sleep(2000);
		System.out.println("Navigated month is :::"+driver.findElement(By.xpath("//span[text()='June']")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//span[text()='June']")).getText(),"June");
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[1]/td[4]")).click();
		
		//Verify future date selection
		String str = driver.findElement(By.cssSelector("#view_fulldate_id_1")).getText();
		Assert.assertTrue(str.contains("Jun"));
		//Assert.assertEquals(driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[1]/td[4]")).getText(), "1");
		//System.out.println("Selected future date is :::: "+driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[2]/table/tbody/tr[1]/td[4]")).getText());
	


	}

}
