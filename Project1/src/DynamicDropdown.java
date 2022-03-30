import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//...1... Xpath Indexing

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		/*
		//Click on FROM dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//li/a[@value='AMD']")).click();
		Thread.sleep(2000L);
		
		//Select TO from dropdown which opens by itself --In some cases Both To and From contains same values the indexing used in xpath
		driver.findElement(By.xpath("(//li/a[@value=\"ATQ\"])[2]")).click();
		*/
		
		//...2... Xpath parent child
		
		//Click on FROM dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("(//td[@class='mapbg'])[1] //li/a[@value='AMD']")).click();
		Thread.sleep(2000L);
		
		//Select TO from dropdown which opens by itself --In some cases Both To and From contains same values then Parent-Child used in xpath
		driver.findElement(By.xpath("(//td[@class='mapbg'])[2] //li/a[@value='ATQ']")).click();
		
	}

}
