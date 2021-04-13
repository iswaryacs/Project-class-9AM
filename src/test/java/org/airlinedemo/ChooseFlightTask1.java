package org.airlinedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ChooseFlightTask1 extends BaseClass{
	public ChooseFlightTask1 () {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath=("//select[@name='fromPort']"))
	private WebElement FromPort;
	@FindBy (xpath=("//select[@name='toPort']"))
	private WebElement ToPort;
	@FindBy (xpath=("//input[@type='submit']"))
	private WebElement btnSubmit;
	public WebElement getFromPort() {
		return FromPort;
	}
	public WebElement getToPort() {
		return ToPort;
	}
	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	
}
