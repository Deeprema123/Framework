package RunnerScript;

import org.testng.annotations.Test;

import GenericScript.Data1;
import Pomscript.pageModel1;

public class Script1 extends Data1
{
	@Test
	public void runner() throws InterruptedException
	{
		
	pageModel1 p= new pageModel1(driver);
	p.passdata("8987656655","SHDHSJH");
	Thread.sleep(2000);
}
}
