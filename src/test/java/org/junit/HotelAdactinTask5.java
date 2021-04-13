package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


public class HotelAdactinTask5 extends BaseClass{
	public HotelAdactinTask5 () {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath=("//input[@id='my_itinerary']"))
	private WebElement itinerary;
	
	
	@FindBy (xpath=("//input[@id='order_id_409013']"))
	private WebElement orderId;
	
	
	public WebElement getItinerary() {
		return itinerary;		
	}
	public WebElement getOrderId() {
		return orderId;
	}
}