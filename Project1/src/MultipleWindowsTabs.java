import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleWindowsTabs {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		//Open new tab
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		//Get new tab ID and switch
		Set<String> handle = driver.getWindowHandles();
		Iterator<String> ite = handle.iterator();
		String ParentWin = ite.next();
		String ChildWin = ite.next();
		driver.switchTo().window(ChildWin);
		
		driver.get("https://rahulshettyacademy.com/");
		String CourseName = driver.findElements(By.xpath("//a[contains(@href,'https://courses.rahulshettyacademy.com/p/')]")).get(1).getText();
		
		driver.switchTo().window(ParentWin);
		driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys(CourseName);
		
		//Take screenshot
		File file = driver.findElement(By.xpath("//input[@name=\"name\"]")).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(file, new File("screenshot.png"));
		
		//Get Height & Weidth
		int hei = driver.findElement(By.xpath("//input[@name=\"name\"]")).getRect().getDimension().getHeight();
		int wdt = driver.findElement(By.xpath("//input[@name=\"name\"]")).getRect().getDimension().getWidth();
		
		System.out.println("height of name element is ::: "+hei);
		System.out.println("Width of name element is ::: "+wdt);
	}

}
