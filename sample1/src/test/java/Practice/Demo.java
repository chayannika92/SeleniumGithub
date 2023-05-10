package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo
{

	public static void main(String[] args) throws FindFailed 
	{
		     WebDriver driver;
		     WebDriverManager.edgedriver().setup();
		     driver=new EdgeDriver();
		     driver.get("https://www.google.com/");
		     Screen  s = new Screen();
		   Pattern img = new Pattern("C:\\Users\\chaya\\eclipse-workspace\\sample1\\dots.png");
		    // s.wait(img,10);
		     s.click(img);
		    Pattern img1 = new Pattern("C:\\Users\\chaya\\eclipse-workspace\\sample1\\playstore.png");
		     //s.wait(img1,10);
		     s.click(img1);
		     
		     
		     

	}

}
