import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise_LinksCounts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Get count of all available links
		int i  = driver.findElements(By.tagName("a")).size();
		System.out.println("total links on page is ::"+i);
		
		//Get count of all links available in footer section
			//using parent child 
		int j  = driver.findElements(By.xpath("//div[@id='gf-BIG'] //a")).size();
		System.out.println("total footer link count is ::"+j);
		
		//limiting the driver scope to footer section
		WebElement footDriver  = driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		int k  = footDriver.findElements(By.tagName("a")).size();
		System.out.println("total footer link count is ::"+k);
		
		//limiting the driver scope to footer first column
		WebElement footerFirstClmnDriver  = footDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int l  = footerFirstClmnDriver.findElements(By.tagName("a")).size();
		System.out.println("total footer link count is ::"+l);
		
		//clicking on each links
		for(int a =0; a < footerFirstClmnDriver.findElements(By.tagName("a")).size();a++)
		{
			String clickOnLink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerFirstClmnDriver.findElements(By.tagName("a")).get(a).sendKeys(clickOnLink);
			Thread.sleep(2000);
		}
		
		//Getting each tab title by iteration 
		Set<String> winHandle = driver.getWindowHandles();
		Iterator<String> ite = winHandle.iterator();
		
		//Method-1
		/*for(int b=0; b< winHandle.size();b++)
		{
			driver.switchTo().window(ite.next());
			System.out.println("Iteration:: "+b+" title is"+driver.getTitle());
			driver.close();
		} */
		
		//Method-2
		while(ite.hasNext())
		{
			driver.switchTo().window(ite.next());
			System.out.println("Iteration title is"+driver.getTitle());
			//driver.close();
		}
				
		//Assert.assertEquals(footerFirstClmnDriver.findElements(By.tagName("a")).size(), winHandle.size());
		
		
		
		
		
	}

}