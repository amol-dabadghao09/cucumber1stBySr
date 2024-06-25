package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class AppHooks {
	
	@BeforeStep(order = 1)
	public void beforeStep1() {
		
		System.out.println("Before step1");
	}
	
	@BeforeStep(order = 2)
	public void beforeStep2() {
		
		System.out.println("Before step2");
	}
	
	@AfterStep(order = 1)
	public void afterStep1() {
		
		System.out.println("After step1");
	}
	
	@AfterStep(order = 2)
	public void afterStep2() {
		
		System.out.println("After step2");
	}
	
	@Before(order = 1)
	public void beforeHook1() {
		
		System.out.println("Before1 hooks");
	}
	
	@Before(order = 2)
	public void beforeHook2() {
		
		System.out.println("Before2 hooks");
	}
	
	@After(order = 1)
	public void afterHook1() {
		
		System.out.println("After1 hooks");
	}
	
	@After(order = 2)
	public void afterHook2() {
		
		System.out.println("After2 hooks");
	}
	
	
}
