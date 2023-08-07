package IsuiteListener;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testclass1 {
	
	
	
	@AfterTest
	public void aftertest() {
		
		System.out.println("i am after test funcation from testpack2");	
	}
	
	@BeforeTest
	public void beforetest() {
	System.out.println("iam before test funcation from testpack 1");
		
	}
	@Test
	
	public void test_pack() {
		
		System.out.println("i am test funcation from testpack1");
		
	}
	
	
	
	
}
