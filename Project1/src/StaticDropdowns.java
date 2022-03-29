import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class StaticDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise");
		
		//Dropdown with SELECT tag are always static dropdown... Selenium Select class will have methods to handle select dropdown 
		WebElement dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select sel = new Select(dropdown);
		
		//Selection option 1
		sel.selectByVisibleText("AED");
		System.out.println(sel.getFirstSelectedOption().getText());
		
		//Selection option 2
		sel.selectByIndex(3);
		System.out.println(sel.getFirstSelectedOption().getText());
		
		//Selection option 3
		sel.selectByValue("INR");
		System.out.println(sel.getFirstSelectedOption().getText());
	}

}
