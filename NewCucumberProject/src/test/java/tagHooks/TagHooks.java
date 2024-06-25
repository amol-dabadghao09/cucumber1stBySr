package tagHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TagHooks {
	
	@Before("@sanity")
	public void beforeHook() {
		
		System.out.println("Before hook for sanity tag");
	}
	
	@After("@fuctional")
	public void afterHook() {
		
		System.out.println("After hook for functional tag");
	}
	

}
