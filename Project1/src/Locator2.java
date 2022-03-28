import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locator2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String name = "shravan";
		String password = getPassword(driver);
		//Global Implicit wait will wait till the obj available or the given timeout - Applicable for all lines
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);

		//CssSelector with regex match
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password);

		driver.findElement(By.id("chkboxOne")).click();

		//Xpath with regex match
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		Thread.sleep(1000);
		
		//Use of TagName
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		//Assertion on successful login
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+",");
		
		//Xpath using button text
		driver.findElement(By.xpath("//*[text()='Log Out']")).click(); //OR
		//driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	}

	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println("New Password is @@@@@ " + driver.findElement(By.cssSelector("form p")).getText());
		
		  String s= driver.findElement(By.cssSelector("form p")).getText();
		  System.out.println("............"+s);
		  String[] st = s.split("'"); 
		  String str = st[1].split("'")[0]; 
		  //st = st[1].split("'")[0]; above statement can be directly written to fetch 0th string
		  System.out.println("password is reset to .........."+str);
		  Thread.sleep(2000); 
		  return str;
	
	}
	
}
