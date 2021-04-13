package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HotelAdactinTask1 extends BaseClass {
	//public static WebDriver driver;
	public HotelAdactinTask1 () {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="username")
	private WebElement txtUserName;
	@FindBy (id="password")
	private WebElement txtPassword;
	@FindBy (name="login")
	private WebElement btnLogin;
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTxtPassword() {
		return txtPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
}

