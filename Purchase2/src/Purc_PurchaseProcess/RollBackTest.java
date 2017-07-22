package Purc_PurchaseProcess;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Purc_PurchaseProcess.purc_PendingSupplierConfirmation;
import common_Function.WebDriverPass;

public class RollBackTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	RollBack p = new RollBack();
		
 
	  @Test(priority=1)
	  public void RollBack_QuotationApproval() throws Exception {
		  test=report.startTest("search Functionality"); 
		  
		  p.RollBack_QuotationApproval(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase -> Purchase Process -> Pending Supplier Confirmation-->Search Functionality");


		    
	  }
	  
	  @Test(priority=2)
	  public void RollBack_ApprovedQuotations() throws Exception {
		  test=report.startTest("Cancel Items in PO"); 
		  
		  p.RollBack_ApprovedQuotations(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase -> Purchase Process -> Pending Supplier Confirmation-->Cancel Items in PO"); 

		    
	  }
	  
	  @Test(priority=3)
	  public void RollBack_PendingSupplierConfirmation() throws Exception {
		  test=report.startTest("Cancel Items in PO"); 
		  
		  p.RollBack_PendingSupplierConfirmation(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase -> Purchase Process -> Pending Supplier Confirmation-->Cancel Items in PO"); 

		    
	  }
	  @Test(priority=4)
	  public void RollBack_PendingDeliveryUpdates() throws Exception {
		  test=report.startTest("Cancel Items in PO"); 
		  
		  p.RollBack_PendingDeliveryUpdates(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase -> Purchase Process -> Pending Supplier Confirmation-->Cancel Items in PO"); 

		    
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
	  	  report = RollBack.getReporter(path.concat("Report.html"));
	  }

}