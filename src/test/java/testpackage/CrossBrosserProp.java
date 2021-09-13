package testpackage;
import org.testng.annotations.Test;

import base.Base;
import library.ChipoAirPage;

public class CrossBrosserProp extends Base{
	
	@Test
	public void testDrpDown() throws InterruptedException {
		ChipoAirPage chip = new ChipoAirPage(driver);
		driver.get(url);
	
		chip.clearFromBox();
	
		chip.clickOnFromBox();
	
		chip.insertFromDest(fromDest);
		Thread.sleep(1000);
	
		chip.pressEnterDest();
	
		chip.insertToDest(toDest);
		Thread.sleep(1000);
		
		chip.chooseOptionNumToDest(3);
	
		chip.pressEnterToDest();
		
		 Thread.sleep(1000);
		  
		 chip.selectCurDayFromDate();
		    Thread.sleep(1000);
		 chip.select7dayLaterToDate();
		    
		 chip.clickTravelerBtn();
		 Thread.sleep(1000);
		  chip.addAdults(1); 
		   chip.addChild(1); 
		   Thread.sleep(1000);
		    chip.selectAge("4");
		    chip.selectBusinessClass();
		    chip.clickDoneBtn();
		    chip.clickSearchFlightsBtn();
		    
		   

	}
}
