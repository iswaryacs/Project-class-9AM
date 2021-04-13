package org.taskadact;

import org.testng.annotations.DataProvider;

public class SampleTask1 {
@DataProvider (name="Data")
public static Object[][] loginData() {
	return new Object[][] {{"chennai", "coimbatore"}, {"chennai", "madurai"}, {"chennai", "trichy"}};
}
}
