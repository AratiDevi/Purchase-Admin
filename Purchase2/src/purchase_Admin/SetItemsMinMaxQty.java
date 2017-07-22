package purchase_Admin;

import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;

import common_Function.RW;

public class SetItemsMinMaxQty extends RW{
	 
		/*Technical
		PMS
		CopyRunHour*/
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

		public void MinMaxQuantity (WebDriver driver1) throws Exception {  //(priority=9)

			WebDriver driver = driver1;
			
			 
		     ArrayList<Row> row= OR_Purchase_m.searchSheet("MinMaxQuantityURL",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
		     ArrayList<Row> row1=input_purc_m.searchSheet("MinMaxQuantityURL", 2,0);//Functn key, sheet no,//test data excel
		 	
		     //  URL Path Concat
				String input_purc_URL =url.concat(input_purc_m.getData(2, 60, 2));
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
					 
					
						
						if (row.get(i).getCell(10) != null) {
							
							String strControlTypeKey = row.get(i).getCell(10).toString();
						//	if (driver.getPageSource().contains("Log Out")) {	
							if (strControlTypeKey.compareTo("Url_Ctrl") == 0) {
								
								driver.get(input_purc_URL);
								Thread.sleep(2000);
								
								String actualTitle = driver.getTitle().trim();
								
							 	String expectedTitle = " 	Min-Max Quantity ".trim();
							 	
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
			
			
								

		public void CatalogueItem(WebDriver driver1) throws Exception {  //(priority=10)

			WebDriver driver = driver1;
			

			  ArrayList<Row> row= OR_Purchase_m.searchSheet("CatalogueItem",2,9);//Functn key,sheetNo.,Column no.// Xpath locator
			     ArrayList<Row> row1=input_purc_m.searchSheet("CatalogueItem",2,0);//Functn key, sheet no,//test data excel
			 	
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
									
									if (strControlTypeKey.compareTo("Dropdown_ctrl") == 0) {
										
										dropdown(driver, LocatorType, strControl, strValue);
										Thread.sleep(2000);															
									}

									

									if (strControlTypeKey.compareTo("SendKey_Ctrl") == 0) {
										sendkeys(driver, LocatorType, strControl, strValue); 
										Thread.sleep(2000);
									}

									if (strControlTypeKey.compareTo("Alert_accept") == 0) {
										click_element(driver, LocatorType, strControl); 
										Alert(driver);
										Thread.sleep(2000);
									}
									
									
									if (strControlTypeKey.compareTo("Clear_Ctrl") == 0) {
										clear_element(driver, LocatorType, strControl); 																										
										Thread.sleep(2000);
									}
									
									if (strControlTypeKey.compareTo("Gettext_Ctrl") == 0) {
										gettext(driver,LocatorType, strControl);
					                      Thread.sleep(2000);
										
										
										}
									
									if (strControlTypeKey.compareTo("ImageClick_Ctrl") == 0) {
										
										 WebElement e = driver.findElement(By.xpath(strControl));   // Certificate Inspection 
							             JavascriptExecutor exe = (JavascriptExecutor) driver;
							             exe.executeScript("arguments[0].click();", e);
							             Thread.sleep(2000);
									
									}	
									
							}
					}
					}
					}}
			
		