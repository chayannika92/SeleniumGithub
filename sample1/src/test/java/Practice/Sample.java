package Practice;

import org.testng.annotations.Test;
import Generic_Utility.BaseClass;
public class Sample extends BaseClass 
{
  @Test(groups="smokeTest")
  public void Test()
  {
	  System.out.println("method running");
  }
}
