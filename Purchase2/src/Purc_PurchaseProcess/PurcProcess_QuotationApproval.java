package Purc_PurchaseProcess;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class PurcProcess_QuotationApproval extends RW{

	private static ExtentReports report;
	public synchronized static ExtentReports getReporter(String filePath) { 
	    if (report == null) {
	        report = new ExtentReports(path.concat("Report.html"));
	      
	        report
	            .addSystemInfo("Host Name", "Reshma") 
	            .addSystemInfo("Environment", "QA");
	    }
	    
	    return report;
	
	
	}
	
	
	public void Search(WebDriver driver1) throws Exception {

		 	
		WebDriver driver = driver1;

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("Search_Qtn_Approv",0,9);

	    ArrayList<Row> row1=input_purc_m.searchSheet("Search_Qtn_Approv", 0,0);

	 	
	    
	    //URL Path Concat
		String input_purc_URL =url.concat(input_purc_m.getData(0, 56, 2));
	 	driver.get(input_purc_URL);
	 	Thread.sleep(3000);
	   /* String input_purc_URL =url.concat(input_purc_m.searchSheet("Admin", 0, 2);
	 	driver.get(input_purc_URL);
	 	Thread.sleep(3000);
	    		    */
	    
	    
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
				 
				
					
					if(row.get(i).getCell(10)!=null)
					{
							
						
						String strControlTypeKey=row.get(i).getCell(10).toString();

						if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
							if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
								click_element(driver, "xpath", strControl); 
								Thread.sleep(20000);
							}

							if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
							
								dropdown(driver, "xpath", strControl, strValue);
								Thread.sleep(2000);
							
								
							}

							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								sendkeys(driver, "xpath", strControl, strValue); 
								Thread.sleep(50000);
							}

							if (strControlTypeKey.compareTo("Alert_accept") == 0) {
								click_element(driver, "xpath", strControl); 
								Alert(driver);
								Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
								driver.get(strValue); 
								Thread.sleep(2000);

							}

							
							if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

								click_element(driver, "xpath", strControl);
							 WindowSwitchto(driver);
							 Thread.sleep(2000);
							}

							
							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, "xpath", strControl); 																										
								Thread.sleep(2000);
							}

							if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
								 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}
							if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

								dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
			                      Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

							 frameSwitchto(driver, "id", strControl);
			                      Thread.sleep(2000);
							
					}
							if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
							uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
							   Thread.sleep(2000);
								
							}
							
							if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

								 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}
					}
			}
			}
			}
	
	public void NoQtnComparison(WebDriver driver1) throws Exception {

	 	
		WebDriver driver = driver1;

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("NoQtnComparison",0,9);
	    ArrayList<Row> row1=input_purc_m.searchSheet("NoQtnComparison", 0,0);
	 	
	    
	    //URL Path Concat
		String input_purc_URL =url.concat(input_purc_m.getData(0, 78, 2));
	 	driver.get(input_purc_URL);
	 	Thread.sleep(3000);
	   /* String input_purc_URL =url.concat(input_purc_m.searchSheet("Admin", 0, 2);
	 	driver.get(input_purc_URL);
	 	Thread.sleep(3000);
	    		    */
	    
	    
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
				 
				
					
					if(row.get(i).getCell(10)!=null)
					{
							
						
						String strControlTypeKey=row.get(i).getCell(10).toString();

						if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
							if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
								click_element(driver, "xpath", strControl); 
								Thread.sleep(40000);
							}

							if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
							
								dropdown(driver, "xpath", strControl, strValue);
								Thread.sleep(2000);
							
								
							}

							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								sendkeys(driver, "xpath", strControl, strValue); 
								Thread.sleep(22000);
							}

							if (strControlTypeKey.compareTo("Alert_accept") == 0) {
								click_element(driver, "xpath", strControl); 
								Alert(driver);
								Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
								driver.get(strValue); 
								Thread.sleep(2000);

							}

							
							if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

								click_element(driver, "xpath", strControl);
							 WindowSwitchto(driver);
							 Thread.sleep(2000);
							}

							
							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, "xpath", strControl); 																										
								Thread.sleep(2000);
							}

							if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
								 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}
							if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

								dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
			                      Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

							 frameSwitchto(driver, "id", strControl);
			                      Thread.sleep(2000);
							
					}
							if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
							uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
							   Thread.sleep(2000);
								
							}
							
							if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

								 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}
							
					if (strControlTypeKey.compareTo("Alert_WindowSwitch_Ctrl") == 0) {

												
						Alert_WindowSwitch(driver);
						Thread.sleep(2000);
					}
					}
			}
			}
			}
	
public void WithQtnComparison(WebDriver driver1) throws Exception {

	 	
		WebDriver driver = driver1;

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("WithQtnComparison",0,9);
	    ArrayList<Row> row1=input_purc_m.searchSheet("WithQtnComparison", 0,0);
	 	
	    
	    //URL Path Concat
		String input_purc_URL =url.concat(input_purc_m.getData(0, 78, 2));
	 	driver.get(input_purc_URL);
	 	Thread.sleep(3000);
	   /* String input_purc_URL =url.concat(input_purc_m.searchSheet("Admin", 0, 2);
	 	driver.get(input_purc_URL);
	 	Thread.sleep(3000);
	    		    */
	    
	    
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
				 
				
					
					if(row.get(i).getCell(10)!=null)
					{
							
						
						String strControlTypeKey=row.get(i).getCell(10).toString();

						if (strControlTypeKey.compareTo("Value_Ctrl") != 0) {
							if (strControlTypeKey.compareTo("Click_Ctrl") == 0) {
								click_element(driver, "xpath", strControl); 
								Thread.sleep(20000);
							}

							if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
							
								dropdown(driver, "xpath", strControl, strValue);
								Thread.sleep(2000);
							
								
							}

							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								sendkeys(driver, "xpath", strControl, strValue); 
								Thread.sleep(22000);
							}

							if (strControlTypeKey.compareTo("Alert_accept") == 0) {
								click_element(driver, "xpath", strControl); 
								Alert(driver);
								
								Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
								driver.get(strValue); 
								Thread.sleep(9000);

							}

							
							if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

								click_element(driver, "xpath", strControl);
							 WindowSwitchto(driver);
							 Thread.sleep(2000);
							}
							
							if (strControlTypeKey.compareTo("Alert_WindowSwitch_Ctrl") == 0) {
								
								click_element(driver, "xpath", strControl); 
								Alert(driver);

								//click_element(driver, "xpath", strControl);
							 WindowSwitchto(driver);
							 Thread.sleep(2000);
							}

							if (strControlTypeKey.compareTo("UrlRefresh_Ctrl") == 0) {

								//click_element(driver, "xpath", strControl);
							 WindowSwitchto(driver);
							 Thread.sleep(2000);
							}
							
							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, "xpath", strControl); 																										
								Thread.sleep(2000);
							}

							if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
								 gettext(driver, "xpath", strControl, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}
							if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

								dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
			                      Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

							 frameSwitchto(driver, "id", strControl);
			                      Thread.sleep(21000);
							
					}
							if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
							uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
							   Thread.sleep(2000);
								
							}
							
							if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

								 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}
					}
			}
			}
			}

}
