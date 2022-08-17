package Kriti.QTAutomationBatch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*driver.get("http://www.uitestpractice.com/Students/Switchto");
		driver.manage().window().maximize();
		
		//Handling Alert
		driver.findElement(By.id("alert")).click(); // clicking on the alert button
		
		Alert alert = driver.switchTo().alert(); //switching to alert
		String alertmsg = alert.getText(); // getting the alert pop up text
		
		System.out.println(alertmsg); // printinging the alert message
		Thread.sleep(4000);
		alert.accept(); //clicking on OK button*/
		
		//Double Click
		/*driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement DbClkBtn = driver.findElement(By.name("dblClick"));
		Actions action = new Actions(driver);
		action.doubleClick(DbClkBtn).build().perform();
		System.out.println("Double click performed successfully");
		
		Alert alert = driver.switchTo().alert(); //switching to alert
		Thread.sleep(2000);
		alert.accept(); //clicking on OK button
		driver.close();
		*/
		//Drag and Drop
		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement DragWindow = driver.findElement(By.id("draggable"));
		WebElement DropWindow = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(DragWindow, DropWindow).build().perform();
		Thread.sleep(1000);
		System.out.println("Drag and Drop performed successfully");
		
		
	}

}
