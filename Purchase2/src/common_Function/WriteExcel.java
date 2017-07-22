

package common_Function;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.xssf.usermodel.XSSFCell;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	XSSFWorkbook wb;

	XSSFSheet sheet1;

	XSSFCell Cell;


	public WriteExcel(String excelpath) {

		try {

			File src = new File(excelpath); // get the excel  path


			  FileInputStream fis = new FileInputStream(src);	 // get the excel file  path

			  wb = new XSSFWorkbook(fis);			// it loads the workbook

/*			  Workbook wb = Workbook.getWorkbook(fis);*/

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// get the excel Sheet row and column number

	public void writedata(int sheetnumber, int row, int col, String value) throws Exception {
		String path="C:\\Users\\Priti\\workspace\\JiBeAutomationcopy\\"; //Workspace path
		
		File src = new File(path.concat("Excel\\JibeAutomationcopy.xlsx"));
		FileInputStream fis = new FileInputStream(src);

		wb = new XSSFWorkbook(fis);	// it loads the workbook

		sheet1 = wb.getSheetAt(sheetnumber);	// get the sheet index

		sheet1.getRow(row).createCell(col).setCellValue(value); //it is used for write someting in the cell

		FileOutputStream fout = new FileOutputStream(src); // file output where the written excel sheet will save

		wb.write(fout); // write on excel sheet

		fout.flush();

		fout.close(); // close the excel sheet

	}

	/*public void testreport(ITestResult testresult,int sheetnumber, int row, int col,int value) throws Exception
	{
		File src = new File("C:\\Work\\JibeTesting\\Excel\\ReadWrite.xlsx");

		FileInputStream fis = new FileInputStream(src);

		wb = new XSSFWorkbook(fis);

		sheet1 = wb.getSheetAt(sheetnumber);

		sheet1.getRow(row).createCell(col).setCellValue(value);


		FileOutputStream fout = new FileOutputStream(src);



		wb.write(fout);

		fout.flush();

		fout.close();


	}*/


}