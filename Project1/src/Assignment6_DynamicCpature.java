import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Assignment6_DynamicCpature {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String SelectedChkbxName="";
		
		//Select Checkbox
		driver.findElement(By.id("checkBoxOption3")).click();
		if(driver.findElement(By.cssSelector("label[for='honda'] input")).isSelected())
			SelectedChkbxName = driver.findElement(By.cssSelector("label[for='honda']")).getText();
		System.out.println(SelectedChkbxName);
		
		//Select from dropdown
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(SelectedChkbxName);

		//Textbox
		driver.findElement(By.id("name")).sendKeys(SelectedChkbxName);

		//Alert
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		
		//Assertion
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		if(text.contains(SelectedChkbxName))
			System.out.println("Success");
		else
			System.out.println("Failed");
	
	}

}
