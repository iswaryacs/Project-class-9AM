package org.rerun;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RerunSampleManual {
	@Test
	private void tc20() {
		System.out.println("method1");
	}

	@Test
	private void tc21() {
		System.out.println("method2");

	}
	@Test
	private void tc22() {
		System.out.println("method3");

	}

	@Test
	private void tc24() {
		System.out.println("method4");
		Assert.assertTrue(true);

	}

	@Test
	private void tc25() {
		System.out.println("method5");

	}

}
