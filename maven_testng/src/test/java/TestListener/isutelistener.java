package TestListener;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class isutelistener implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
	System.out.println("this is on startfunction");	
	}

	@Override
	public void onFinish(ISuite suite) {
	System.out.println("this is out finishfunction");
	}

	
	
	
	
	
}
