package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;

public class HardAssertDemo extends Base {
	@Test
	public void testHardAssert() {
		driver.get("http://automationpractice.com/index.php");
		WebElement signInBtn = driver.findElement(By.xpath("//a[@class='login']"));
		String signInBtnTxt = signInBtn.getText();
		Assert.assertEquals(signInBtnTxt, "Sign in");
		
	}

}
