package Kriti.QTAutomationBatch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//To get text of alert and click OK
		driver.get("http://www.uitestpractice.com/students/switchto");
		driver.manage().window().maximize();
		driver.findElement(By.id("alert")).click();
		Alert alert = driver.switchTo().alert();
		
		String alertmsg = alert.getText();
		System.out.println(alertmsg);
		Thread.sleep(4000);
		alert.accept();
		
		//to double click the element
		driver.get("http://www.uitestpractice.com/Students/Actions");
		Thread.sleep(2000);
		WebElement DbClk = driver.findElement(By.name("dblClick"));
		Actions action = new Actions(driver);
		action.doubleClick(DbClk).build().perform();
		System.out.println("doubleclicked");
		
		

	}

}
