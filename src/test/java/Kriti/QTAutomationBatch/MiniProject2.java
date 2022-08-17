package Kriti.QTAutomationBatch;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MiniProject2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in ");
		
		WebElement alrt = driver.findElement(By.xpath("//button[@aria-label='Confirmation. Get your favourite food at your train seat through <a class=\"txt-msg-info\" target=\"_blank\" href=\"https://www.ecatering.irctc.co.in/\">e-Catering</a> available at selected stations.<br/><br/>COVID 19 Alert:<br/><br/><i class=\"fa fa-circle\" ></i> All passengers are advised to wear face covers/masks at the entry/exit and during travel.<br/><br/><i class=\"fa fa-circle\" ></i> All passengers are advised that on arrival at their destination, the travelling passenger shall follow the Covid protocol/guidelines issued by Ministry of Home affairs, Ministry of Health and Family Welfare and concerned State/UTs on the subject from time to time.<br/><br/><i class=\"fa fa-circle\" ></i><a class=\"txt-msg-info\"target=\"_blank\"href=\"http://contents.irctc.co.in/en/CovidVaccinationInfoEng.pdf\"> Information on Covid 19 Vaccination Programme</a>. Press OK to confirm']"));
		alrt.click();
		Thread.sleep(1000);
		//System.out.println("Alert closed successfully");
		WebElement fromddown = driver.findElement(By.xpath("//input[@class='ng-tns-c57-8 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
		fromddown.sendKeys("Hyd");
		WebElement d1 = driver.findElement(By.xpath("//span[normalize-space()='HYDERABAD DECAN - HYB']"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(d1).build().perform();
		d1.click();
		Thread.sleep(1000);
		//System.out.println(" successfully");
		WebElement toddown = driver.findElement(By.xpath("//input[@class='ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
		toddown.sendKeys("Pune");
		WebElement d2 = driver.findElement(By.xpath("//span[normalize-space()='PUNE JN - PUNE']"));
		Actions action2 = new Actions(driver);
		action1.moveToElement(d2).build().perform();
		d2.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='ng-tns-c58-10 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='12']")).click();
		Thread.sleep(1000);
		WebElement Selection = driver.findElement(By.xpath("//div[@class='ui-dropdown-trigger ui-state-default ui-corner-right ng-tns-c65-11']"));
		Selection.click();
		
		//Selection.sendKeys("SL");
		WebElement d3 = driver.findElement(By.xpath("//li[@aria-label='Sleeper (SL)']"));
		Actions action3 = new Actions(driver);
		action3.moveToElement(d3).build().perform();
		d3.click();
		
		WebElement checkBox=driver.findElement(By.xpath("//label[@for='concessionBooking']"));
        checkBox.click();
        WebElement msgbox = driver.findElement(By.xpath("//span[@class='ui-button-text ui-clickable']"));
        msgbox.click();
        WebElement Searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
        Searchbtn.click();
        
        //WebElement numoftrains =  driver.findElement(By.xpath("//span[contains(text(),'4 Results for')]"));
        //System.out.println("numoftrains.getText()");
       Thread.sleep(1000);
        WebElement StartJny = driver.findElement(By.xpath("//input[@class='ng-tns-c57-27 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
        String startjn = StartJny.getAttribute("value");
        System.out.println(startjn);
   // "//input[@class='ng-tns-c57-27 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']")
        WebElement EndJny = driver.findElement(By.xpath("//input[@class='ng-tns-c57-28 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted']"));
        String endjn = EndJny.getAttribute("value");
        System.out.println(endjn);
        
        WebElement Date = driver.findElement(By.xpath("//input[@class='ng-tns-c58-29 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted']"));
        String date1 = Date.getAttribute("value");
        System.out.println(date1);
        
        //Thread.sleep(1000);
        
       List<WebElement> data = driver.findElements(By.xpath("//div[@class='col-sm-5 col-xs-11 train-heading']"));
       int data1 = data.size();
        System.out.println("Number of Trains Available : " +data1);
        
        WebElement Trn1 = driver.findElement(By.xpath("//strong[normalize-space()='HUSSAIN SAGAR (12702)']"));
        String Tn1 = Trn1.getText();
        System.out.println(Tn1);
        
        WebElement Trn2 = driver.findElement(By.xpath("//strong[normalize-space()='VSKP LTT EXPRES (18519)']"));
        String Tn2 = Trn2.getText();
        System.out.println(Tn2);
        
        WebElement Trn3 = driver.findElement(By.xpath("//strong[normalize-space()='MUMBAI EXP (17032)']"));
        String Tn3 = Trn3.getText();
        System.out.println(Tn3);
        
        WebElement Trn4 = driver.findElement(By.xpath("//strong[normalize-space()='KONARK EXPRESS (11020)']"));
        String Tn4 = Trn4.getText();
        System.out.println(Tn4);
        //alert.accept();
        
        
        File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("C:\\Users\\kriti.shrivastava\\Screenshot\\QTest2.jpg"));
        
        driver.close();
	}
	
}
