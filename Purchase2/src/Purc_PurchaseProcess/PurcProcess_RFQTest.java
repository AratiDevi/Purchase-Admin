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

public class PurcProcess_RFQTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	PurcProcess_RFQ p=new PurcProcess_RFQ();
	
	@Test(priority=1)
	  public void Search() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn"); 
		  
		  p.Search(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Search Functionality"); 
		    
	  }
	@Test(priority=2)
	  public void QuotationEvaluation() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn-->Quotation Evaluation"); 
		  
		  p.QuotationEvaluation(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Quotation Evaluation"); 
		    
	  }
	
	@Test(priority=3)
	  public void DeclineQuote() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn-->Decline Quote"); 
		  
		  p.DeclineQuote(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Decline Quote"); 
		    
	  }
	
	@Test(priority=4)
	  public void ImportExcelQuotation() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn-->Import Excel Quotation"); 
		  
		  p.ImportExcelQuotation(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Import Excel Quotation"); 
		    
	  } 
	
	@Test(priority=5)
	  public void SendtoSuptdforApproval() throws Exception {
		  test=report.startTest("Purchase Process _ New Reqsn-->Send to Suptd for Approval"); 
		  
		  p.SendtoSuptdforApproval(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase-->Purchase Process-->New Reqsn-->Send to Suptd for Approval"); 
		    
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
	  	  report = PurcProcess_RFQ.getReporter(path.concat("Report.html"));
	  }
}
