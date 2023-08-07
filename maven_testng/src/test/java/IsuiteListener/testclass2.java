package IsuiteListener;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testclass2 {

	@AfterTest
	public void aftertest() {
		System.out.println("i am after test funcation from test2");
		
		
	}
	@BeforeTest
	
	public void befortest() {
		System.out.println("iam before test funcation from test1");
		
	}
	@Test
	public void test_pack1() {
		
		System.out.println("iam at the test funcation from test" );
		
		
		
		
	}
	
}
