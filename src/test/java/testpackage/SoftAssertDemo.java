package testpackage;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.Base;

public class SoftAssertDemo extends Base{
	@Test
	
	public void softAssertTest() {
		
		
	SoftAssert softAssert = new SoftAssert();
	String actual = "abc";
	String expected = "cde";
	System.out.println("Before soft assert");
	softAssert.assertEquals(actual, expected);
	System.out.println("After soft assert");
	softAssert.assertTrue(5<2);
	softAssert.assertAll();
	
	
	
	}
	
	
	}


