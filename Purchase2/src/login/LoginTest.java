package login;

import org.testng.annotations.Test;

import common_Function.WebDriverPass;
import common_Function.loginpage;

public class LoginTest extends WebDriverPass{ 

	/*protected ExtentReports report;
	protected ExtentTest test;*/
	
	loginpage w = new loginpage();
	
	 @Test(priority=0)
	  public void JibeLogin() throws Exception {
		   
		   w.Login(driver);
		   
	  }
	  
}
