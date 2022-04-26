import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StreamWebTableSorting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.xpath("//th[contains(@aria-label,\"Veg/fruit name\")]")).click();
		Thread.sleep(2000);
		List<WebElement> actTable = driver.findElements(By.xpath("//tr/td[1]"));
		
		
		//Method-1 - Converting Webelement list to string list
		/*
	 	List<String> newList = new ArrayList<String>();
		for(int i = 0; i < actTable.size(); ++i)
		{
			newList.add(actTable.get(i).getText());
		}
		*/
		
		//Method-2 - Converting Webelement list to string list
		List<String> originalList = actTable.stream().map(s->s.getText()).collect(Collectors.toList());
		
		List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());
		for(int i=0; i<actTable.size(); i++)
		{
			System.out.println("Actual:: "+originalList.get(i)+" --- Expected :: "+sortedList.get(i));
			//Assert.assertEquals(originalList.get(i),sortedList.get(i)); //Error if testng assert
		}
		

	}

}
