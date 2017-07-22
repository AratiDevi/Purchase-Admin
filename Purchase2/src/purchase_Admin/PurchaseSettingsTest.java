package purchase_Admin;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import common_Function.WebDriverPass;
import purchase_Admin.PurchaseSettings;



public class PurchaseSettingsTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	PurchaseSettings w = new PurchaseSettings();
	
	  @Test(priority=34)
	  public void PurchaseConfigsettingsURL() throws Exception {
		   test=report.startTest("Purchase Config settingsURL");	  
		   w.PurchaseConfigsettingsURL(driver);
		   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Purchase Config settings URL"); 
		  System.out.println("Purchase settings URL open successfully");
		  
	  }

		 @Test(priority=35)
		   public void PurchaseAutoSetting() throws Exception {
			   test=report.startTest("Purchase Auto Setting");	  
			   w.PurchaseAutoSetting(driver);
			   Assert.assertTrue(true);
			  test.log(LogStatus.PASS, "Purchase-->Admin-->Purchase Auto Setting"); 
			  System.out.println("Purchase Auto Setting is executed successfully ");
			 	
		  }   
	  @Test(priority=36)
	   public void PurchaseConfigSetting() throws Exception {
		   test=report.startTest("Perchase Config Setting");	  
		   w.PurchaseConfigSetting(driver);
		   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Purchase Config Setting");
		  System.out.println("Perchase Config Setting is executed successfully ");
		 
	  }
	   
	   @Test(priority=37)
	   public void PurchaseMandatory() throws Exception {
		   test=report.startTest("PurchaseMandatory");	  
		   w.PurchaseMandatory(driver);
		   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Purchase Mandatory"); 
		  System.out.println("Purchase Mandatory is executed successfully ");
		  
	  }
	   @Test(priority=38)
	   public void CaptureRank() throws Exception {
		   test=report.startTest("CaptureRank");	  
		   w.CaptureRank(driver);
		   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Capture Rank"); 
		  System.out.println("Capture Rank is executed successfully ");
		 
	  }
	   @Test(priority=39)
	   public void AutomaticRequisition() throws Exception {
		   test=report.startTest("AutomaticRequisition");	  
		   w.AutomaticRequisition(driver);
		   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Automatic Requisition"); 
		  System.out.println("Positive Test Case for Automatic Requisition is executed successfully ");
		 	
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
		   report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 		  
	   
	  /* @AfterSuite
	  public void afterSu() {
	       report.close();
	   }*/
	}
	}