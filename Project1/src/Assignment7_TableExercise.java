import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7_TableExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// print number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		System.out.println("number of rows are ::" + rows.size());

		// print number of columns
		List<WebElement> clmns = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
		System.out.println("number of rows are ::" + clmns.size());

		// Print 2nd row of table
		for (int i = 0; i < rows.size(); i++) 
		{
			if (i == 1) {
				String str = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr")).get(i).getText();
				System.out.println("Second rows table contents are::: " + str);
			}
		}
		
		//Method-2
		/*
		 List<WebElement> secondrow=driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		 
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
		*/
	}

}
