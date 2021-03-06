import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\STelukuntha\\OneDrive - Sensia Global\\Avocet\\Automation\\Selenium\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		//Switch to frames using frame using WebElelement
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		//Switch to frames using frame using index
		if(driver.findElements(By.tagName("iframe")).size() > 1)
			System.out.println("More than one frame is available");
		else
			driver.switchTo().frame(0);
		
		//Perform frame actions inside frames 
		System.out.println(driver.findElement(By.id("draggable")).getText());
		System.out.println("Before droping:: " +driver.findElement(By.id("droppable")).getText());
	
		Actions act = new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		System.out.println("After droping:: " +driver.findElement(By.id("droppable")).getText());
		Assert.assertEquals(driver.findElement(By.id("droppable")).getText(), "Dropped!");
		
		//to switch back from frames
		driver.switchTo().defaultContent();

	}

}
