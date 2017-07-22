package purchase_Admin;

import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import common_Function.RW;
public class PurchaseSettings extends RW{

	 
	
	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { //allow only one thread to access the shared resource,To prevent thread interference.
	    if (report == null) {
	    	report = new ExtentReports(path.concat("Report\\Purchase_Admin_Report.html"));
	        
	        report
	            .addSystemInfo("Host Name", "Priti") //Environment Setup For Report
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	}

	public void PurchaseConfigsettingsURL(WebDriver driver1) throws Exception {  //(priority=22)

		WebDriver driver = driver1;
		
		
		 
	     ArrayList<Row> row= OR_Purchase_m.searchSheet("PurchaseConfigsettingsURL",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
	     ArrayList<Row> row1=input_purc_m.searchSheet("PurchaseConfigsettingsURL", 2,0);//Functn key, sheet no,//test data excel
	 	

		 //  URL Path Concat
			 String input_purc_URL =url.concat(input_purc_m.getData(2, 124, 2));
				
		    
		  	for(int i=0;i<row.size();i++)
				{
		 
					String strValue=""; 
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
									  
									  switch(row1.get(j).getCell(2).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
					

						if (row.get(i).getCell(10) != null) {
							
							String strControlTypeKey = row.get(i).getCell(10).toString();
						//	if (driver.getPageSource().contains("Log Out")) {	
							if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
								
								driver.get(input_purc_URL);
								Thread.sleep(2000);
								
								String actualTitle = driver.getTitle().trim();
								
							 	String expectedTitle = " 	Purchase Configuration Settings ".trim();
							 	
								Assert.assertEquals(expectedTitle,actualTitle);
								if(expectedTitle.equals(actualTitle)){
							 		System.out.println("Title Match");
							 		Thread.sleep(2000);
							 	}	else{
							 		System.out.println("Title does not Match");
							 		Thread.sleep(2000);	
							 		
							 	}
								
							}
							/*else {
								System.out.println("Log out button is not available in page");
							}*/
							
			}
		}}
		

	public void PurchaseAutoSetting(WebDriver driver1) throws Exception { 

		WebDriver driver = driver1;
		    
		     ArrayList<Row> row= OR_Purchase_m.searchSheet("PurchaseAutoSetting",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
		     ArrayList<Row> row1=input_purc_m.searchSheet("PurchaseAutoSetting", 2,0);//Functn key, sheet no,//test data excel
		 	

		  
			    
				for(int i=0;i<row.size();i++)
				{
					String strValue=""; 
					String LocatorType=row.get(i).getCell(1).getStringCellValue();
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
									  
									  switch(row1.get(j).getCell(2).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
					
						
						if(row.get(i).getCell(10)!=null)
						{
								
							
							String strControlTypeKey=row.get(i).getCell(10).toString();

							if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
								if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
									click_element(driver, LocatorType, strControl); 
									Thread.sleep(4000);
								}

								if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
									
									dropdown(driver, LocatorType, strControl, strValue);
									Thread.sleep(2000);
									
								}


								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver, LocatorType, strControl); 
									Thread.sleep(4000);
									Alert(driver);
									Thread.sleep(4000);
								}
								
								
						}
				}
				}
	}
	

	public void PurchaseConfigSetting(WebDriver driver1) throws Exception {  

		WebDriver driver = driver1;
		       
		     ArrayList<Row> row= OR_Purchase_m.searchSheet("PurchaseConfigSetting",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
		     ArrayList<Row> row1=input_purc_m.searchSheet("PurchaseConfigSetting", 2,0);//Functn key, sheet no,//test data excel
		 	



				for(int i=0;i<row.size();i++)
				{
					String strValue=""; 
					String LocatorType=row.get(i).getCell(1).getStringCellValue();
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
									  
									  switch(row1.get(j).getCell(2).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
					
							
						
						

					 					
						
						if(row.get(i).getCell(10)!=null)
						{
								
							
							String strControlTypeKey=row.get(i).getCell(10).toString();

							if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
								if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
									click_element(driver, LocatorType, strControl); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
									sendkeys(driver, LocatorType, strControl, strValue); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver, LocatorType, strControl); 
									Thread.sleep(2000);
									Alert(driver);
									Thread.sleep(2000);
								}
								
							
								if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
									clear_element(driver, LocatorType, strControl); 																										
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Chechbox_Ctrl") == 0) {
									checkbox_element(driver, LocatorType, strControl); 
									Thread.sleep(2000);
								}
								
						}
				}
				}
				}
		
	

			
					
	public void PurchaseMandatory(WebDriver driver1) throws Exception {

		WebDriver driver = driver1;
		
		
		  ArrayList<Row> row= OR_Purchase_m.searchSheet("PurchaseMandatory",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
		     ArrayList<Row> row1=input_purc_m.searchSheet("PurchaseMandatory", 2,0);//Functn key, sheet no,//test data excel
		 	


			    
				for(int i=0;i<row.size();i++)
				{
					String strValue=""; 
					String LocatorType=row.get(i).getCell(1).getStringCellValue();
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
									  
									  switch(row1.get(j).getCell(2).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
					
						
						if(row.get(i).getCell(10)!=null)
						{
								
							
							String strControlTypeKey=row.get(i).getCell(10).toString();

							if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
								if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
									click_element(driver, LocatorType, strControl); 
									Thread.sleep(2000);
								}

								
							

								if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
									sendkeys(driver, LocatorType, strControl, strValue); 
									Thread.sleep(2000);
								}

								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver, LocatorType, strControl); 
									Thread.sleep(2000);
									Alert(driver);
									Thread.sleep(4000);
								}
								if (strControlTypeKey.compareTo("Chechbox_Ctrl") == 0) {
									checkbox_element(driver, LocatorType, strControl); 
									Thread.sleep(2000);
								}
								
								

								
							
						}
				}
				}
				}
		
		
	
	public void CaptureRank(WebDriver driver1) throws Exception {  

		WebDriver driver = driver1;

		  ArrayList<Row> row= OR_Purchase_m.searchSheet("CaptureRank",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
		     ArrayList<Row> row1=input_purc_m.searchSheet("CaptureRank", 2,0);//Functn key, sheet no,//test data excel
		 	


			    
				for(int i=0;i<row.size();i++)
				{
					String strValue=""; 
					String LocatorType=row.get(i).getCell(1).getStringCellValue();
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
									  
									  switch(row1.get(j).getCell(2).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
					
						
						if(row.get(i).getCell(10)!=null)
						{
								
							
							String strControlTypeKey=row.get(i).getCell(10).toString();

							if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
								if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
									click_element(driver, LocatorType, strControl); 
									Thread.sleep(4000);
								}

								if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
									
									dropdown(driver, LocatorType, strControl, strValue);
									Thread.sleep(2000);						
									
								}

								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver, LocatorType, strControl); 
									Thread.sleep(2000);
									Alert(driver);
									Thread.sleep(2000);
								}
								if (strControlTypeKey.compareTo("Chechbox_Ctrl") == 0) {
									checkbox_element(driver, LocatorType, strControl); 
									Thread.sleep(2000);
								}

								
						
						}
				}
				}
				}
		
	
	public void AutomaticRequisition(WebDriver driver1) throws Exception { 

		WebDriver driver = driver1;
		    
		     ArrayList<Row> row= OR_Purchase_m.searchSheet("AutomaticRequisition",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
		     ArrayList<Row> row1=input_purc_m.searchSheet("AutomaticRequisition", 2,0);//Functn key, sheet no,//test data excel
		 	


			    
				for(int i=0;i<row.size();i++)
				{
					String strValue="";
					String LocatorType=row.get(i).getCell(1).getStringCellValue();
					String strControl=row.get(i).getCell(2).getStringCellValue();
					 for(int j=0;j<row1.size();j++)
					 {
						 if(row.get(i).getCell(0)!=null)
							{
							
							 	if(row1.get(j).getCell(1)!=null)
								{
								  if(row.get(i).getCell(0).toString().compareTo(row1.get(j).getCell(1).toString())==0)
								  {
									  strValue=row1.get(j).getCell(2).toString();
									  
									  switch(row1.get(j).getCell(2).getCellTypeEnum()){
									     
									     case NUMERIC: 
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getNumericCellValue());
									    	 break;
									     case STRING:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     case BOOLEAN:
									    	 strValue=String.valueOf(row1.get(j).getCell(2).getBooleanCellValue());
									    	 break;
									     default:
									    	 strValue=row1.get(j).getCell(2).getStringCellValue();
									    	 break;
									     }
									     
								  }
								}
							}
					 
					 }
					 
					
						
						if(row.get(i).getCell(10)!=null)
						{
								
							
							String strControlTypeKey=row.get(i).getCell(10).toString();

							if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
								if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
									click_element(driver, LocatorType, strControl); 
									Thread.sleep(4000);
								}

								if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
									
									dropdown(driver, LocatorType, strControl, strValue);
									Thread.sleep(2000);
									
								}


								if (strControlTypeKey.compareTo("Alert_accept") == 0) {
									click_element(driver, LocatorType, strControl); 
									Thread.sleep(4000);
									Alert(driver);
									Thread.sleep(4000);
								}
								if (strControlTypeKey.compareTo("Chechbox_Ctrl") == 0) {
									checkbox_element(driver, LocatorType, strControl); 
									Thread.sleep(2000);
								}

								

								
								
								
						}
				}}
				}
				
}