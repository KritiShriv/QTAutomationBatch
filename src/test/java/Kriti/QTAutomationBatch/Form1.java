package Kriti.QTAutomationBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Form1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Form");
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Form")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("firstname")).sendKeys("Kriti");
		driver.findElement(By.id("lastname")).sendKeys("Shrivastava");
		driver.findElement(By.xpath("//input[@name='optradio']")).click();
		driver.findElement(By.xpath("//input[@value='dance']")).click();
		driver.findElement(By.xpath("//input[@value='read']")).click();
		WebElement ddown = driver.findElement(By.id("sel1"));
		Select dropdown = new Select(ddown);
		dropdown.selectByVisibleText("India");
		driver.findElement(By.id("datepicker")).sendKeys("09/07/1997");
		driver.findElement(By.id("phonenumber")).sendKeys("123456789");
		driver.findElement(By.id("username")).sendKeys("Kriti");
		driver.findElement(By.id("email")).sendKeys("Kriti.shrivastava@abc.com");
		
		WebElement Comment = driver.findElement(By.id("comment"));
		Comment.sendKeys("I live in New Delhi");
		String cmnt = Comment.getAttribute("value");
		System.out.println(cmnt);
		driver.findElement(By.id("pwd")).sendKeys("Kriti123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Form Submitted Successfully");
	}

}
