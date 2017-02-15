package infi.mediinfi.pagelibrary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import infi.mediinfi.testBase.TestBase;

public class Home extends TestBase {
	WebDriver driver;

	By cityLocality = By.id("city-locality1");
	By doctorHospital = By.id("ip1_text1");

	public Home(WebDriver driver) {
		this.driver = driver;
	}

	public void searchLocality() {
		driver.findElement(cityLocality).sendKeys("AECS");
		driver.findElement(By.xpath(".//*[@id='autoCityResult1']/li/a")).click();

	}
 
	public void searchDoctor() throws InterruptedException {
		driver.findElement(doctorHospital).sendKeys("shai ");
		Thread.sleep(3000);
		List<WebElement> result = driver.findElements(By.xpath(".//*[@id='res_label2']"));
		for (WebElement a : result) {
			String test = a.getText().toUpperCase();
			System.out.println(test);
			Assert.assertTrue(test.contains("SHAI"));
		}
	}

}
