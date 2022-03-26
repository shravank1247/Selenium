import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Global Implicit wait will wait till the obj available or the given timeout - Applicable for all lines
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		
		//ID selector
		driver.findElement(By.id("inputUsername")).sendKeys("shravan");
		
		//Name selector
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacade");
		
		//ClassName selector
		driver.findElement(By.className("signInBtn")).click();
		
		//CSS Selector Syntax = tagname.attributeValue or tagname[attribute='value']
		String str = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println("Error message upon login is @@@@@@" +str );
		
		//LinkText Selector
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//XPath selector Syntax = //Tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shravan");
		
		//XPath Position selector :::: Syntax = //Tagname[@attribute='value'][index]
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("shravan@gamil.com");
		
		//CssSelector Position based locator :::: Syntax = Tagname[attribute='value']:nth-child[index]
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("test@test.com");
		
		//XPath selector with full path
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("0123456789");
		
		Thread.sleep(1000);
		//CSSselector locator with partial search when attributes are unique
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		System.out.println("New Password is @@@@@ " + driver.findElement(By.cssSelector("form p")).getText());
		
		
		
		/*
		 * if(driver.findElement(By.className("logout-btn")).isDisplayed())
		 * System.out.print("@@@@@@@@@@@ ---------  Login Success"); else {
		 * System.out.print("@@@@@@@@@@@ ---------   Login Failed");
		 * 
		 * //CSS Selector Syntax = tagname.attributeValue String str1 =
		 * driver.findElement(By.cssSelector("p.error")).getText();
		 * System.out.println("Error message upon login is @@@@@@" +str1 ); }
		 */
			
		
		driver.close();

	}

}
