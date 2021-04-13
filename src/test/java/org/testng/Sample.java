package org.testng;

import org.testng.annotations.Test;

public class Sample {
@Test
private void tc0() {
	System.out.println("tc0");
}
@Test(priority=-11)
private void tc1() {
	System.out.println("tc1");
}
}
