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

public class Function_DepartmentTest extends WebDriverPass{


	protected ExtentReports report;
	protected ExtentTest test;
	
	Function_Department w = new Function_Department();
	
	@Test(priority=40)
	  public void FunctionDepartment() throws Exception {
		   test=report.startTest("Function Department");	  
		   w.FunctionDepartment(driver);
		   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Function Department"); 
		  System.out.println("Function Department URL open successfully");
	  }
	
	   @Test(priority=41) 
	   public void ValidationforAddFunctionDepartment() throws Exception {
	 	   test=report.startTest("Validation for Add Function Department");	  
	 	   w.ValidationforAddFunctionDepartment(driver);
	 	   Assert.assertTrue(true);
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Validation for Add Function Department"); 
	 	 System.out.println("Validation for Add Function Department is executed successfully");
	 	 
	   }
	    @Test(priority=42) 
	   public void DuplicateAddFunctionDepartment() throws Exception {
	 	   test=report.startTest("Duplicate Add Function Department");	  
	 	   w.DuplicateAddFunctionDepartment(driver);
	 	   Assert.assertTrue(true);
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Duplicate Add Function Department"); 
	 	 System.out.println("DuplicateAdd Function Department is executed successfully");
	 	 
	   }
	  @Test(priority=43) 
	  public void SearchAddFunctionDepartment() throws Exception {
		   test=report.startTest("Search Add Function Department");	  
		   w.SearchAddFunctionDepartment(driver);
		   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Search Add Function Departmentt"); 
		 System.out.println("Search Add Function Department is executed successfully");
		 
	  }
	   
	   @Test(priority=44)   
	   public void EditFunctionDepartment() throws Exception {
	 	   test=report.startTest("Edit Function Department");	  
	 	   w.EditFunctionDepartment(driver);
	 	   Assert.assertTrue(true);
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Edit Function Department"); 
	 	 System.out.println("Edit Function Department is executed successfully ");
	 	
	   }

	   @Test(priority=45)   
	   public void SearchEditFunctionDepartment() throws Exception {
	 	   test=report.startTest("Search Edit Function Department");	  
	 	   w.SearchEditFunctionDepartment(driver);
	 	   Assert.assertTrue(true);
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Search Edit Function Department"); 
	 	 System.out.println("Search Edit Function Department is executed successfully ");
	 	
	   }
	   
	 @Test(priority=46)
	   
	   public void DeletetFunctionDepartment() throws Exception {
	 	   test=report.startTest("Delete Function Department");	  
	 	   w.DeletetFunctionDepartment(driver);
	 	   Assert.assertTrue(true);
	 	  test.log(LogStatus.PASS, "Purchase-->Admin-->Delete Function Department"); 
	 	 System.out.println("Delete Function Department is executed successfully ");
	 	
	   }
	 @Test(priority=47)
	 
	 public void SearchDeletetFunctionDepartment() throws Exception {
		   test=report.startTest("Search Delete Function Department");	  
		   w.SearchDeletetFunctionDepartment(driver);
		   Assert.assertTrue(true);
		  test.log(LogStatus.PASS, "Purchase-->Admin-->Search Delete Function Department"); 
		 System.out.println("Search Delete Function Department is executed successfully ");
		
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
	   
	 /*  @AfterSuite
	  public void afterSu() {
	       report.close();
	   }*/
	}

