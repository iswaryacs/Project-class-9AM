package org.airlinedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.base.BaseClass;

public class EnterDetailsTask3 extends BaseClass{
	public EnterDetailsTask3 () {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath=("//input[@id='inputName']"))
	private WebElement EnterName;
	@FindBy (xpath=("//input[@id='address']"))
	private WebElement Enteraddress;
	@FindBy (xpath=("//input[@id='city']"))
	private WebElement Entercity;
	@FindBy (xpath=("//input[@id='state']"))
	private WebElement Enterstate;
	@FindBy (xpath=("//input[@id='zipCode']"))
	private WebElement Enterzipcode;
	@FindBy (xpath=("//select[@id='cardType']"))
	private WebElement Entercardtype;
	@FindBy (xpath=("//input[@id='creditCardNumber']"))
	private WebElement Entercreditcardnumber;
	@FindBy (xpath=("//input[@id='creditCardMonth']"))
	private WebElement Entercreditcardmonth;
	@FindBy (xpath=("//input[@id='creditCardYear']"))
	private WebElement Entercreditcardyear;
	@FindBy (xpath=("//input[@id='nameOnCard']"))
	private WebElement Enternameoncard;
	@FindBy (xpath=("//input[@id='rememberMe']"))
	private WebElement EnterRememberMe;
	@FindBy (xpath=("//input[@type='submit']"))
	private WebElement btnsubmit;
	public WebElement getEnterName() {
		return EnterName;
	}
	public WebElement getEnteraddress() {
		return Enteraddress;
	}
	public WebElement getEntercity() {
		return Entercity;
	}
	public WebElement getEnterstate() {
		return Enterstate;
	}
	public WebElement getEnterzipcode() {
		return Enterzipcode;
	}
	public WebElement getEntercardtype() {
		return Entercardtype;
	}
	public WebElement getEntercreditcardnumber() {
		return Entercreditcardnumber;
	}
	public WebElement getEntercreditcardmonth() {
		return Entercreditcardmonth;
	}
	public WebElement getEntercreditcardyear() {
		return Entercreditcardyear;
	}
	public WebElement getEnternameoncard() {
		return Enternameoncard;
	}
	public WebElement getEnterRememberMe() {
		return EnterRememberMe;
	}
	public WebElement getBtnsubmit() {
		return btnsubmit;
	}
}
