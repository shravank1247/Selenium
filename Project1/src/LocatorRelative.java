import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;

public class LocatorRelative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement ele = driver.findElement(By.xpath("//input[@name=\"name\"]"));
		
		//Above relative locator
		String above = driver.findElement(with(By.tagName("label")).above(ele)).getText();
		System.out.println(above);
		//Below relative locator
		String below = driver.findElement(with(By.tagName("label")).below(ele)).getText();
		System.out.println(below);
		//Left relative locator
		String left = driver.findElement(with(By.tagName("label")).toLeftOf(ele)).getText();
		System.out.println(left);
		//Right relative locator
		String right = driver.findElement(with(By.tagName("label")).toRightOf(ele)).getText();
		System.out.println(right);
		
		
	}

}
