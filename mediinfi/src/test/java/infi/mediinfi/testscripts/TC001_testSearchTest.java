package infi.mediinfi.testscripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import infi.mediinfi.pagelibrary.Home;
import infi.mediinfi.testBase.TestBase;

public class TC001_testSearchTest extends TestBase {

	Home home;

	@BeforeClass
	public void setUP() throws IOException {
		init();
	}

	@Test
	public void testSearch() throws InterruptedException {
		home= new Home(driver);
		home.searchLocality();
		home.searchDoctor();
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}
}
