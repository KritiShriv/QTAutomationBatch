package Kriti.QTAutomationBatch;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MiniProject4 {
 WebDriver d;
	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver d=new ChromeDriver();
        d.manage().window().maximize();
        d.get("https://www.trivago.in");
        d.findElement(By.xpath("//label[text()='Hotel']")).click(); // clicking on hotel tab
        d.findElement(By.xpath("//input[@type='search']")).sendKeys("Mumbai"); // searching for Mumbai 
        d.findElement(By.xpath("//button[@data-testid='calendar-checkin']")).click(); // selecting check in 
      //  d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        d.findElement(By.xpath("//span[text()='13'][1]")).click(); // selecting date
      //  d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        d.findElement(By.xpath("//span[text()='17'][1]")).click(); //selecting date
        d.findElement(By.xpath("//span[text()='2 Guests']")).click();
        Thread.sleep(2000);
        d.findElement(By.xpath("//input[@type='search']")).sendKeys("Mumbai");
        d.findElement(By.xpath("//button[@type='submit'][1]")).click();
        
        Thread.sleep(2000);
         Select s = new Select(d.findElement(By.id("sorting-selector")));
         Thread.sleep(10000);
         WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(4));
         wait.until(ExpectedConditions.elementToBeClickable(By.id("sorting-selector")));
            s.selectByVisibleText("Rating only");
            Thread.sleep(8000);
            List<WebElement> e = d.findElements(By.xpath("//button[@data-testid='item-name']//span[@itemprop='name']"));
          for(WebElement elements:e)
          {
              System.out.println(elements.getText());
              
          }
          List<WebElement> e2 = d.findElements(By.xpath("//span[@itemprop='ratingValue']"));
          for(WebElement elements2:e2)
          {
              System.out.println("The Rating value of the hotels in descending order is:::"+elements2.getText());
              
          }
          List<WebElement> e3 = d.findElements(By.xpath("//div[@class='flex flex-col justify-between']"));
          for(WebElement elements3:e3)
          {
              System.out.println("The rent/cost per day of the hotels is:::"+elements3.getText());
              
          }
    
 



}

}
