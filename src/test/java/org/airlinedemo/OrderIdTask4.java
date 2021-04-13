package org.airlinedemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class OrderIdTask4 extends BaseClass{
	public OrderIdTask4 () {
		PageFactory.initElements(driver, this);
	}
	@FindBy (xpath=("//table[@class='table']//tr[1]//td[2]"))
	private WebElement orderId;
	public WebElement getOrderId() {
		return orderId;
	}
	
}
