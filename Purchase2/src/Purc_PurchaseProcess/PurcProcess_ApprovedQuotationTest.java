package Purc_PurchaseProcess;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;

public class PurcProcess_ApprovedQuotationTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	PurcProcess_ApprovedQuotation p=new PurcProcess_ApprovedQuotation();
	
	/*@Test(priority=1)
	  public void Search() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn"); 
		  
		  p.Search(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Search Functionality"); 
		   
	      
	  }*/
	
	@Test(priority=2)
	  public void RaisePO() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn"); 
		  
		  p.RaisePO(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Search Functionality"); 
		   
	      
	  }
	
	@Test(priority=3)
	  public void ViewQuotations() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn"); 
		  
		  p.ViewQuotations(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Search Functionality"); 
		   
	      
	  }
	
	@Test(priority=4)
	  public void CancelPO() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn"); 
		  
		  p.CancelPO(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Search Functionality"); 
		   
	      
	  }
	 @AfterMethod
	  	public void afterMethod(ITestResult result) {
	  	    if (result.getStatus() == ITestResult.FAILURE) {
	  	        test.log(LogStatus.FAIL, "Test failed " + result.getThrowable());
	  	    } else if (result.getStatus() == ITestResult.SKIP) {
	  	        test.log(LogStatus.SKIP, "Test skipped " + result.getThrowable());
	  	    } else {
	  	        test.log(LogStatus.PASS, "Test passed");
	  	    }
	  	    report.endTest(test);
	  	    report.flush();
	  }
	  @BeforeSuite
	  public void beforeSu() {
	  	  report = PurcProcess_QuotationApproval.getReporter(path.concat("Report.html"));
	  }
}


