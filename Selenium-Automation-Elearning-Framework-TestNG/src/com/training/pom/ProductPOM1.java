//package com.training.pom;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class ProductPOM1 {
//	
//	public ProductPOM1(WebDriver driver) {
//		PageFactory.initElements(driver, this);
//	}
//	
//	@FindBy(xpath="//*[@id=\"button-cart\"]")
//	//*[@id="button-cart"]
//	private WebElement addcartbutton;
//	
//	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li/h3/a/i")
//	private WebElement viewCartButton;
//	
//	
//	
//
//
//	
//	public void clickaddcartbuttonicon() {
//		System.out.println("it is cmh gere"+ this.addcartbutton);
//		this.addcartbutton.click();
//	}
//
//	public void clickViewCartIcon() {
//		// TODO Auto-generated method stub
//		this.viewCartButton.click();
//	}
//}

package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPOM1 {

	public ProductPOM1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css="#button-cart")
	//*[@id="button-cart"]
	private WebElement addcartbutton;

	@FindBy(xpath = "//*[@id=\"cart\"]/ul/li/h3/a/i")
	private WebElement viewCartButton;

	@FindBy(className = "fa fa-times-circle")
	private WebElement removeFromCart;





	public void clickaddcartbuttonicon() {
		System.out.println("it is cmh gere"+ this.addcartbutton);
		this.addcartbutton.click();
	}

	public void clickViewCartIcon() {
		// TODO Auto-generated method stub
		this.viewCartButton.click();
	}
	
	public void clickRemoveCart() {
		this.removeFromCart.click();
	}
}
