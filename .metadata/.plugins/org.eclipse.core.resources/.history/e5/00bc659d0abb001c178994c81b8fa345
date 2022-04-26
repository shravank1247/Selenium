import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(2000);
		int a = 0;
		String[] vegs = { "Cauliflower", "Cucumber", "Carrot", "Beans" };

		// Convert String array to List for easy comparison
		List<String> vegsList = Arrays.asList(vegs);

		// Get list of all products
		List<WebElement> vegProducts = driver.findElements(By.cssSelector("h4.product-name"));

		// Find size and extract product name
		for (int i = 0; i < vegProducts.size(); i++) 
		{
			String[] name = vegProducts.get(i).getText().split("-");
			String vegName = name[0].trim();

			// Compare extracted veg name from StringList
			if (vegsList.contains(vegName)) {

				// Click on "Add to cart" specific item

				// Add To Cart button changed to "Added" so keep some wait time or change the
				// locator independent of Text
				// driver.findElements(By.xpath("//button[text()='ADD TO
				// CART']")).get(i).click();
				// Thread.sleep(5000);
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				a++;
				System.out.println("added item number:::" +a);
				if (a == vegs.length)
				{
					System.out.println("Added all products");
					break;
				}
					
			}
		}
		
		driver.close();

	}

}
