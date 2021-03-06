import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1_Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Check uncheck and verify checkboxes with assertions
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(3000);
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected());

		// Find total number of checkboxes
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("Total number of checkboxes are:::::: " + ele.size());

	}

}
