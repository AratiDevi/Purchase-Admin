package Purc_PurchaseProcess;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class PurcProcess_Delivered extends RW{

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

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("Delivered_Search",0,9);





	    ArrayList<Row> row1=input_purc_m.searchSheet("Delivered_Search", 0,0);





	 	
	    
	    //URL Path Concat
		String input_purc_URL =url.concat(input_purc_m.getData(0, 126, 2));
	 	driver.get(input_purc_URL);
	 	Thread.sleep(3000);
	   /* String input_purc_URL =url.concat(input_purc_m.searchSheet("Admin", 0, 2);
	 	driver.get(input_purc_URL);
	 	Thread.sleep(3000);
	    		    */
	    
	    
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
								Thread.sleep(30000);
							}

							if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
							
								dropdown(driver, LocatorType, strControl, strValue);
								Thread.sleep(2000);
							
								
							}

							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								sendkeys(driver, LocatorType, strControl, strValue); 
								Thread.sleep(50000);
							}

							if (strControlTypeKey.compareTo("Alert_accept") == 0) {
								click_element(driver, LocatorType, strControl); 
								Alert(driver);
								Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
								driver.get(strValue); 
								Thread.sleep(2000);

							}

							
							if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

								click_element(driver, LocatorType, strControl);
							 WindowSwitchto(driver);
							 Thread.sleep(2000);
							}

							
							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, LocatorType, strControl); 																										
								Thread.sleep(2000);
							}

							if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
								 gettext(driver, LocatorType, strControl, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}
							if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

								dropdownCheckbox(driver, LocatorType, strControl,strControl,strControl);
			                      Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

							 frameSwitchto(driver, LocatorType, strControl);
			                      Thread.sleep(22000);
							
					}
							if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
							uploadFile(driver,LocatorType, strControl, strControl,strValue, strControl, strControl);
							   Thread.sleep(2000);
								
							}
							
							if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

								 getAttribute(driver, LocatorType, strValue, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}
							if (strControlTypeKey.compareTo("DriverClose_Ctrl") == 0) {


								close_driver(driver);
			                      Thread.sleep(6000);
								}
							
							
					}
			}
			}
			}
	
	
	
	
	public void ViewQuotations(WebDriver driver1) throws Exception {

		 	
		WebDriver driver = driver1;

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("ViewQuotations_Delivered",0,9);


	    ArrayList<Row> row1=input_purc_m.searchSheet("ViewQuotations_Delivered", 0,0);


	    String input_purc_URL =url.concat(input_purc_m.getData(0, 126, 2));
	 	driver.get(input_purc_URL);
	 	Thread.sleep(3000);
	    
	    
	    
	    
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
								Thread.sleep(20000);
							}

							if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
							
								dropdown(driver, LocatorType, strControl, strValue);
								Thread.sleep(2000);
							
								
							}

							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								sendkeys(driver, LocatorType, strControl, strValue); 
								Thread.sleep(5000);
							}

							if (strControlTypeKey.compareTo("Alert_accept") == 0) {
								click_element(driver, LocatorType, strControl); 
								Alert(driver);
								Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
								driver.get(strValue); 
								Thread.sleep(2000);

							}

							
							if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

								click_element(driver, LocatorType, strControl);
							 WindowSwitchto(driver);
							 Thread.sleep(2000);
							}

							
							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, LocatorType, strControl); 																										
								Thread.sleep(2000);
							}

							if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
								 gettext(driver, LocatorType, strControl, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}
							if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

								dropdownCheckbox(driver, LocatorType, strControl,strControl,strControl);
			                      Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

							 frameSwitchto(driver, LocatorType, strControl);
			                      Thread.sleep(26000);
							
					}
							if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
							uploadFile(driver,LocatorType, strControl, strControl,strValue, strControl, strControl);
							   Thread.sleep(6000);
								
							}
							
							if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

								 getAttribute(driver, LocatorType, strValue, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}
					}
			}
			}
			}
	public void ViewEvalution(WebDriver driver1) throws Exception {

	 	
		WebDriver driver = driver1;

	     ArrayList<Row> row= OR_Purchase_m.searchSheet("ViewEvalution",0,9);

	    ArrayList<Row> row1=input_purc_m.searchSheet("ViewEvalution", 0,0);

	 	
	    
	    
	    
	    
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
								Thread.sleep(20000);
							}

							if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
							
								dropdown(driver, LocatorType, strControl, strValue);
								Thread.sleep(2000);
							
								
							}

							if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
								sendkeys(driver, LocatorType, strControl, strValue); 
								Thread.sleep(5000);
							}

							if (strControlTypeKey.compareTo("Alert_accept") == 0) {
								click_element(driver, LocatorType, strControl); 
								Alert(driver);
								Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
								driver.get(strValue); 
								Thread.sleep(2000);

							}

							
							if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

								click_element(driver, LocatorType, strControl);
							 WindowSwitchto(driver);
							 Thread.sleep(2000);
							}

							
							if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
								clear_element(driver, LocatorType, strControl); 																										
								Thread.sleep(2000);
							}

							if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
								 gettext(driver, LocatorType, strControl, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}
							if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

								dropdownCheckbox(driver, LocatorType, strControl,strControl,strControl);
			                      Thread.sleep(2000);
							}
							if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

							 frameSwitchto(driver, LocatorType, strControl);
			                      Thread.sleep(26000);
							
					}
							if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
							uploadFile(driver,LocatorType, strControl, strControl,strValue, strControl, strControl);
							   Thread.sleep(6000);
								
							}
							
							if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

								 getAttribute(driver, LocatorType, strValue, row.get(i + 1).getCell(2).getStringCellValue());
			                      Thread.sleep(6000);
								}
							if (strControlTypeKey.compareTo("DriverClose_Ctrl") == 0) {


								close_driver(driver);
			                      Thread.sleep(6000);
								}
							
					}
			}
			}
			}
}


