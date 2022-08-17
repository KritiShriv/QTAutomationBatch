package Kriti.QTAutomationBatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MiniProject1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println(title);
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("mobile smartphones under 30000");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement sortby=driver.findElement(By.id("s-result-sort-select"));
	    Select select= new Select(sortby);
	    List<WebElement> listofoption = select.getOptions();
	    int count=listofoption.size();
	    System.out.println(count);
        select.selectByVisibleText("Newest Arrivals");
		
        WebElement validateText= driver.findElement(By.xpath("//span[text()='Newest Arrivals']"));
        System.out.println(validateText.getText());
        String validateTextFieldContent= validateText.getText();
        Assert.assertEquals(validateTextFieldContent, "Newest Arrivals");
        System.out.println("Assertion successful");
        driver.close();
		
	}

}
