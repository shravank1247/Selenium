import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String date = "April-1-2023";
		String[] dateSplit = date.split("-");
		String month = dateSplit[0];
		String day = dateSplit[1];
		String year = dateSplit[2];
		String monthYear = month+" "+year;
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.cssSelector("input[name='travel_date']")).click();
		
		System.out.println(monthYear);
		//Navigate to required month + Year
//		String navMonth = driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']")).getText();
		while(!driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='datepicker-switch']")).getText().contains(monthYear))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days'] //th[@class='next']")).click();
			Thread.sleep(1000);
		}
		
		//Method-1
		//WebElement picker = driver.findElement(By.xpath("//table[contains(@class,' table-condensed')]/tbody"));
		//picker.findElement(By.cssSelector(".day")).getText();
		//picker.findElement(By.xpath("//td[text()='"+day+"']")).click();
		
		Thread.sleep(1000);
		//Method-2
		List<WebElement> alldates = driver.findElements(By.className("day"));
		for(int i=0; i<alldates.size();i++)
		{
			String st = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(st.equalsIgnoreCase(day))
			{
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
	}

}
