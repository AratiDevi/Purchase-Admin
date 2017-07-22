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

import purchase_Admin.PurchaseQuestionnaire;

public class PurchaseQuestionnaireTest extends WebDriverPass{

	protected ExtentReports report;
	protected ExtentTest test;
	
	PurchaseQuestionnaire w = new PurchaseQuestionnaire();
	

	@Test(priority=27)
	   public void PurchaseQuestionnaire() throws Exception {
		   test=report.startTest("Purchase Questionnaire");	  
		   w.PurchaseQuestionnair(driver);
		   Assert.assertTrue(true);
		   System.out.println("Purchase Questionnaire URL Opened Successfully");
		  test.log(LogStatus.PASS, "Purchase->Admin->Purchase Questionnaire"); 
	  }
	   

   @Test(priority=28)
	   public void ValidationforAddNewQuestion() throws Exception {
	 	   test=report.startTest("Validation for Add New Question");	  
	 	   w.ValidationforAddNewQuestion(driver);
	 	   Assert.assertTrue(true);	 
	 	  System.out.println("Validation for Add New Question is Executed Successfully");
	 	  test.log(LogStatus.PASS, "Purchase->Admin->Validation Add New Question"); 
	   }
	     @Test(priority=29)
	   public void DuplicateAddNewQuestion() throws Exception {
	 	   test=report.startTest("Duplicate Add New Question");	  
	 	   w.DuplicateAddNewQuestion(driver);
	 	   Assert.assertTrue(true);
	 	  System.out.println("DuplicateAdd New Question is Executed Successfully");
	 	  test.log(LogStatus.PASS, "Purchase->Admin->Duplicate Add New Question"); 
	   }
	   
	   
	  @Test(priority=30)
	   public void DeleteNewQuestion() throws Exception {
	 	   test=report.startTest("Delete New Added Question");	  
	 	   w.DeleteNewQuestion(driver);
	 	   Assert.assertTrue(true);
	 	  System.out.println("Delete New Question is executed Successfully");
	 	  test.log(LogStatus.PASS, "Purchase->Admin->Delete New Added Question"); 
	   }
	  @Test(priority=31)
	   public void SearchDeleteNewQuestion() throws Exception {
	 	   test=report.startTest("Delete New Added Question");	  
	 	   w.SearchDeleteNewQuestion(driver);
	 	   Assert.assertTrue(true);
	 	  System.out.println("Search Delete New Question is executed Successfully");
	 	  test.log(LogStatus.PASS, "Purchase->Admin->Search Delete New Added Question"); 
	   }
	  
	
	   
	 @Test(priority=31)
	   public void ValidationforAddNewGrade() throws Exception {
	 	   test=report.startTest("ValidationAdd New Grade");	  
	 	   w.ValidationforAddNewGrade(driver);
	 	   Assert.assertTrue(true);
	 	  System.out.println("Validation for Add New Grade is Executed Successfully");
	 	  test.log(LogStatus.PASS, "Purchase->Admin->Validation for Add New Grade");
	  }
	 @Test(priority=32)
	   public void DuplicateAddNewGrade() throws Exception {
	 	   test=report.startTest("Duplicate Add New Grade");	  
	 	   w.DuplicateAddNewGrade(driver);
	 	   Assert.assertTrue(true);
	 	  System.out.println("Duplicate Add New Grade is Executed Successfully");
	 	  test.log(LogStatus.PASS, "Purchase->Admin->DuplicateAdd New Grade"); 
	   }
	   

	    @Test(priority=33)
	   public void DeleteAddedNewGrade() throws Exception {
	 	   test=report.startTest("Delete Added New Grade");	  
	 	   w.DeleteAddedNewGrade(driver);
	 	   Assert.assertTrue(true);
	 	  System.out.println("Delete Added New Grade is executed Successfully");
	 	  test.log(LogStatus.PASS, "Purchase->Admin->Delete Added New Grade"); 
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