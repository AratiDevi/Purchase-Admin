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

public class purc_PendingSupplierConfirmationTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	 purc_PendingSupplierConfirmation p = new purc_PendingSupplierConfirmation();
		
 
	  @Test(priority=1)
	  public void Search() throws Exception {
		  test=report.startTest("search Functionality"); 
		  
		  p.Search(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase -> Purchase Process -> Pending Supplier Confirmation-->Search Functionality");


		    
	  }
	  
	  @Test(priority=2)
	  public void ResendPOtosupplier() throws Exception {
		  test=report.startTest("Cancel Items in PO"); 
		  
		  p.ResendPOtosupplier(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase -> Purchase Process -> Pending Supplier Confirmation-->Cancel Items in PO"); 

		    
	  }
	  
	  @Test(priority=3)
	  public void CancelItemsinPO() throws Exception {
		  test=report.startTest("Cancel Items in PO"); 
		  
		  p.CancelItemsinPO(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase -> Purchase Process -> Pending Supplier Confirmation-->Cancel Items in PO"); 

		    
	  }
	  @Test(priority=4)
	  public void ConfirmPo() throws Exception {
		  test=report.startTest("Cancel Items in PO"); 
		  
		  p.ConfirmPo(driver);
		  Assert.assertTrue(true);
	      test.log(LogStatus.PASS, "Purchase -> Purchase Process -> Pending Supplier Confirmation-->Cancel Items in PO"); 

		    
	  }
	  

       @Test(priority=5)
	  public void CancelPO() throws Exception {
		  test=report.startTest("Cancel Items in PO"); 
		  
		  p.CancelPO(driver);
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
	  	  report = purc_PendingSupplierConfirmation.getReporter(path.concat("Report.html"));
	  }

}