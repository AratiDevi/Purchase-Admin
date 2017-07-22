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
import purchase_Admin.LOTestingLabList;






public class LOTestingLabListTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	LOTestingLabList w = new LOTestingLabList();
	


	   @Test(priority=1)
	   public void TestingLabList() throws Exception {
		   test=report.startTest("TestingLabList");	  
		   w.TestingLabList(driver);
		   Assert.assertTrue(true);
		   System.out.println("Testing Lab List URL Opened Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Testing Lab List"); 
	  }
	 
	 
	   @Test(priority=2)
	   public void ValidationforAddNewLab() throws Exception {
		   test=report.startTest("AddNewLab");	  
		   w.ValidationforAddNewLab(driver);
		   Assert.assertTrue(true);
		
		   System.out.println("Validation for Add New Lab is Executed Successfully");	  
		  test.log(LogStatus.PASS, "Purchase->Admin->Add New Lab"); 
	  }
	
	  
	  @Test(priority=3)
	   public void DuplicateAddNewLab() throws Exception {
		   test=report.startTest("Duplicate Add New Lab");	  
		   w.DuplicateAddNewLab(driver);
		   Assert.assertTrue(true);
		   System.out.println("Duplicate Add New Lab is Executed Successfully");	  
		  test.log(LogStatus.PASS, "Purchase->Admin->Duplicate Add New Lab"); 
	  }
	   
	   @Test(priority=4)
	   public void SearchAddedNewLab() throws Exception {
		   test=report.startTest("Search Added New Lab");	  
		   w.SearchAddedNewLab(driver);
		   Assert.assertTrue(true);
		   System.out.println("Search Added New Lab is Executed Successfully");	  
		  test.log(LogStatus.PASS, "Purchase->Admin->Search Added New Lab"); 
	  }
	   
	   @Test(priority=5)
	   public void EditLab() throws Exception {
		   test=report.startTest("Edit Lab");	  
		   w.EditLab(driver);
		   Assert.assertTrue(true);
		   System.out.println("Edit Lab is executed Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Edit Lab"); 
	  }
	   
	   @Test(priority=6)
	   public void SearchEditedLab() throws Exception {
		   test=report.startTest("Search Edited Lab");	  
		   w.SearchEditedLab(driver);
		   Assert.assertTrue(true);
		   System.out.println("Search Edited Lab is executed Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Search Edited Lab"); 
	  }
	   @Test(priority=7)
	   public void DeleteLab() throws Exception {
		   test=report.startTest("DeleteLab");	  
		   w.DeleteLab(driver);
		   Assert.assertTrue(true);
		   System.out.println("Delete Lab is executed Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Delete Lab"); 
	  }
	   
	   @Test(priority=8)
	   public void SearchDeletedLab() throws Exception {
		   test=report.startTest("Search Deleted Lab");	  
		   w.SearchDeletedLab(driver);
		   Assert.assertTrue(true);
		   System.out.println("Search Deleted Lab is executed Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Search Deleted Lab"); 
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
