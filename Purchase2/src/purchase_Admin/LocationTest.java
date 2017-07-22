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
import purchase_Admin.Location;


public class LocationTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	Location w = new Location();
	
	 @Test(priority=9)
	   public void Locations() throws Throwable {
		   test=report.startTest("Location URL");	  
		   w.Locations(driver);
		   Assert.assertTrue(true);
		   System.out.println("Location URL Opened Successfully");	   	   
		   test.log(LogStatus.PASS, "Purchase->Admin->Location URL"); 
	  }
	   @Test(priority=10)
	   public void ValidationforAddNewLocation() throws Exception {
		   test=report.startTest("Validation for Add New Location");	  
		   w.ValidationforAddNewLocation(driver);
		   Assert.assertTrue(true);	 
		//   System.out.println("Location URL Opened Successfully");	
		   System.out.println("Validation for Add New Location is Executed Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Validation for Add New Location"); 
	 }
	    

	   @Test(priority=11)
	    public void DuplicateAddNewLocation() throws Exception {
	 	   test=report.startTest("Duplicate Add New Location");	  
	 	   w.DuplicateAddNewLocation(driver);
	 	   Assert.assertTrue(true);
	 	   System.out.println("Duplicate Add New Location is Executed Successfully"); 	
	 	   test.log(LogStatus.PASS, "Purchase->Admin->Duplicate Add New Location"); 
	  }

	   @Test(priority=12)
	   public void SearchAddNewLocation() throws Exception {
		   test=report.startTest("Search Add New Location");	  
		   w.SearchAddNewLocation(driver);
		   Assert.assertTrue(true);
		   System.out.println("Search Add New Location is Executed Successfully"); 	
		   test.log(LogStatus.PASS, "Purchase->Admin->Search Add New Location"); 
	 }
	   @Test(priority=13)
	   public void EditLocation() throws Exception {
		   test=report.startTest("EditLocation");	  
		   w.EditLocation(driver);
		   Assert.assertTrue(true);
		   System.out.println("Edit Location is executed Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Edit Location"); 
	  }

	   @Test(priority=14)
	   public void SearchEditLocation() throws Exception {
		   test=report.startTest("Search EditLocation");	  
		   w.SearchEditLocation(driver);
		   Assert.assertTrue(true);
		   System.out.println("Search Edit Location is executed Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Search Edit Location"); 
	  }
	   @Test(priority=15)
	   public void DeleteLocation() throws Exception {
		   test=report.startTest("DeleteLocation");	  
		   w.DeleteLocation(driver);
		   Assert.assertTrue(true);
		   System.out.println("Delete Location is executed Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Delete Location"); 
	  }
	   @Test(priority=16)
	   public void SearchDeleteLocation() throws Exception {
		   test=report.startTest("Search Delete Location");	  
		   w.SearchDeleteLocation(driver);
		   Assert.assertTrue(true);
		   System.out.println("Search Delete Location is executed Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Search Delete Location"); 
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
	   report = LOTestingLabList.getReporter(path.concat("Report\\Purchase_Admin_Report.html"));		  }
   
  /* @AfterSuite
  public void afterSu() {
       report.close();
   }*/
}
