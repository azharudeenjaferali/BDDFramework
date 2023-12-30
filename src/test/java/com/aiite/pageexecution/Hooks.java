package com.aiite.pageexecution;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void beforeHook() {
		System.out.println("Step before a Scenario");
	}
	
	@After
	public void afterHook() {
		System.out.println("Step after a Scenario");
	}

}
