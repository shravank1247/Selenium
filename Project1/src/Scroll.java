import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Using javascript scroll can be performed
		// Invoking of javascript
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Window page scroll
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);

		// Table inside page scroll
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500;");

		// Sum of last column in table
		int sum =0;
		List<WebElement> le = driver.findElements(By.xpath("//div[@class='tableFixHead'] //tr/td[4]"));
		for (int i = 0; i < le.size(); i++) 
		{
			String a = le.get(i).getText();
			
			//Used to part String to Integer
			sum = sum+Integer.parseInt(a);
		}
		System.out.println("Sum of number is " +sum);
		int exp = Integer.parseInt((driver.findElement(By.xpath("//div[@class='totalAmount']"))).getText().split(":")[1].trim());
		Assert.assertEquals(exp, sum);
	
	}

}
