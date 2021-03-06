import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment8_AutoCompleteDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("Unit");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.id("autocomplete")).getText());
		List<WebElement> dropdown = driver.findElements(By.cssSelector("li.ui-menu-item"));
		for (int i = 0; i < dropdown.size(); i++) {
			if (driver.findElements(By.cssSelector("li.ui-menu-item")).get(i).getText().contains("USA")) {
				driver.findElement(By.id("autocomplete")).sendKeys(Keys.TAB);
				break;
			}

			System.out.println("ieteration value is::" + i + " "
					+ driver.findElements(By.cssSelector("li.ui-menu-item")).get(i).getText());
			driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

			Thread.sleep(1000);
		}
		Assert.assertEquals("United States (USA)", driver.findElement(By.id("autocomplete")).getText());
	}

}
