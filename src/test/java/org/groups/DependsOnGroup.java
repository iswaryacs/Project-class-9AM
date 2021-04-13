package org.groups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroup {
	@Test (groups = {"smoke"})
	private void tc0() {
		System.out.println("Method1");
	}
	@Test (groups = {"smoke","sanity"})
	private void tc1() {
		System.out.println("Method2");
		Assert.assertTrue(false);
	}
	@Test (groups = {"reg"}, dependsOnGroups= {"smoke"})
	private void tc2() {
		System.out.println("Method3");	
	}
	@Test (groups = {"retest"}, dependsOnGroups= {"smoke"})
	private void tc3() {
		System.out.println("Method4");
	}
	@Test (groups = {"E2E"})
	private void tc4() {
		System.out.println("Method5");	
	}
}
