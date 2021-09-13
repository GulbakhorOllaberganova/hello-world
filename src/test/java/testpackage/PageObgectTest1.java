package testpackage;



import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import library.ChipoAirPage;

public class PageObgectTest1 {
	private WebDriver driver = null;
	private String url = "https://www.cheapoair.com/";
	@BeforeMethod	

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Webdriver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setPosition(new Point(-1800, 0));
		driver.manage().window().maximize();
	}
	@Test
	public void testDrpDown() throws InterruptedException {
		ChipoAirPage chip = new ChipoAirPage(driver);
		driver.get(url);
	
		chip.clearFromBox();
	
		chip.clickOnFromBox();
	
		chip.insertFromDest("tas");
		Thread.sleep(1000);
	
		chip.pressEnterDest();
	
		chip.insertToDest("new");
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
