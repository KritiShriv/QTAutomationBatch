package Kriti.QTAutomationBatch;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGdayone {
	
	@Test
	void Multiplication(){
		System.out.println("I am in multiplication method");
		
	}
	@Test
	void Division(){
		System.out.println("I am in division method");
		
	}
	@BeforeMethod
	
	void before() {
		System.out.println("This is before method");
	}
	@AfterMethod
	
	void after() {
		System.out.println("This is after method");
	}
	@BeforeClass
	void beforeClass() {
		System.out.println("This is before class");
	}
	@AfterClass
	void afterClass() {
		System.out.println("This is after class");
	}
}
