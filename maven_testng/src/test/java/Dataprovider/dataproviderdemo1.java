package Dataprovider;

import org.testng.annotations.DataProvider;

public class dataproviderdemo1 {
	
	
	
	@DataProvider(name="TestData")
	
	public Object[][]Datamethod(){
		
		
		return new Object[][] {{"Demouser1","password", "invalide"},{"demouser1","787878","vaild"}};		
		
	}
	
	

}
