package Annotations;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  @Test
  public void firsttest() {
	  System.out.println("this is first test : 1");
  }
  
  @Test
  public void secondtest() {
	  System.out.println("this is my second test : 2");
	  
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is my beforemethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is my aftermethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is my beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is my afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is my beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is my aftertest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is my beforesuit");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is my aftersuite");
	  
  }

}
