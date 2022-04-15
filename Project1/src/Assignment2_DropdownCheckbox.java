import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2_DropdownCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Check uncheck and verify checkboxes with assertions
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// Name - Textbox
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).click();
		driver.findElement(By.cssSelector("div[class='form-group'] input[name='name']")).sendKeys("Shravan Kumar");

		// Email - Textbox
		driver.findElement(By.xpath("//input[@name='email']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ShravanKumar@test.com");

		// Password - Textbox
		driver.findElement(By.id("exampleInputPassword1")).click();
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("ShravanKumar");

		// Checkbox
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();

		// Gender - dropdown
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		driver.findElement(By.xpath("//input[@id='inlineRadio2']")).click();

		// DOB - DatePicker
		driver.findElement(By.name("bday")).sendKeys("02/02/1992");

		// Submit
		driver.findElement(By.cssSelector(".btn-success")).click();

		Thread.sleep(2000);

		// Success Alert
		String str = driver.findElement(By.cssSelector(".alert-success")).getText();
		str.contains("Success! The Form has been submitted successfully!.");
		System.out.println("Mesage is ::::" + str);
		// Assert.assertEquals(driver.findElement(By.cssSelector(".alert-success")).getText(),"Success!
		// The Form has been submitted successfully!.");

	}

}
