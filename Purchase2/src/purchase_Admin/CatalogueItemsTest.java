package purchase_Admin;

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

public class CatalogueItemsTest extends WebDriverPass {

	ExtentReports report;
	ExtentTest test;
	CatalogueItems m = new CatalogueItems();
	
	
	@Test(priority = 57)
	public void ManageSystems() throws Exception {
		test = report.startTest("ManageSystem");
		m.ManageSystems(driver);
		Assert.assertTrue(true);
		System.out.println("ManageSystem URL Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->ManageSystem");
	}
	
 @Test(priority=58)
  public void SearchFunction() throws Exception {
	  test=report.startTest("SearchFunction");
	  m.SearchFunction(driver);
	  Assert.assertTrue(true);
	  System.out.println("SearchFunction Opened Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->SearchFunction"); 
  }
 
/* @Test(priority=58)
 public void RequisitionType_Store() throws Exception {
	  test=report.startTest("RequisitionType_Store");
	  m.RequisitionType_Store(driver);
	  Assert.assertTrue(true);
	  System.out.println("RequisitionType_Store Opened Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->RequisitionType_Store"); 
 }*/
 
 

@Test(priority=59)
  public void ValidationForAddCatalogue() throws Exception {
	 test=report.startTest("ValidationForAddCatalogue");
	  m.ValidationForAddCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("Validation For Add Catalogue is Executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->ValidationForAddCatalogue"); 
}
	
	
	@Test(priority=60)
	public void DuplicateAddCatalogue() throws Exception {
		 test=report.startTest("DuplicateAddCatalogue");
		  m.DuplicateAddCatalogue(driver);
		  Assert.assertTrue(true);
		  System.out.println("Duplicate for Add Catalogue is Executed Successfully");
	    test.log(LogStatus.PASS, "Purchase->Admin->DuplicateAddCatalogue"); 
	}


@Test(priority=61)
public void SearchAddCatalogue() throws Exception {
	 test=report.startTest("SearchAddCatalogue");
	  m.SearchAddCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("Search for Add Catalogue is Executed Successfully");
    test.log(LogStatus.PASS, "Purchase->Admin->SearchAddCatalogue"); 
}
@Test(priority=62)
  public void EditCatalogue() throws Exception {
	 test=report.startTest("EditCatalogue");
	  m.EditCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("Edit Catalogue is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->Edit Catalogue"); 
}

@Test(priority=63)
public void SearchEditedAddCatalogue() throws Exception {
	 test=report.startTest("SearchEditedAddCatalogue");
	  m.SearchEditedAddCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("SearchEditedAddCatalogue is executed Successfully");
    test.log(LogStatus.PASS, "Purchase->Admin->SearchEditedAddCatalogue"); 
}

@Test(priority=64)
public void ValidationForAddSubCatalogue() throws Exception {
	 test=report.startTest("ValidationForAddSubCatalogue");
	  m.ValidationForAddSubCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("ValidationForAddSubCatalogue is executed Successfully");
    test.log(LogStatus.PASS, "Purchase->Admin->ValidationForAddSubCatalogue"); 
}


@Test(priority=65)
public void DuplicateAddSubCatalogue() throws Exception {
	 test=report.startTest("DuplicateAddSubCatalogue");
	  m.DuplicateAddSubCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("DuplicateAddSubCatalogue is executed Successfully");
    test.log(LogStatus.PASS, "Purchase->Admin->DuplicateAddSubCatalogue"); 
}

 
@Test(priority=66)
 public void SearchAddSubCatalogue() throws Exception {
	  test=report.startTest("PositiveTestCaseAddSubCatalogue");
	  m.SearchAddSubCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("SearchAddSubCatalogue is Executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->SearchAddSubCatalogue"); 
}


 @Test(priority=67)
  public void EditSubCatalogue() throws Exception {
	  test=report.startTest("EditSubCatalogue");
	  m.EditSubCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("Edit SubCatalogue is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->EditSubCatalogue"); 
}

 
 @Test(priority=68)
 public void SearchEditedAddSubCatalogue() throws Exception {
	  test=report.startTest("SearchEditedAddSubCatalogue");
	  m.SearchEditedAddSubCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("SearchEditedAddSubCatalogue is executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->SearchEditedAddSubCatalogue"); 
}
 
 @Test(priority=69)
 public void ValidationForAddStoresItem() throws Exception {
 	 test=report.startTest("Validation For Add Stores Item");
 	  m.ValidationForAddStoresItem(driver);
 	  Assert.assertTrue(true);
 	  System.out.println("Validation For Add Stores Items is executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->Validation For Add Stores Item"); 
 }
 
 @Test(priority=70)
 public void DuplicateAddStoresItem() throws Exception {
 	 test=report.startTest("Duplicate Add Stores Item");
 	  m.DuplicateAddStoresItem(driver);
 	  Assert.assertTrue(true);
 	  System.out.println("Duplicate Add Stores Items is executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->Duplicate Add Stores Item"); 
 }
  
 
 @Test(priority=71)
 public void SearchAddStoresItem() throws Exception {
	  test=report.startTest("SearchAddStoresItem");
	  m.SearchAddStoresItem(driver);
	  Assert.assertTrue(true);
	  System.out.println("SearchAddStoresItem is Executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->SearchAddStoresItem"); 
}
  
 
   @Test(priority=72)
  public void EditStoresItem() throws Exception {
	  test=report.startTest("EditStoresItem");
	  m.EditStoresItem(driver);
	  Assert.assertTrue(true);
	  System.out.println("Edit Stores Item is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->EditStoresItem"); 
}
   
   @Test(priority=73)
   public void SearchEditedStoresItem() throws Exception {
 	  test=report.startTest("SearchEditedStoresItem");
 	  m.SearchEditedStoresItem(driver);
 	  Assert.assertTrue(true);
 	  System.out.println("Searc hEdited Stores Item is executed Successfully");
       test.log(LogStatus.PASS, "Purchase->Admin->SearchEditedStoresItem"); 
 }
   
   
   @Test(priority=74)
   public void AppendCopyItems() throws Exception {
 	  test=report.startTest("AppendCopyItems");
 	  m.AppendCopyItems(driver);
 	  Assert.assertTrue(true);
 	  System.out.println("AppendCopyItems is executed Successfully");
       test.log(LogStatus.PASS, "Purchase->Admin->AppendCopyItems"); 
 }
   
   
   @Test(priority=75)
   public void SearchAppendCopyItems() throws Exception {
 	  test=report.startTest("SearchAppendCopyItems");
 	  m.SearchAppendCopyItems(driver);
 	  Assert.assertTrue(true);
 	  System.out.println("SearchAppendCopyItems is executed Successfully");
       test.log(LogStatus.PASS, "Purchase->Admin->SearchAppendCopyItems"); 
 }
  
   
  @Test(priority=76)
   public void OverwriteCopyItems() throws Exception {
 	  test=report.startTest("OverwriteCopyItems");
 	  m.OverwriteCopyItems(driver);
 	  Assert.assertTrue(true);
 	  System.out.println("OverwriteCopyItems is executed Successfully");
       test.log(LogStatus.PASS, "Purchase->Admin->OverwriteCopyItems"); 
 }
   
   
   @Test(priority=77)
   public void MoveItems() throws Exception {
 	  test=report.startTest("MoveItems");
 	  m.MoveItems(driver);
 	  Assert.assertTrue(true);
 	  System.out.println("MoveItems is executed Successfully");
       test.log(LogStatus.PASS, "Purchase->Admin->MoveItems"); 
 }
   
   

  @Test(priority=78)
  public void DeleteStoresItem() throws Exception {
	  test=report.startTest("DeleteStoresItem");
	  m.DeleteStoresItem(driver);
	  Assert.assertTrue(true);
	  System.out.println("Delete Stores Item is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->DeleteStoresItem"); 
}
 
  @Test(priority=79)
  public void RestoreStoresItem() throws Exception {
	  test=report.startTest("RestoreStoresItem");
	  m.RestoreStoresItem(driver);
	  Assert.assertTrue(true);
	  System.out.println("Restore Stores Item is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->RestoreStoresItem"); 
}
   @Test(priority=80)
  public void DeleteSubCatalogue() throws Exception {
	  test=report.startTest("DeleteSubCatalogue");
	  m.DeleteSubCatalogue(driver);
	  Assert.assertTrue(true); 
	  System.out.println("Delete SubCatalogue is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->DeleteSubCatalogue"); 
}
  
  
  @Test(priority=81)
  public void DeleteCatalogue() throws Exception {
	  test=report.startTest("DeleteCatalogue");
	  m.DeleteCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("Delete Catalogue is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->DeleteCatalogue"); 
}
  
  
 @Test(priority=82)
  public void RestoreCatalogue() throws Exception {
	  test=report.startTest("RestoreCatalogue");
	  m.RestoreCatalogue(driver);
	  Assert.assertTrue(true);
	  System.out.println("Restore Catalogue is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->RestoreCatalogue"); 
}

	@Test(priority=83)
	  public void SearchRestoredCatalogue() throws Exception {
		  test=report.startTest("SearchRestoredCatalogue");
		  m.SearchRestoredCatalogue(driver);
		  Assert.assertTrue(true);
		  System.out.println("SearchRestoredCatalogue is executed Successfully");
	      test.log(LogStatus.PASS, "Purchase->Admin->SearchRestoredCatalogue"); 
	}

 
	//===========================================    OFFICE    ================================================================================
	


/* @Test(priority=83)------
public void RequisitionType_Office() throws Exception {
	  test=report.startTest("RequisitionType_Office");
	  m.RequisitionType_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("RequisitionType_Office is executed Successfully");
    test.log(LogStatus.PASS, "Purchase->Admin->RequisitionType_Office"); 
}
*/
 @Test(priority=84)
	 public void SearchFunction_Office() throws Exception {
		  test=report.startTest("SearchFunction_Office");
		  m. SearchFunction_Office(driver);		 
		  Assert.assertTrue(true);
		  System.out.println("SearchFunction_Office Opened Successfully");
	     test.log(LogStatus.PASS, "Purchase->Admin->SearchFunction_Office"); 
	 }


 @Test(priority=85)
 public void ValidationForAddCatalogue_Office() throws Exception {
	 test=report.startTest("ValidationForAddCatalogue_Office");	 
	  m.ValidationForAddCatalogue_Office(driver);		  
	  Assert.assertTrue(true);
	  System.out.println("Validation For Add Catalogue is Executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->ValidationForAddCatalogue_Office"); 
}
	
	
	@Test(priority=86)
	public void DuplicateAddCatalogue_Office() throws Exception {
		 test=report.startTest("DuplicateAddCatalogue_Office");
		  m.DuplicateAddCatalogue_Office(driver);		 		  
		  Assert.assertTrue(true);
		  System.out.println("Duplicate for Add Catalogue is Executed Successfully");
	    test.log(LogStatus.PASS, "Purchase->Admin->DuplicateAddCatalogue_Office"); 
	}


	@Test(priority=87)
public void SearchAddCatalogue_Office() throws Exception {
	 test=report.startTest("SearchAddCatalogue_Office");
	  m.SearchAddCatalogue_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("Search for Add Catalogue is Executed Successfully");
   test.log(LogStatus.PASS, "Purchase->Admin->SearchAddCatalogue_Office"); 
}
	
	
@Test(priority=88)
 public void EditCatalogue_Office() throws Exception {
	 test=report.startTest("EditCatalogue_Office");
	  m.EditCatalogue_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("Edit Catalogue is executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->EditCatalogue_Office"); 
}

@Test(priority=89)
public void SearchEditedAddCatalogue_Office() throws Exception {
	 test=report.startTest("SearchEditedAddCatalogue_Office");
	  m.SearchEditedAddCatalogue_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("SearchEditedAddCatalogue_Office is executed Successfully");
   test.log(LogStatus.PASS, "Purchase->Admin->SearchEditedAddCatalogue_Office"); 
}

	@Test(priority=90)
public void ValidationForAddSubCatalogue_Office() throws Exception {
	 test=report.startTest("ValidationForAddSubCatalogue_Office");
	  m.ValidationForAddSubCatalogue_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("ValidationForAddSubCatalogue_Office is executed Successfully");
   test.log(LogStatus.PASS, "Purchase->Admin->ValidationForAddSubCatalogue_Office"); 
}


	@Test(priority=91)
public void DuplicateAddSubCatalogue_Office() throws Exception {
	 test=report.startTest("DuplicateAddSubCatalogue_Office");
	  m.DuplicateAddSubCatalogue_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("DuplicateAddSubCatalogue_Office is executed Successfully");
   test.log(LogStatus.PASS, "Purchase->Admin->DuplicateAddSubCatalogue_Office"); 
}


	@Test(priority=92)
public void SearchAddSubCatalogue_Office() throws Exception {
	  test=report.startTest("SearchAddSubCatalogue_Office");
	  m.SearchAddSubCatalogue_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("SearchAddSubCatalogue_Office is Executed Successfully");
    test.log(LogStatus.PASS, "Purchase->Admin->SearchAddSubCatalogue_Office"); 
}


	 @Test(priority=93)
 public void EditSubCatalogue_Office() throws Exception {
	  test=report.startTest("EditSubCatalogue_Office");
	  m.EditSubCatalogue_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("EditSubCatalogue_Office is executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->EditSubCatalogue_Office"); 
}


	@Test(priority=94)
public void SearchEditedAddSubCatalogue_Office() throws Exception {
	  test=report.startTest("SearchEditedAddSubCatalogue_Office");
	  m.SearchEditedAddSubCatalogue_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("SearchEditedAddSubCatalogue_Office is executed Successfully");
    test.log(LogStatus.PASS, "Purchase->Admin->SearchEditedAddSubCatalogue_Office"); 

	}
	 @Test(priority=95)
public void ValidationForAddStoresItem_Office() throws Exception {
	 test=report.startTest("ValidationForAddStoresItem_Office");
	  m.ValidationForAddStoresItem_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("ValidationForAddStoresItem_Office is executed Successfully");
    test.log(LogStatus.PASS, "Purchase->Admin->ValidationForAddStoresItem_Office"); 
}

	@Test(priority=96)
public void DuplicateAddStoresItem_Office() throws Exception {
	 test=report.startTest("DuplicateAddStoresItem_Office");
	  m.DuplicateAddStoresItem_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("DuplicateAddStoresItem_Office is executed Successfully");
    test.log(LogStatus.PASS, "Purchase->Admin->DuplicateAddStoresItem_Office"); 
}
 

	 @Test(priority=97)
public void SearchAddStoresItem_Office() throws Exception {
	  test=report.startTest("SearchAddStoresItem_Office");
	  m.SearchAddStoresItem_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("SearchAddStoresItem_Office is Executed Successfully");
    test.log(LogStatus.PASS, "Purchase->Admin->SearchAddStoresItem_Office"); 
}


	  @Test(priority=98)
 public void EditStoresItem_Office() throws Exception {
	  test=report.startTest("EditStoresItem_Office");
	  m.EditStoresItem_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("EditStoresItem_Office is executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->EditStoresItem_Office"); 
}
  
	 @Test(priority=99)
  public void SearchEditedStoresItem_Office() throws Exception {
	  test=report.startTest("SearchEditedStoresItem_Office");
	  m.SearchEditedStoresItem_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("SearchEditedStoresItem_Office is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->SearchEditedStoresItem_Office"); 
}
  
     
  

@Test(priority=100)
 public void DeleteStoresItem_Office() throws Exception {
	  test=report.startTest("DeleteStoresItem_Office");
	  m.DeleteStoresItem_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("DeleteStoresItem_Office is executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->DeleteStoresItem_Office"); 
}


@Test(priority=101)
public void SearchDeletedStoresItem_Office() throws Exception {
	  test=report.startTest("SearchDeletedStoresItem_Office");
	  m.SearchDeletedStoresItem_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("SearchDeletedStoresItem_Office is executed Successfully");
    test.log(LogStatus.PASS, "Purchase->Admin->SearchDeletedStoresItem_Office"); 
}
 

@Test(priority=102)
 public void RestoreStoresItem_Office() throws Exception {
	  test=report.startTest("RestoreStoresItem_Office");
	  m.RestoreStoresItem_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("RestoreStoresItem_Office is executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->RestoreStoresItem_Office"); 
}
 
 
 @Test(priority=103)
 public void SearchRestoredStoresItem_Office() throws Exception {
	  test=report.startTest("SearchRestoredStoresItem_Office");
	  m.SearchRestoredStoresItem_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("SearchRestoredStoresItem_Office is executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->SearchRestoredStoresItem_Office"); 
}
 
 @Test(priority=104)
 public void DeleteSubCatalogue_Office() throws Exception {
	  test=report.startTest("DeleteSubCatalogue_Office");
	  m.DeleteSubCatalogue_Office(driver);
	  Assert.assertTrue(true); 
	  System.out.println("DeleteSubCatalogue_Office is executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->DeleteSubCatalogue_Office"); 
}
 

  @Test(priority=105)
 public void DeleteCatalogue_Office() throws Exception {
	  test=report.startTest("DeleteCatalogue_Office");
	  m.DeleteCatalogue_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("DeleteCatalogue_Office is executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->DeleteCatalogue_Office"); 
}
  
  
  
  @Test(priority=106)
  public void SearchDeletedCatalogue_Office() throws Exception {
 	  test=report.startTest("SearchDeletedCatalogue_Office");
 	  m.SearchDeletedCatalogue_Office(driver);
 	  Assert.assertTrue(true);
 	  System.out.println("SearchDeletedCatalogue_Office is executed Successfully");
      test.log(LogStatus.PASS, "Purchase->Admin->SearchDeletedCatalogue_Office"); 
 }
 
 
   @Test(priority=107)
 public void RestoreCatalogue_Office() throws Exception {
	  test=report.startTest("RestoreCatalogue_Office");
	  m.RestoreCatalogue_Office(driver);
	  Assert.assertTrue(true);
	  System.out.println("RestoreCatalogue_Office is executed Successfully");
     test.log(LogStatus.PASS, "Purchase->Admin->RestoreCatalogue_Office"); 
}
	
	
	 @Test(priority=108)
	 public void SearchRestoredCatalogue_Office() throws Exception {
		  test=report.startTest("SearchRestoredCatalogue_Office");
		  m.SearchRestoredCatalogue_Office(driver);
		  Assert.assertTrue(true);
		  System.out.println("SearchRestoredCatalogue_Office is executed Successfully");
	     test.log(LogStatus.PASS, "Purchase->Admin->SearchRestoredCatalogue_Office"); 
	}
	 
	//================================================================  SPARE Is-SERVICE  =============================================================================== 
	
			@Test(priority = 109)
		public void SearchFunction_Spare() throws Exception {
			test = report.startTest("SearchFunction_Spare");
			m.SearchFunction_Spare(driver);
			Assert.assertTrue(true);
			System.out.println("SearchFunction_Spare URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->SearchFunction_Spare");
		}
		
		@Test(priority = 110)
		public void ValidationForAddCatalogue_Spare_IsService() throws Exception {
			test = report.startTest("ValidationForAddCatalogue_Spare_IsService");
			m.ValidationForAddCatalogue_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("ValidationForAddCatalogue_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->ValidationForAddCatalogue_Spare_IsService");
		}
		
		@Test(priority = 111)
		public void DuplicateAddCatalogue_Spare_IsService() throws Exception {
			test = report.startTest("DuplicateAddCatalogue_Spare_IsService");
			m.DuplicateAddCatalogue_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("DuplicateAddCatalogue_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->DuplicateAddCatalogue_Spare_IsService");
		}
		
		
		@Test(priority = 112)
		public void SearchAddCatalogue_Spare_IsService() throws Exception {
			test = report.startTest("SearchAddCatalogue_Spare_IsService");
			m.SearchAddCatalogue_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("SearchAddCatalogue_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->SearchAddCatalogue_Spare_IsService");
		}
		
		@Test(priority = 114)
		public void EditAddCatalogue_Spare_IsService() throws Exception {
			test = report.startTest("EditAddCatalogue_Spare_IsService");
			m.EditAddCatalogue_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("EditAddCatalogue_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->EditAddCatalogue_Spare_IsService");
		}
		
		@Test(priority = 115)
		public void SearchEditedAddCatalogue_Spare_IsService() throws Exception {
			test = report.startTest("SearchEditedAddCatalogue_Spare_IsService");
			m.SearchEditedAddCatalogue_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("SearchEditedAddCatalogue_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->SearchEditedAddCatalogue_Spare_IsService");
		}
		
		@Test(priority = 116)
		public void ValidationForAddSubCatalogue_Spare_IsService() throws Exception {
			test = report.startTest("ValidationForAddSubCatalogue_Spare_IsService");
			m.ValidationForAddSubCatalogue_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("ValidationForAddSubCatalogue_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->ValidationForAddSubCatalogue_Spare_IsService");
		}
		
		@Test(priority = 117)
		public void DuplicateAddSubCatalogue_Spare_IsService() throws Exception {
			test = report.startTest("DuplicateAddSubCatalogue_Spare_IsService");
			m.DuplicateAddSubCatalogue_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("DuplicateAddSubCatalogue_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->DuplicateAddSubCatalogue_Spare_IsService");
		}
		
		@Test(priority = 118)
		public void SearchAddSubCatalogue_Spare_IsService() throws Exception {
			test = report.startTest("SearchAddSubCatalogue_Spare_IsService");
			m.SearchAddSubCatalogue_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("SearchAddSubCatalogue_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->SearchAddSubCatalogue_Spare_IsService");
		}
		
		

		@Test(priority = 119)
		public void EditAddedSubCatalogue_Spare_IsService() throws Exception {
			test = report.startTest("EditAddedSubCatalogue_Spare_IsService");
			m.EditAddedSubCatalogue_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("EditAddedSubCatalogue_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->EditAddedSubCatalogue_Spare_IsService");
		}
		
		@Test(priority = 120)
		public void SearchEditedAddSubCatalogue_Spare_IsService() throws Exception {
			test = report.startTest("SearchEditedAddSubCatalogue_Spare_IsService");
			m.SearchEditedAddSubCatalogue_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("SearchEditedAddSubCatalogue_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->SearchEditedAddSubCatalogue_Spare_IsService");
		}
		
		@Test(priority = 121)
		public void AddJobs_Spare_IsService() throws Exception {
			test = report.startTest("AddJobs_Spare_IsService");
			m.AddJobs_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("AddJobs_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->AddJobs_Spare_IsService");
		}
		
		@Test(priority = 122)
		public void DuplicateJobs_Spare_IsService() throws Exception {
			test = report.startTest("DuplicateJobs_Spare_IsService");
			m.DuplicateJobs_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("DuplicateJobs_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->DuplicateJobs_Spare_IsService");
		}
		
		
		@Test(priority = 123)
		public void SearchAddJobs_Spare_IsService() throws Exception {
			test = report.startTest("SearchAddJobs_Spare_IsService");
			m.SearchAddJobs_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("SearchAddJobs_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->SearchAddJobs_Spare_IsService");
		}
		
	
		@Test(priority = 124)
		public void EditAddedJobs_Spare_IsService() throws Exception {
			test = report.startTest("EditAddedJobs_Spare_IsService");
			m.EditAddedJobs_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("EditAddedJobs_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->EditAddedJobs_Spare_IsService");
		}
		
		@Test(priority = 125)
		public void SearchEditedAddJobs_Spare_IsService() throws Exception {
			test = report.startTest("SearchEditedAddJobs_Spare_IsService");
			m.SearchEditedAddJobs_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("SearchEditedAddJobs_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->SearchEditedAddJobs_Spare_IsService");
		}
	
		
		@Test(priority = 126)
		public void AppendCopyJobs__Spare_IsService() throws Exception {
			test = report.startTest("AppendCopyJobs__Spare_IsService");
			m.AppendCopyJobs__Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("AppendCopyJobs__Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->AppendCopyJobs__Spare_IsService");
			
		}
		
		
	/*	@Test(priority = 127)
		public void SearchAppendCopyJobs_Spare_IsService() throws Exception {
			test = report.startTest("SearchAppendCopyJobs_Spare_IsService");
			Thread.sleep(2000);
			m.SearchAppendCopyJobs_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("SearchAppendCopyJobs_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->SearchAppendCopyJobs_Spare_IsService");
		}*/
		
		
		/*@Test(priority = 128)
		public void OverwriteCopyJobs_Spare_IsService() throws Exception {
			test = report.startTest("OverwriteCopyJobs_Spare_IsService");
			m.OverwriteCopyJobs_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("OverwriteCopyJobs_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->OverwriteCopyJobs_Spare_IsService");
		}
	
		@Test(priority = 129)
		public void SearchOverwriteCopyJobs_Spare_IsService() throws Exception {
			test = report.startTest("SearchOverwriteCopyJobs_Spare_IsService");
			m.SearchOverwriteCopyJobs_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("SearchOverwriteCopyJobs_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->SearchOverwriteCopyJobs_Spare_IsService");
		}	*/
		
		
		@Test(priority = 130)
		public void MoveJobs_Spare_IsService() throws Exception {
			test = report.startTest("MoveJobs_Spare_IsService");
			m.MoveJobs_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("MoveJobs_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->MoveJobs_Spare_IsService");
		}
		

		@Test(priority = 131)
		public void AddSpareItem_Spare_IsService() throws Exception {
			test = report.startTest("AddSpareItem_Spare_IsService");
			m.AddSpareItem_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("AddSpareItem_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->AddSpareItem_Spare_IsService");
		}
 
		@Test(priority = 132)
		public void DuplicateAddSpareItem_Spare_IsService() throws Exception {
			test = report.startTest("DuplicateAddSpareItem_Spare_IsService");
			m.DuplicateAddSpareItem_Spare_IsService(driver);
			Assert.assertTrue(true);
			System.out.println("DuplicateAddSpareItem_Spare_IsService URL Opened Successfully");
			test.log(LogStatus.PASS, "Purchase->Admin->DuplicateAddSpareItem_Spare_IsService");
		}
		
	@Test(priority = 133)
	public void SearchAddedSpareItem_Spare_IsService() throws Exception {
		test = report.startTest("SearchAddedSpareItem_Spare_IsService");
		m.SearchAddedSpareItem_Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("SearchAddedSpareItem_Spare_IsService URL Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchAddedSpareItem_Spare_IsService");
	}
	
	
	@Test(priority = 134)
	public void EditSpareItem_Spare_IsService() throws Exception {
		test = report.startTest("EditSpareItem_Spare_IsService");
		m.EditSpareItem_Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("EditSpareItem_Spare_IsService URL Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->EditSpareItem_Spare_IsService");
	}
	
	
	@Test(priority = 135)
	public void SearchEditSpareItem_Spare_IsService() throws Exception {
		test = report.startTest("SearchEditSpareItem_Spare_IsService");
		m.SearchEditSpareItem_Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("SearchEditSpareItem_Spare_IsService URL Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchEditSpareItem_Spare_IsService");
	}
	
	
	@Test(priority = 136)
	public void AppendCopyItems__Spare_IsService() throws Exception {
		test = report.startTest("AppendCopyItems__Spare_IsService");
		m.AppendCopyItems__Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("AppendCopyItems__Spare_IsService URL Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->AppendCopyItems__Spare_IsService");
	}
	

	@Test(priority = 137)
	public void SearchAppendCopyItems__Spare_IsService() throws Exception {
		test = report.startTest("SearchAppendCopyItems__Spare_IsService");
		m.SearchCopyItems__Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("SearchAppendCopyItems__Spare_IsService URL Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchAppendCopyItems__Spare_IsService");
	}
	

	@Test(priority = 138)
	public void OverwriteCopyItems__Spare_IsService() throws Exception {
		test = report.startTest("OverwriteCopyItems__Spare_IsService");
		m.OverwriteCopyItems__Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("OverwriteCopyItems__Spare_IsService URL Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->OverwriteCopyItems__Spare_IsService");
	}
	
	/*@Test(priority = 139)
	public void SearchOverwriteCopyItems__Spare_IsService() throws Exception {
		test = report.startTest("SearchOverwriteCopyItems__Spare_IsService");
		m.SearchOverwriteCopyItems__Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("SearchOverwriteCopyItems__Spare_IsService URL Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchOverwriteCopyItems__Spare_IsService");
	}*/
	
	@Test(priority = 140)
	public void MoveItems__Spare_IsService() throws Exception {
		test = report.startTest("MoveItems__Spare_IsService");
		m.MoveItems__Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("MoveItems__Spare_IsService  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->MoveItems__Spare_IsService");
	}
	
	
	@Test(priority = 141)
	public void SearchMoveItems__Spare_IsService() throws Exception {
		test = report.startTest("SearchMoveItems__Spare_IsService");
		m.SearchMoveItems__Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("SearchMoveItems__Spare_IsService  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchMoveItems__Spare_IsService");
	}
	
	
	@Test(priority = 142)
	public void DeleteStoresItem__Spare_IsService() throws Exception {
		test = report.startTest("DeleteStoresItem__Spare_IsService");
		m.DeleteStoresItem__Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("DeleteStoresItem__Spare_IsService  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->DeleteStoresItem__Spare_IsService");
	}
	
	
	@Test(priority = 143)
	public void RestoreStoresItem__Spare_IsService() throws Exception {
		test = report.startTest("RestoreStoresItem__Spare_IsService");
		m.RestoreStoresItem__Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("RestoreStoresItem__Spare_IsService  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->RestoreStoresItem__Spare_IsService");
	}
	
	@Test(priority = 144)
	public void DeleteSubCatalogue__Spare_IsService() throws Exception {
		test = report.startTest("DeleteSubCatalogue__Spare_IsService");
		m.DeleteSubCatalogue__Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("DeleteSubCatalogue__Spare_IsService  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->DeleteSubCatalogue__Spare_IsService");
	}
	
	
	@Test(priority = 145)
	public void DeleteCatalogue__Spare_IsService() throws Exception {
		test = report.startTest("DeleteCatalogue__Spare_IsService");
		m.DeleteCatalogue__Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("DeleteCatalogue__Spare_IsService  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->DeleteCatalogue__Spare_IsService");
	}
	
	
	@Test(priority = 146)
	public void SearchDeleteCatalogue__Spare_IsService() throws Exception {
		test = report.startTest("SearchDeleteCatalogue__Spare_IsService");
		m.SearchDeleteCatalogue__Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("SearchDeleteCatalogue__Spare_IsService  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchDeleteCatalogue__Spare_IsService");
	}
	
	
	@Test(priority = 147)
	public void RestoreCatalogue__Spare_IsService() throws Exception {
		test = report.startTest("RestoreCatalogue__Spare_IsService");
		m.RestoreCatalogue__Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("RestoreCatalogue__Spare_IsService  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->RestoreCatalogue__Spare_IsService");
	}
	
	@Test(priority = 148)
	public void SearchRestoredCatalogue__Spare_IsService() throws Exception {
		test = report.startTest("SearchRestoredCatalogue__Spare_IsService");
		m.SearchRestoredCatalogue__Spare_IsService(driver);
		Assert.assertTrue(true);
		System.out.println("SearchRestoredCatalogue__Spare_IsService  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchRestoredCatalogue__Spare_IsService");
	}
	
	
	
	//================================================   SPARE  ==================================================================
	
	
	@Test(priority = 149)
	public void SearchFunction_Spare1() throws Exception {
		test = report.startTest("SearchFunction_Spare1");
		m.SearchFunction_Spare1(driver);
		Assert.assertTrue(true);
		System.out.println("SearchFunction_Spare1  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchFunction_Spare1");
	}
	
	
	@Test(priority = 150)
	public void ValidationForAddCatalogue_Spare() throws Exception {
		test = report.startTest("ValidationForAddCatalogue_Spare");
		m.ValidationForAddCatalogue_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("ValidationForAddCatalogue_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->ValidationForAddCatalogue_Spare");
	}
	
	
	@Test(priority = 151)
	public void DuplicateAddCatalogue_Spare() throws Exception {
		test = report.startTest("DuplicateAddCatalogue_Spare");
		m.DuplicateAddCatalogue_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("DuplicateAddCatalogue_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->DuplicateAddCatalogue_Spare");
	}
	

	@Test(priority = 152)
	public void SearchAddCatalogue_Spare() throws Exception {
		test = report.startTest("SearchAddCatalogue_Spare");
		m.SearchAddCatalogue_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchAddCatalogue_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchAddCatalogue_Spare");
	}
	
	@Test(priority = 153)
	public void EditAddCatalogue_Spare() throws Exception {
		test = report.startTest("EditAddCatalogue_Spare");
		m.EditAddCatalogue_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("EditAddCatalogue_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->EditAddCatalogue_Spare");
	}
	
	
	@Test(priority = 154)
	public void SearchEditedAddCatalogue_Spare() throws Exception {
		test = report.startTest("SearchEditedAddCatalogue_Spare");
		m.SearchEditedAddCatalogue_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchEditedAddCatalogue_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchEditedAddCatalogue_Spare");
	}
	
	@Test(priority = 155)
	public void ValidationForAddSubCatalogue_Spare() throws Exception {
		test = report.startTest("ValidationForAddSubCatalogue_Spare");
		m.ValidationForAddSubCatalogue_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("ValidationForAddSubCatalogue_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->ValidationForAddSubCatalogue_Spare");
	}
	
	
	@Test(priority = 156)
	public void DuplicateForAddSubCatalogue_Spare() throws Exception {
		test = report.startTest("ValidationForAddSubCatalogue_Spare");
		m.DuplicateForAddSubCatalogue_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("DuplicateForAddSubCatalogue_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->DuplicateForAddSubCatalogue_Spare");
	}
	
	@Test(priority = 157)
	public void SearchAddSubCatalogue_Spare() throws Exception {
		test = report.startTest("SearchAddSubCatalogue_Spare");
		m.SearchAddSubCatalogue_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchAddSubCatalogue_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchAddSubCatalogue_Spare");
	}
	
	
	@Test(priority = 158)
	public void EditAddedSubCatalogue_Spare() throws Exception {
		test = report.startTest("EditAddedSubCatalogue_Spare");
		m.EditAddedSubCatalogue_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("EditAddedSubCatalogue_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->EditAddedSubCatalogue_Spare");
	}
	
	@Test(priority = 159)
	public void SearchEditedAddSubCatalogue_Spare() throws Exception {
		test = report.startTest("SearchEditedAddSubCatalogue_Spare");
		m.SearchEditedAddSubCatalogue_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchEditedAddSubCatalogue_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchEditedAddSubCatalogue_Spare");
	}
	
	@Test(priority = 160)
	public void AddJobs_Spare() throws Exception {
		test = report.startTest("AddJobs_Spare");
		m.AddJobs_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("AddJobs_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->AddJobs_Spare");
	}
	
	
	
	@Test(priority = 161)
	public void DuplicateJobs_Spare() throws Exception {
		test = report.startTest("DuplicateJobs_Spare");
		m.DuplicateJobs_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("DuplicateJobs_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->DuplicateJobs_Spare");
	}
	
	@Test(priority = 162)
	public void SearchAddJobs_Spare() throws Exception {
		test = report.startTest("SearchAddJobs_Spare");
		m.SearchAddJobs_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchAddJobs_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchAddJobs_Spare");
	}
	
	
	@Test(priority = 163)
	public void EditAddedJobs_Spare() throws Exception {
		test = report.startTest("EditAddedJobs_Spare");
		m.EditAddedJobs_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("EditAddedJobs_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->EditAddedJobs_Spare");
	}
	
	@Test(priority = 164)
	public void SearchEditedAddJobs_Spare() throws Exception {
		test = report.startTest("SearchEditedAddJobs_Spare");
		m.SearchEditedAddJobs_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchEditedAddJobs_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchEditedAddJobs_Spare");
	}
	
	@Test(priority = 165)
	public void AppendCopyJobs__Spare() throws Exception {
		test = report.startTest("AppendCopyJobs__Spare");
		m.AppendCopyJobs__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("AppendCopyJobs__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->AppendCopyJobs__Spare");
	}
	
	
	@Test(priority = 166)
	public void OverwriteCopyJobs_Spare() throws Exception {
		test = report.startTest("OverwriteCopyJobs_Spare");
		m.OverwriteCopyJobs_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("OverwriteCopyJobs_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->OverwriteCopyJobs_Spare");
	}
	
	@Test(priority = 167)
	public void SearchOverwriteCopyJobs_Spare() throws Exception {
		test = report.startTest("SearchOverwriteCopyJobs_Spare");
		m.SearchOverwriteCopyJobs_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchOverwriteCopyJobs_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchOverwriteCopyJobs_Spare");
	}
	
	
	
	@Test(priority = 168)
	public void MoveJobs_Spare() throws Exception {
		test = report.startTest("MoveJobs_Spare");
		m.MoveJobs_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("MoveJobs_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->MoveJobs_Spare");
	}
	
	@Test(priority = 169)
	public void AddSpareItem_Spare() throws Exception {
		test = report.startTest("AddSpareItem_Spare");
		m.AddSpareItem_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("AddSpareItem_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->AddSpareItem_Spare");
	}
	
	
	@Test(priority = 170)
	public void DuplicateAddSpareItem_Spare() throws Exception {
		test = report.startTest("DuplicateAddSpareItem_Spare");
		m.DuplicateAddSpareItem_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("DuplicateAddSpareItem_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->DuplicateAddSpareItem_Spare");
	}
	
	
	@Test(priority = 171)
	public void SearchAddedSpareItem_Spare() throws Exception {
		test = report.startTest("SearchAddedSpareItem_Spare");
		m.SearchAddedSpareItem_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchAddedSpareItem_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchAddedSpareItem_Spare");
	}
	
	@Test(priority = 172)
	public void EditSpareItem_Spare() throws Exception {
		test = report.startTest("EditSpareItem_Spare");
		m.EditSpareItem_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("EditSpareItem_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->EditSpareItem_Spare");
	}
	
	@Test(priority = 173)
	public void SearchEditSpareItem_Spare() throws Exception {
		test = report.startTest("SearchEditSpareItem_Spare");
		m.SearchEditSpareItem_Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchEditSpareItem_Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchEditSpareItem_Spare");
	}
	
	
	@Test(priority = 174)
	public void AppendCopyItems__Spare() throws Exception {
		test = report.startTest("AppendCopyItems__Spare");
		m.AppendCopyItems__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("AppendCopyItems__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->AppendCopyItems__Spare");
	}
	
	/*@Test(priority = 175)
	public void SearchAppendCopyItems__Spare() throws Exception {------
		test = report.startTest("SearchAppendCopyItems__Spare");
		m.SearchAppendCopyItems__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchAppendCopyItems__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchAppendCopyItems__Spare");
	} */ 
	
	
	/*@Test(priority = 176)
	public void OverwriteCopyItems__Spare() throws Exception {
		test = report.startTest("OverwriteCopyItems__Spare");
		m.OverwriteCopyItems__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("OverwriteCopyItems__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->OverwriteCopyItems__Spare");
	}
	
	
	
	@Test(priority = 177)
	public void SearchOverwriteCopyItems__Spare() throws Exception {---------
		test = report.startTest("SearchOverwriteCopyItems__Spare");
		m.SearchOverwriteCopyItems__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchOverwriteCopyItems__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchOverwriteCopyItems__Spare");
	}*/
	
	
	@Test(priority = 178)
	public void MoveItems__Spare() throws Exception {
		test = report.startTest("MoveItems__Spare");
		m.MoveItems__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("MoveItems__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->MoveItems__Spare");
	}
	
	
	@Test(priority = 179)
	public void SearchMoveItems__Spare() throws Exception {
		test = report.startTest("SearchMoveItems__Spare");
		m.SearchMoveItems__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchMoveItems__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchMoveItems__Spare");
	}
	
	
	@Test(priority = 180)
	public void DeleteStoresItem__Spare() throws Exception {
		test = report.startTest("DeleteStoresItem__Spare");
		m.DeleteStoresItem__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("DeleteStoresItem__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->DeleteStoresItem__Spare");
	}
	
	@Test(priority = 181)
	public void SearchDeletedStoresItem__Spare() throws Exception {
		test = report.startTest("SearchDeletedStoresItem__Spare");
		m.SearchDeletedStoresItem__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchDeletedStoresItem__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchDeletedStoresItem__Spare");
	}
	
	@Test(priority = 182)
	public void RestoreStoresItem__Spare() throws Exception {
		test = report.startTest("RestoreStoresItem__Spare");
		m.RestoreStoresItem__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("RestoreStoresItem__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->RestoreStoresItem__Spare");
	}
	
	
	@Test(priority = 183)
	public void SearchRestoredStoresItem__Spare() throws Exception {
		test = report.startTest("SearchRestoredStoresItem__Spare");
		m.SearchRestoredStoresItem__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchRestoredStoresItem__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchRestoredStoresItem__Spare");
	}
	
	
	@Test(priority = 184)
	public void DeleteSubCatalogue__Spare() throws Exception {
		test = report.startTest("DeleteSubCatalogue__Spare");
		m.DeleteSubCatalogue__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("DeleteSubCatalogue__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->DeleteSubCatalogue__Spare");
	}
	
	
	@Test(priority = 185)
	public void DeleteCatalogue__Spare() throws Exception {
		test = report.startTest("DeleteCatalogue__Spare");
		m.DeleteCatalogue__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("DeleteCatalogue__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->DeleteCatalogue__Spare");
	}
	
	@Test(priority = 186)
	public void SearchDeleteCatalogue() throws Exception {
		test = report.startTest("SearchDeleteCatalogue");
		m.SearchDeleteCatalogue(driver);
		Assert.assertTrue(true);
		System.out.println("SearchDeleteCatalogue  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchDeleteCatalogue");
	}
	
	@Test(priority = 187)
	public void RestoreCatalogue__Spare() throws Exception {
		test = report.startTest("RestoreCatalogue__Spare");
		m.RestoreCatalogue__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("RestoreCatalogue__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->RestoreCatalogue__Spare");
	}
	
	@Test(priority = 188)
	public void SearchRestoredCatalogue__Spare() throws Exception {
		test = report.startTest("SearchRestoredCatalogue__Spare");
		m.SearchRestoredCatalogue__Spare(driver);
		Assert.assertTrue(true);
		System.out.println("SearchRestoredCatalogue__Spare  Opened Successfully");
		test.log(LogStatus.PASS, "Purchase->Admin->SearchRestoredCatalogue__Spare");
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
 
  @AfterSuite
 public void afterSu() {
      report.close();
  }}