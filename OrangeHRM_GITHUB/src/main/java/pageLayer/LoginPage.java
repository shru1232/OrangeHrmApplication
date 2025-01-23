package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	private WebElement loginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(getDriver(), this);
	}

	
	public void loginFunctionality(String Username,String Pwd)
	{
		username.sendKeys(Username);
		password.sendKeys(Pwd);
	}
	
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}
}
