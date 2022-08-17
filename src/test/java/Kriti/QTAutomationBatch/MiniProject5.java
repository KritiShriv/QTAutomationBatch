package Kriti.QTAutomationBatch;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MiniProject5 {
WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriverManager.chromedriver().setup();
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.google.com/");
	        List<WebElement> noOfLinks= driver.findElements(By.tagName("a")); // finding num of links 
	        int size= noOfLinks.size(); //calculating size
	        System.out.println(size);
	        for(WebElement linkName:noOfLinks ) {
	            System.out.println(linkName.getText()+" "+ linkName.getAttribute("href")); //get attribute 
	        
	        }
	        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Cognizant");
	        Thread.sleep(2000);
	        //List<WebElement> searchbox = driver.findElements(By.xpath("//div[@class='aajZCb']"));
	        List<WebElement> searchbox = driver.findElements(By.xpath("//li[@data-view-type='1']"));
	        int size1 = searchbox.size();
	        System.out.println(size1);
	        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(screenshot, new File("C:\\Users\\kriti.shrivastava\\Screenshot\\QTest5.jpg"));
	        
	        driver.close();
}
}
