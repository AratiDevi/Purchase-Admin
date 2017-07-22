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
import purchase_Admin.UnitPackings;


public class UnitPackingsTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	UnitPackings w = new UnitPackings();
	


	   @Test(priority=19)
	   public void UnitPacking() throws Exception {
		   test=report.startTest("Unit Packing URL");	  
		   w.UnitPacking(driver);
		   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Unit Packing URL"); 
		  System.out.println("Unit Packing URL open successfully");
		  
	  }

	 
	   @Test(priority=20)
	   public void ValidationforAddUnitPacking() throws Exception {
	 	   test=report.startTest("Validation for Add Unit Packing");	  
	 	   w.ValidationforAddUnitPacking(driver);
	 	   Assert.assertTrue(true);
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Validation for Add Unit Packing"); 
	 	 System.out.println("Validation for Add Unit Packing is executed successfully ");
	 	
	   }
	   
	   @Test(priority=21)
	   public void DuplicateAddUnitPacking() throws Exception {
	 	   test=report.startTest("Duplicate Add Unit Packing");	  
	 	   w.DuplicateAddUnitPacking(driver);
	 	   Assert.assertTrue(true);
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Duplicate Add Unit Packing"); 
	 	 System.out.println("Duplicate Add Unit Packing is executed successfully ");
	 	
	   }
	   
	   @Test(priority=22)
	   public void SearchAddedUnitPacking() throws Exception {
	 	   test=report.startTest("Search Added Unit Packing");	  
	 	   w.SearchAddedUnitPacking(driver);
	 	   Assert.assertTrue(true);
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Search Added Unit Packing"); 
	 	 System.out.println("Search Added Unit Packing is executed successfully ");
	 	
	   }
	   
	  
	   @Test(priority=23)
	   public void EditUnitPacking() throws Exception {
	 	   test=report.startTest("Edit Unit Packing");	  
	 	   w.EditUnitPacking(driver);
	 	   Assert.assertTrue(true);
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Edit Unit Packing"); 
	 	 System.out.println("Edit Unit Packing is executed successfully ");
	 	
	   }

	   @Test(priority=24)
	   public void SearchEditUnitPacking() throws Exception {
	 	   test=report.startTest("Search Edit Unit Packing");	  
	 	   w.SearchEditUnitPacking(driver);
	 	   Assert.assertTrue(true);
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Search Edit Unit Packing"); 
	 	 System.out.println("Search Edit Unit Packing is executed successfully ");
	 	
	   }
	   
	   
	   @Test(priority=25)
	   public void DeleteUnitPacking() throws Exception {
	 	   test=report.startTest("Delete Unit Packing");	  
	 	   w.DeleteUnitPacking(driver);
	 	   Assert.assertTrue(true);
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Delete Unit Packing"); 
	 	 System.out.println("Delete Unit Packing is executed successfully ");
	 	
	   }
	   
	   @Test(priority=26)
	   public void SearchDeletedtUnitPacking() throws Exception {
	 	   test=report.startTest("Search Deleted Unit Packing");	  
	 	   w.SearchDeletedtUnitPacking(driver);
	 	   Assert.assertTrue(true);
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Search Deleted Unit Packing Unit Packing"); 
	 	 System.out.println("Search Deleted Unit Packing is executed successfully ");
	 	
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
		  report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		 }
	  
	 /* @AfterSuite
	 public void afterSu() {
	      report.close();
	  }*/
	}
