package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HotelAdactinTask2 extends BaseClass {
	//public static WebDriver driver;
	public HotelAdactinTask2 () {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="location")
	private WebElement getlocation;
	@FindBy (id="hotels")
	private WebElement gethotels;
	@FindBy (name="room_type")
	private WebElement getroomtype;
	@FindBy (id="room_nos")
	private WebElement getroomnos;
	@FindBy (name="datepick_in")
	private WebElement datepickin;
	@FindBy (name="datepick_out")
	private WebElement datepickout;
	@FindBy (id="adult_room")
	private WebElement adultroom;
	@FindBy (name="child_room")
	private WebElement childroom;
	@FindBy (id="Submit")
	private WebElement submit;
	public WebElement getGetlocation() {
		return getlocation;
	}
	public WebElement getGethotels() {
		return gethotels;
	}
	public WebElement getGetroomtype() {
		return getroomtype;
	}
	public WebElement getGetroomnos() {
		return getroomnos;
	}
	public WebElement getDatepickin() {
		return datepickin;
	}
	public WebElement getDatepickout() {
		return datepickout;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildroom() {
		return childroom;
	}
	public WebElement getSubmit() {
		return submit;
	}
		
}
