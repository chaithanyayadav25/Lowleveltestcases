package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM1;
import com.training.pom.ProductPOM1;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ShopDropDown {

	private WebDriver driver;
	private LoginPOM1 LoginPOM1;
	private ProductPOM1 productPOM1;
	private static Properties properties;
	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		LoginPOM1 = new LoginPOM1(driver); 
		properties.getProperty("baseURL");
		new ScreenShot(driver); 
		// open the browser 
		driver.get("http://retail.upskills.in/"); 
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
		
//Test case	1---shop earrings and add to cart and remove from cart	
	}
	@Test
	public void validLoginTest() {
		
		LoginPOM1.clickshopicon();
		LoginPOM1.clickearringsicon();
		LoginPOM1.clickProductsSystemicon();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://retail.upskills.in/earrings/integer-vitae-iaculis-massaa");
		productPOM1 = new ProductPOM1(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		productPOM1.clickaddcartbuttonicon();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		productPOM1.clickViewCartIcon();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		productPOM1.clickRemoveCart();
		
		}
}
 
