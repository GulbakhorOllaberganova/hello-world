package testpackage;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import base.Base;

public class ImplicitWaitDemo extends Base{
	@Test
	public void testImplicitlyWait() {
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	System.out.println("Test started");
	System.out.println("in the middle of the test");
	System.out.println("Ending test");
	
	}

}
