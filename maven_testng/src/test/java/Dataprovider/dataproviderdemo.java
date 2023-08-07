package Dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderdemo {

	

	@DataProvider(name="Dataprovide_Testdata")
	
	public Object[][]Datamethod(){
		
		
		return new Object[][] {{"value1"},{"test1"}};
		
	}
	
	@Test(dataProvider= "TestData", dataProviderClass = dataproviderdemo1.class)
	
	public void testcasedemo(String username, String password, String status) {
		
		
	//	System.out.println("data is passed form data provider :" +Values);
	
	
		System.out.println("passing user name and password");
		
		System.out.println("usernamedeatiles :" + username);
		System.out.println("userpassword : " + password);
		System.out.println("ststus :" + status);
	}
	
	
}
