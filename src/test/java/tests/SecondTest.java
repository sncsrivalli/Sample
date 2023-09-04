package tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SecondTest {

	@Test
	public void test1() {
		Reporter.log("SecondTest - test1", true);
	}
}
