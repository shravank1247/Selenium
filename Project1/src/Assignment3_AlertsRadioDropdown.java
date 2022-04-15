import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3_AlertsRadioDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Explicit wait initilization
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");

		driver.findElement(By.xpath("//div[@class='form-check-inline']/label[2]/span[2]")).click();

		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("button#okayBtn")));
		System.out.println("Alert message is ::: " + driver.findElement(By.cssSelector("div.modal-body")).getText());
		driver.findElement(By.cssSelector("button#okayBtn")).click();

		WebElement dropdown = driver.findElement(By.cssSelector("select.form-control"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Consultant");
		System.out.println("Selected role is :::" + s.getFirstSelectedOption().getText());

		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.cssSelector("input#signInBtn")).click();

		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//a[text()='ProtoCommerce Home']")));
		w.until(ExpectedConditions.urlContains("shop"));

		System.out.println("Landing page loaded with text::: "
				+ driver.findElement(By.xpath("//a[text()='ProtoCommerce Home']")).getText());
		List<WebElement> names = driver.findElements(By.cssSelector("h4.card-title"));

		for (int i = 0; i < names.size(); i++) {
			System.out.println(
					"Item Added to cart is:: " + driver.findElements(By.cssSelector("h4.card-title")).get(i).getText());
			driver.findElements(By.xpath("//button[text()='Add ']")).get(i).click();
		}

		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText("( 4 )")));
		System.out.println(
				"Checkout count is ::: " + driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).getText());
		driver.findElement(By.cssSelector("a.nav-link.btn")).click();

	}

}
