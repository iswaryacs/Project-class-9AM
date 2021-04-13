package org.junit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HotelAdactinTask4 extends BaseClass{
	public HotelAdactinTask4 () {
		PageFactory.initElements(driver, this);
	}
	@FindBy (id="first_name")
	private WebElement txtfirstName;
	@FindBy (id="last_name")
	private WebElement txtlastName;
	@FindBy (name="address")
	private WebElement txtbillingAddress;
	@FindBy (name="cc_num")
	private WebElement txtcreditCardNo;
	@FindBy (id="cc_type")
	private WebElement creditCardType;
	@FindBy (id="cc_exp_month")
	private WebElement credircardMonth;
	@FindBy (id="cc_exp_year")
	private WebElement creditCardExpiryYear;
	@FindBy (id="cc_cvv")
	private WebElement txtcvvNumber;
	@FindBy (id="book_now")
	private WebElement bookNow;
	public WebElement getTxtfirstName() {
		return txtfirstName;
	}
	public WebElement getTxtlastName() {
		return txtlastName;
	}
	public WebElement getTxtbillingAddress() {
		return txtbillingAddress;
	}
	public WebElement getTxtcreditCardNo() {
		return txtcreditCardNo;
	}
	public WebElement getCreditCardType() {
		return creditCardType;
	}
	public WebElement getCredircardMonth() {
		return credircardMonth;
	}
	public WebElement getCreditCardExpiryYear() {
		return creditCardExpiryYear;
	}
	public WebElement getTxtcvvNumber() {
		return txtcvvNumber;
	}
	public WebElement getBookNow() {
		return bookNow;
	}
	
}
