package Kriti.QTAutomationBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstSeleniumProgram {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		String Text = driver.findElement(By.id("p3")).getText();
		System.out.println(Text);
		WebElement username = driver.findElement(By.id("input1"));
		WebElement password = driver.findElement(By.id("input2"));
		
		driver.findElement(By.id("input1")).sendKeys("JAVA");
		driver.findElement(By.id("input2")).sendKeys("SELENIUM");
		
		String Uname1=username.getAttribute("value");
		System.out.println(Uname1);
		String Pwd1=password.getAttribute("value");
		System.out.println(Pwd1);
		
		username.clear();
		password.clear();
		
		username.sendKeys("selenium");
		String Uname2=username.getAttribute("value");
		System.out.println(Uname2);
		
		password.sendKeys("java");
		String Pwd2=password.getAttribute("value");
		System.out.println(Pwd2);
		
		
		
		
	}

}
