package Practice;
import java.sql.Statement; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection; 
 import java.sql.ResultSet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws Throwable
	{
		      WebDriver driver;
		    // WebDriverManager.chromedriver().setup();
		     //driver=new ChromeDriver();
		     WebDriverManager.edgedriver().setup();
		     driver=new EdgeDriver();
		     
		     //step1: - register  the driver
		    Driver driverref = new Driver();
		    DriverManager.registerDriver(driverref);
		    

		  //step2:- connection to database name
		    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/WeekendBatch","root","root"); //username //password
		  //step3:- create sql statement 
		    Statement stat = conn.createStatement(); 
		    String query = "select*from students"; //table name 
		    //step4:-Execute Query
		    ResultSet result = stat.executeQuery(query); 
		    while(result.next())
		     { 
		    	System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
		     } 
		    //step5: close database connection
		    conn.close();
	}

}
