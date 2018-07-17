package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MavenTest 
{
	@Test
	public void testA()
	{
		Reporter.log("hiii....", true);
		Reporter.log("bye....", true);
	}

}
