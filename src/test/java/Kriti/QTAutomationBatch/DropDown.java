package Kriti.QTAutomationBatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://theautomationzone.blogspot.com/2020/07/mix-of-basic-webelements.html");
		WebElement element=driver.findElement(By.id("mySelect"));
        Select select=new Select(element);
        //1.  select by index
        //select.selectByValue("pineapple");
        //2. select by value
        //select.selectByVisibleText("Banana");
        select.selectByIndex(1);

        //3.  select by visibletext
        
     // to get the list of options in dropdown
        List<WebElement> List = select.getOptions();
        int size = List.size();
        for(int i =0; i < size; i++) {
        	String value = List.get(i).getText();
        	System.out.println(value);
        }
        

	}

}
