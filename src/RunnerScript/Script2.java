package RunnerScript;

import org.testng.annotations.Test;

import GenericScript.Data1;
import Pomscript.Pom2;


public class Script2 extends Data1
{
	@Test
	public void runner() throws InterruptedException
	{
		
	Pom2 p= new Pom2(driver);
	p.passdata("shoes");
	Thread.sleep(2000);
}
}