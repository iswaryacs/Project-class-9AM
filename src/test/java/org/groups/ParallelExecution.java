package org.groups;

import org.testng.annotations.Test;

public class ParallelExecution {
	@Test
	private void tc0() {
		System.out.println("Method1");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc1() {
		System.out.println("Method2");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc2() {
		System.out.println("Method3");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc3() {
		System.out.println("Method4");
		System.out.println(Thread.currentThread().getId());
	}
	@Test
	private void tc4() {
		System.out.println("Method5");
		System.out.println(Thread.currentThread().getId());
	}
}
