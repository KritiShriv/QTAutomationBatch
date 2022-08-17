package Kriti.QTAutomationBatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTitle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043598!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=EAIaIQobChMIvsf2l4KW-QIV15JmAh3n5gLuEAAYASAAEgKYYfD_BwE");
		String Title = driver.getTitle();
		System.out.println(Title);

	}

}
