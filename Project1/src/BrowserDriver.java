import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Chrome
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//Firefox
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();

//Microsoft Edge
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();

		driver.get("https://rahulshettyacademy.com");
		System.out.println("Title @@@@ === > "+ driver.getTitle());
		System.out.println("Current URL @@@@ === > "+  driver.getCurrentUrl());

		driver.close();

		//driver.quit();
	}
}
