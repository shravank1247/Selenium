import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//XPath locator using sibling :: Parent to child traverse
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
		System.out.println("CLicked button text is ::: "+driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		//XPath locator using sibling :: child to parent traverse
		System.out.println("CLicked button text is ::: "+driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		
		driver.close();
	}

}
