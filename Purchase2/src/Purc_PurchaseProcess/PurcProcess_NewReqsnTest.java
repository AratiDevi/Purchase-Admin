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


public class PurcProcess_NewReqsnTest extends WebDriverPass{
	
	ExtentReports report;
	ExtentTest test;
	PurcProcess_NewReqsn p=new PurcProcess_NewReqsn();
	
	@Test(priority=1)
	  public void Search() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn"); 
		  
		  p.Search(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Search Functionality"); 
		    
	  }
	@Test(priority=2)
	  public void VesselRemarks() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn-->Vessel Remarks"); 
		  
		  p.VesselRemarks(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Vessel Remarks"); 
		    
	  }
	
	@Test(priority=3)
	  public void AllRemarks() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn-->All Remarks"); 
		  
		  p.AllRemarks(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->All Remarks"); 
		    
	  }
	
	@Test(priority=4)
	  public void Hold_Unhold() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn-->Hold to Unhold"); 
		  
		  p.Hold_Unhold(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Hold to Unhold"); 
		    
	  } 
	
	@Test(priority=5)
	  public void AddItemsfromOfficeside() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn-->Add Items from Office side"); 
		  
		  p.AddItemsfromOfficeside(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Add Items from Office side"); 
		    
	  }
	
	@Test(priority=6)
	  public void Unhold_Hold() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn-->Unhold_Hold"); 
		  
		  p.Unhold_Hold(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Unhold to Hold"); 
		    
	  }
	
	/*@Test(priority=7)
	  public void Attachments() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn-->Attachments"); 
		  
		  p.Attachments(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Attachments"); 
		    
	  }*/
	
	@Test(priority=8)
	  public void Supplier() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn-->Supplier"); 
		  
		  p.Supplier(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Supplier"); 
		    
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
	  	  report = PurcProcess_NewReqsn.getReporter(path.concat("Report.html"));
	  }
}
