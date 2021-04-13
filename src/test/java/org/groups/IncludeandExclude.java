package org.groups;

import org.testng.annotations.Test;

public class IncludeandExclude {
	@Test (groups = {"smoke"})
	private void tc0() {
		System.out.println("Method1");
	}
	@Test (groups = {"sanity"})
	private void tc1() {
		System.out.println("Method2");	
	}
	@Test (groups = {"reg"})
	private void tc2() {
		System.out.println("Method3");	
	}
	@Test (groups = {"retest"})
	private void tc3() {
		System.out.println("Method4");
	}
	@Test (groups = {"E2E"})
	private void tc4() {
		System.out.println("Method5");	
	}
}
