import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		System.out.println("before increment count is ::::"+driver.findElement(By.xpath("//div[text()=\"1 Adult\"]")).getText());
		driver.findElement(By.xpath("//div[text()=\"1 Adult\"]")).click();
		for(int i=1;i<4;i++)
		{
			driver.findElement(By.cssSelector("div[data-testid='Adult-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.cssSelector("div[data-testid='home-page-travellers-done-cta']")).click();
		Thread.sleep(3000);
		System.out.println("after increment count is ::::"+driver.findElement(By.xpath("//div[text()=\"4 Adults\"]")).getText());
	}

}
