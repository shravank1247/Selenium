import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StreamWebTableFilter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.id("search-field")).sendKeys("ea");
		Thread.sleep(2000);
		List<WebElement> actTable = driver.findElements(By.xpath("//tr/td[1]"));
		
		List<WebElement> filteredList = actTable.stream().filter(s->s.getText().contains("ea")).collect(Collectors.toList());

		//Compare actual list size & filtered list size
		if(actTable.size()==filteredList.size())
		{
			System.out.println("Filtered list and actual list matched");
		}
	}

}
