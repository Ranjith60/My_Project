package TestListener;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(TestListener.TestListener2.class)

public class TestListener1 {

	
	@Test
	
	public void test_sucess() {
		System.out.println("this is my success scenario test");
		
	}
	@Test
	
	public void test_failure() {
		System.out.println("this is my failure scenario test");
		AssertJUnit.assertTrue(false);
		
	}
	
	@Test
	
	public void test_skipped() {
		throw new SkipException("this is my failure scenarion test");
		
		
		
	}
	
	
	
	
	
}
