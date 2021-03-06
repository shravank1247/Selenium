import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4_WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Declaring explicit wait
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Click Here']")));
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> itr = handle.iterator();
		String parent = itr.next();
		String child = itr.next();
		
		driver.switchTo().window(child);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='New Window']")));
		System.out.println("Child Windows: "+driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
		driver.close();
		
		driver.switchTo().window(parent);
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Opening a new window']")));
		System.out.println("Child Windows: "+driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
		driver.close();
		
		

	}

}
