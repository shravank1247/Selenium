	import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;

		public class ActionClass {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();

				driver.get("https://www.amazon.in/");
				WebElement moveObj = driver.findElement(By.id("nav-link-accountList-nav-line-1")); 
				
				//Actions class declaration
				Actions act = new Actions(driver);
				//Mouse hover
				act.moveToElement(moveObj).build().perform();
				//Click on textbox, enter in caps and select
				act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("test").doubleClick().build().perform();
				//open context menu
				act.moveToElement(moveObj).contextClick().build().perform();
			}

		}