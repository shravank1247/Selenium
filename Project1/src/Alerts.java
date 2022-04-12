import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Alert popup
		driver.findElement(By.id("name")).sendKeys("Shravan");
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		System.out.println("Alert message is ::: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		// Confirm popup
		driver.findElement(By.id("name")).sendKeys("Shravan");
		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();
		System.out.println("Confirm message is ::: " + driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
