package PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver){
	PageFactory.initElements(driver,this);
}
	// declaration
	@FindBy(id="Email")
private WebElement EmailTextField;
	
	@FindBy(id="Password")
	private WebElement passTextField;
	
	@FindBy(xpath="//button[@id='Login']")
	private WebElement LoginButton;
	public WebElement getEmailTextField() {
	return EmailTextField;
	}
	public WebElement getPassTextField() {
		return passTextField;
		}
	public WebElement getLoginButton() {
		return LoginButton;
		}
}
		