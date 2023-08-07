package maven_testng.maven_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class NewTest {
	
	// maven_testng.maven_testng.NewTest
	
  @Test

 public void f() {
	  System.out.println("this is my test area1");
	  
  }
  
  @Test
  
  public void g() {
	  System.out.println("this is my test area2");
  }
  
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("this is my precobdition area");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is my post condation");
  }
  
  @BeforeMethod
  public void beforementhod() {
	  System.out.println("i need a valid url");
  }
  @AfterMethod
  public void aftermethod() {
	  System.out.println("i close the url");
  }

}
