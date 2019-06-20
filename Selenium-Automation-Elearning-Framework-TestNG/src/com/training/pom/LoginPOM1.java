/*
 * package com.training.pom;
 * 
 * import org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement;
 * import org.openqa.selenium.support.FindBy; import
 * org.openqa.selenium.support.PageFactory;
 * 
 * public class LoginPOM1 { public LoginPOM1(WebDriver driver) {
 * PageFactory.initElements(driver, this); }
 * 
 * @FindBy(xpath="/*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a/span/span/i") private
 * WebElement MyAccountIcon;
 * 
 * @FindBy(xpath ="/*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a") private WebElement
 * LoginDropDown;
 * 
 * @FindBy(id="input-username") private WebElement userName;
 * 
 * @FindBy(id="input-password") private WebElement password;
 * 
 * @FindBy(xpath="//*[@class='btn btn-primary']") private WebElement loginBtn;
 * 
 * @FindBy(xpath="//*[@id=\"menu_all_categories_Menu_VIfWm2LT_Gd1U2\"]/a/span")
 * private WebElement shopicon;
 * 
 * @FindBy(xpath=
 * "//*[@id=\"menu_all_categories_Menu_VIfWm2LT_Gd1U2\"]/ul/li/a/span") private
 * WebElement earrings;
 * 
 * @FindBy(xpath=
 * "//*[@id=\"ProductsSystem_QQI8r357\"]/div[1]/div[2]/div/div[3]/div/div/div[1]/h4/a")
 * private WebElement ProductsSystem;
 * 
 * @FindBy(xpath="//*[@id=\"button-cart\"]") private WebElement addcartbutton;
 * 
 * 
 * 
 * 
 * 
 * public void ClickLoginDropDown(String LoginDropDown) {
 * this.LoginDropDown.click();
 * 
 * } public void sendUserName(String userName) { this.userName.clear();
 * this.userName.sendKeys(userName); }
 * 
 * public void sendPassword(String password) { this.password.clear();
 * this.password.sendKeys(password); }
 * 
 * 
 * public void clickLoginBtn() { this.loginBtn.click(); } public void
 * clickshopicon() { this.shopicon.click(); }
 * 
 * 
 * public void clickearringsicon() { this.earrings.click(); } public void
 * clickProductsSystemicon() { this.ProductsSystem.click(); } public void
 * clickaddcartbuttonicon() { System.out.println("it is cmh gere");
 * this.addcartbutton.click(); }
 * 
 * }addcartbutton
 */
package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPOM1 {
public LoginPOM1(WebDriver driver) {
PageFactory.initElements(driver, this);
}
@FindBy(xpath="/*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a/span/span/i")
private WebElement MyAccountIcon; 
@FindBy(xpath ="/*[@id=\"Menu_Wmt3OMY3\"]/nav/ul/li[2]/a")
private WebElement LoginDropDown; 

@FindBy(id="input-username")
private WebElement userName; 

@FindBy(id="input-password")
private WebElement password;

@FindBy(xpath="//*[@class='btn btn-primary']")
private WebElement loginBtn; 

@FindBy(xpath="//*[@id=\"menu_all_categories_Menu_VIfWm2LT_Gd1U2\"]/a/span")
private WebElement shopicon; 
@FindBy(xpath="//*[@id=\"menu_all_categories_Menu_VIfWm2LT_Gd1U2\"]/ul/li/a/span")
private WebElement earrings; 
@FindBy(xpath="//*[@id=\"ProductsSystem_QQI8r357\"]/div[1]/div[2]/div/div[3]/div/div/div[1]/h4/a")
private WebElement ProductsSystem; 
@FindBy(linkText = "Add to Cart")
private WebElement addcartbutton;




/*
* public void ClickLoginDropDown(String LoginDropDown) {
* this.LoginDropDown.click();
* 
* } public void sendUserName(String userName) { this.userName.clear();
* this.userName.sendKeys(userName); }
* 
* public void sendPassword(String password) { this.password.clear();
* this.password.sendKeys(password); }
*/

public void clickLoginBtn() {
this.loginBtn.click(); 
}
public void clickshopicon() {
this.shopicon.click(); 
}


public void clickearringsicon() {
this.earrings.click(); 
}
public void clickProductsSystemicon() {
this.ProductsSystem.click(); 
}
public void clickaddcartbuttonicon() {
System.out.println("it is cmg here");
this.addcartbutton.click(); 
}

}