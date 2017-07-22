package Purc_PurchaseProcess;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class purc_PendingSupplierConfirmation extends RW{

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
	
	 
	ArrayList<Row> row= OR_Purchase_m.searchSheet("Search_Supplier",0,9);

    ArrayList<Row> row1=input_purc_m.searchSheet("Search_Supplier", 0,0);

 	

    //URL Path Concat
	String input_purc_URL =url.concat(input_purc_m.getData(0, 112, 2));
 	driver.get(input_purc_URL);
 	Thread.sleep(3000);
     
 

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
						Thread.sleep(30000);
					}

					if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
					
						dropdown(driver, "xpath", strControl, strValue);
						Thread.sleep(5000);
					
						
					}

					if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
						sendkeys(driver, "xpath", strControl, strValue); 
						Thread.sleep(60000);
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

					/*if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
						 gettext(driver, "xpath", strControl);
	                      Thread.sleep(6000);
						}*/
					if (strControlTypeKey.compareTo("DropdownCheckBox_Ctrl") == 0) {

						dropdownCheckbox(driver, "xpath", strControl,strControl,strControl);
	                      Thread.sleep(2000);
					}
					if (strControlTypeKey.compareTo("FrameSwitch_Ctrl") == 0) {

					 frameSwitchto(driver, "xpath", strControl);
	                      Thread.sleep(2000);
					
			}
					if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
					uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
					   Thread.sleep(2000);
						
					}
				
			}
	}
	}
	}


public void ResendPOtosupplier(WebDriver driver1) throws Exception {  


	WebDriver driver = driver1;
	
	ArrayList<Row> row= OR_Purchase_m.searchSheet("ResendPOtosupplier",0,9);
    ArrayList<Row> row1=input_purc_m.searchSheet("ResendPOtosupplier", 0,0);
 	
    /*//URL Path Concat
   	String input_purc_URL =url.concat(input_purc_m.getData(0, 112, 2));
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
						Thread.sleep(30000);
					}

					if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
					
						dropdown(driver, "xpath", strControl, strValue);
						Thread.sleep(5000);
					
						
					}

					if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
						sendkeys(driver, "xpath", strControl, strValue); 
						Thread.sleep(2000);
					}

					if (strControlTypeKey.compareTo("DriverClose_Ctrl") == 0) {
						close_driver(driver); 
						Thread.sleep(2000);
					}

					if (strControlTypeKey.compareTo("Alert_accept") == 0) {
						click_element(driver, "xpath", strControl); 
						Alert(driver);
						
						Thread.sleep(12000);
						//Alert(driver);
					}
					if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
						driver.get(strValue); 
						Thread.sleep(2000);

					}

					
					if (strControlTypeKey.compareTo("WindowSwitch_Ctrl") == 0) {

						click_element(driver, "xpath", strControl);
						//Thread.sleep(6000);
					 WindowSwitchto(driver);
					 Thread.sleep(36000);
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
	                      Thread.sleep(25000);
					
			}
					if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
					uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
					   Thread.sleep(2000);
						
					}
				/*	
					if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

						 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
	                      Thread.sleep(6000);
						}*/
			}
	}
	}
	}

public void ConfirmPo(WebDriver driver1) throws Exception {  


	WebDriver driver = driver1;
	
	 
	ArrayList<Row> row= OR_Purchase_m.searchSheet("ConfirmPo",0,9);
    ArrayList<Row> row1=input_purc_m.searchSheet("ConfirmPo", 0,0);
 	
   
 

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
						Thread.sleep(2000);
					}

					if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
					
						dropdown(driver, "xpath", strControl, strValue);
						Thread.sleep(5000);
					
						
					}

					if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
						sendkeys(driver, "xpath", strControl, strValue); 
						Thread.sleep(2000);
					}


					if (strControlTypeKey.compareTo("Alert_accept") == 0) {
						click_element(driver, "xpath", strControl); 
						Alert(driver);
						
						Thread.sleep(2000);
						Alert(driver);
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
					
				/*	if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

						 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
	                      Thread.sleep(6000);
						}*/
			}
	}
	}
	}



public void CancelItemsinPO(WebDriver driver1) throws Exception {  


WebDriver driver = driver1;

 
ArrayList<Row> row= OR_Purchase_m.searchSheet("CancelItemsinPO",0,9);

ArrayList<Row> row1=input_purc_m.searchSheet("CancelItemsinPO", 0,0);


	
 


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
					Thread.sleep(2000);
				}

				if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
				
					dropdown(driver, "xpath", strControl, strValue);
					Thread.sleep(5000);
				
					
				}

				if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
					sendkeys(driver, "xpath", strControl, strValue); 
					Thread.sleep(2000);
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
				
				/*if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

					 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
                      Thread.sleep(6000);
					}*/
		}
}
}
}

public void CancelPO(WebDriver driver1) throws Exception {  


WebDriver driver = driver1;

 
ArrayList<Row> row= OR_Purchase_m.searchSheet("CancelPO_PendingSupplier",0,9);


ArrayList<Row> row1=input_purc_m.searchSheet("CancelPO_PendingSupplier", 0,0);


	
	
 


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
					Thread.sleep(9000);
				}

				if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
				
					dropdown(driver, "xpath", strControl, strValue);
					Thread.sleep(5000);
				
					
				}

				if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
					sendkeys(driver, "xpath", strControl, strValue); 
					Thread.sleep(5000);
				}

				if (strControlTypeKey.compareTo("Alert_accept") == 0) {
					click_element(driver, "xpath", strControl); 
					Alert(driver);
					Thread.sleep(2000);
				}
				if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
					driver.get(strValue); 
					Thread.sleep(4000);

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
                      Thread.sleep(4000);
				
		}
				if (strControlTypeKey.compareTo("Upload_Ctrl") == 0) {
				uploadFile(driver,"xpath", strControl, strControl,strValue, strControl, strControl);
				   Thread.sleep(2000);
					
				}
				
				/*if (strControlTypeKey.compareTo("GetAttribute_Ctrl") == 0) {

					 getAttribute(driver, "xpath", strValue, row.get(i + 1).getCell(2).getStringCellValue());
                      Thread.sleep(6000);
					}*/
		}
}
}
}

}
