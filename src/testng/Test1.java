package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	@Test(priority = -10,enabled = false)
	public void calls() {
		Reporter.log("calls",true);
	}

	@Test(priority = -6, invocationCount = 4)
	public void settings() {
		Reporter.log("settings",true);
	}


	@Test(priority = -1 , invocationCount = 2)
	public void chats() {
		Reporter.log("chats",true);
	}

}