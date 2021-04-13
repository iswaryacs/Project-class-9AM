package org.airlinedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectFlightTask2 extends BaseClass{
	public SelectFlightTask2() {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath= ("(//input[@type='submit'])[3]"))
	private WebElement btnChooseThisFlight;
	public WebElement getBtnChooseThisFlight() {
		return btnChooseThisFlight;
	}
	
}
