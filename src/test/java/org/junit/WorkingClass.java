package org.junit;

import java.io.IOException;

import com.base.BaseClass;


public class WorkingClass extends BaseClass {
	public static void main(String[] args) throws InterruptedException, IOException {
		getDriver();
		loadUrl("http://adactinhotelapp.com/");
		maximize();
		HotelAdactinTask1 ah1= new HotelAdactinTask1();
		type(ah1.getTxtUserName(),"reach2ishu03");
		type(ah1.getTxtPassword(),"vaishali");
		Click(ah1.getBtnLogin());
		HotelAdactinTask2 ah2= new HotelAdactinTask2();
		DropDownSelectByIndex(ah2.getGetlocation(), 2);
		DropDownSelectByIndex(ah2.getGethotels(), 1);
		DropDownSelectByIndex(ah2.getGetroomtype(), 2);
		DropDownSelectByIndex(ah2.getGetroomnos(), 1);
		type(ah2.getDatepickin(),"04/04/2021");
		type(ah2.getDatepickout(),"05/04/2021");
		DropDownSelectByIndex(ah2.getAdultroom(), 2);
		DropDownSelectByIndex(ah2.getChildroom(), 1);
		Click(ah2.getSubmit());
		HotelAdactinTask3 ah3= new HotelAdactinTask3();
		Click(ah3.getRadiobutton());
		Click(ah3.getContinuenext());
		HotelAdactinTask4 ah4= new HotelAdactinTask4();
		type(ah4.getTxtfirstName(),"Iswarya");
		type(ah4.getTxtlastName(), "Subramanian");
		type(ah4.getTxtbillingAddress(), "Nanganallur");
		type(ah4.getTxtcreditCardNo(), "5597235651782684");
		DropDownSelectByIndex(ah4.getCreditCardType(), 1);
		DropDownSelectByIndex(ah4.getCredircardMonth(), 3);
		DropDownSelectByIndex(ah4.getCreditCardExpiryYear(), 4);
		type(ah4.getTxtcvvNumber(), "369");
		Click(ah4.getBookNow());
		HotelAdactinTask5 ah5= new HotelAdactinTask5();
		
		ThreadSleep();
		
		Click(ah5.getItinerary());
		
		ThreadSleep();
		
		getAttributeValue(ah5.getOrderId());
		
		EnterDataFromExcel(ah5.getOrderId(), "C:\\Users\\ishuc\\eclipse-workspace\\MavenDay1\\Excel sheet\\orderId1.xlsx", "orderid1");

}
}
