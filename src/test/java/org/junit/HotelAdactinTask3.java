package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HotelAdactinTask3 extends BaseClass {
	public HotelAdactinTask3 () {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="radiobutton_0")
	private WebElement radiobutton;
	@FindBy (id="continue")
	private WebElement continuenext;
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getContinuenext() {
		return continuenext;
	}

}
