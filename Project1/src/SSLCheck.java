import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class SSLCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Set chrome browser behaviour using ChromeOptions class to accept bad ssl
		ChromeOptions op = new ChromeOptions();
		//op.setAcceptInsecureCerts(true);  // it seems like deprecated so use below if works
		op.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		
		//object is passed to ChromeDriver class
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		

	}

}
