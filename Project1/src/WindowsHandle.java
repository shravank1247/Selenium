import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		
		Set<String> winHandle= driver.getWindowHandles();
		Iterator<String> ite = winHandle.iterator();
		String firstWindow = ite.next();
		String secondWindow = ite.next();
		driver.switchTo().window(secondWindow);
		
		String text = driver.findElement(By.cssSelector("p.im-para.red")).getText();
				
		System.out.println("Captured text from child windows is:::"+text);
		String emailId = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.close();
		driver.switchTo().window(firstWindow);
		driver.findElement(By.id("username")).sendKeys(emailId);
		
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.id("username")).getText(),"mentor@rahulshettyacademy.com");
		

	}

}
