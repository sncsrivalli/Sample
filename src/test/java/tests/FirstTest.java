package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void test1() {
		Reporter.log("FirstTest - test1", true);
	}
}
