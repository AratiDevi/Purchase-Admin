package purchase_CreateNewReq;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import common_Function.WebDriverPass;

public class CreateNewRequisitionTest extends WebDriverPass{
	ExtentReports report;
	ExtentTest test;
	CreateNewRequisition p = new CreateNewRequisition();
	
	  
	 @Test(priority=2)
	  public void createnewreq() throws Exception {
		  test=report.startTest("Create New Reqsn Module"); 
		  
		  p.createnewreq(driver);
		  Assert.assertTrue(true);
		  System.out.println("New Reqsn Created Successfully.");
	      test.log(LogStatus.PASS, "Purchase-->Create New Reqsn"); 
		    
	  }
	  
	  @Test(priority=3)
	  public void EditRequisition() throws Exception {
		  test=report.startTest("Edit Requisition"); 
		  p.EditRequisition(driver);
		  Assert.assertTrue(true);
		  System.out.println(" Edited New Reqsn Successfully.");
	      test.log(LogStatus.PASS, "Purchase-->Create New Reqsn-->Edit Requisition"); 
		    
	  }
	  @Test(priority=4)
	  public void RequisitionItems() throws Exception {
		  test=report.startTest("Requisition Items"); 
		  p.RequisitionItems(driver);
		  Assert.assertTrue(true);
		  System.out.println("Reqsn Items added Successfully.");
	      test.log(LogStatus.PASS, "Purchase-->Create New Reqsn-->Requisition Items"); 
		    
	  }
	  
@Test(priority=5)
	  public void AddItems() throws Exception {
		  test=report.startTest("Add Items"); 
		  
		  p.AddItems(driver);
		  Assert.assertTrue(true);
		  System.out.println("New Items added Successfully.");
	      test.log(LogStatus.PASS, "Purchase-->Create New Reqsn-->Add Items"); 
		    
	  }
	  
	  @Test(priority=6)
	  public void Search() throws Exception {
		  test=report.startTest("Search"); 
		  p.Search(driver);
		  Assert.assertTrue(true);
		  System.out.println("Search new add Items is Executed successfully");
	      test.log(LogStatus.PASS, "Purchase-->Create New Reqsn-->Search"); 
		    
	  }
  @Test(priority=7)
	  public void Edititems() throws Exception {
		  test=report.startTest("Edititems"); 
		  p.Edititems(driver);
		  Assert.assertTrue(true);
		  System.out.println("edit Reqsn Qty is Executed successfully");
	      test.log(LogStatus.PASS, "Purchase-->Create New Reqsn-->Edit Items name"); 
		    
	  }
	  
	  @Test(priority=8)
	  public void PurchaseQuestionnaire() throws Exception {
		  test=report.startTest("PurchaseQuestionnaire");  
		  p.PurchaseQuestionnaire(driver);
		  Assert.assertTrue(true);
		  System.out.println("Purchase Questionnaire is Executed successfully");
	      test.log(LogStatus.PASS, "Purchase-->Create New Reqsn-->Purchase Questionnaire"); 
		    
	  }
	  
		 /*@Test(priority=12)
		  public void WorklistJobs() throws Exception {
			  test=report.startTest("Worklist Jobs"); 
			  
			  p.WorklistJobs(driver);
			  Assert.assertTrue(true);
		      test.log(LogStatus.PASS, "Purchase-->Create New Reqsn-->Worklist Jobs"); 
			    
		  }*/
	
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
	  	  report = CreateNewRequisition.getReporter(path.concat("Report.html"));
	  }

	  @AfterSuite
	  public void afterSu() {
	      report.close();
	  }


	  }
