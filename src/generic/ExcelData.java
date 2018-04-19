package generic;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData 
{
	//To get the data
	public static String getData(String pathname,String sheetName, int row,int cell)
	{
		try
		{
			FileInputStream file=new FileInputStream(new File(pathname));
			  Workbook wb = WorkbookFactory.create(file);
			  String data=wb.getSheet(sheetName).getRow(row).getCell(cell).toString();
			  return data;
		}
		catch(Exception e)
		{
			return "";
		}
	}
	public static int getRowCount(String pathname,String sheetname)
	{
		try
		{
			FileInputStream file=new FileInputStream(new File(pathname));
			 Workbook wb = WorkbookFactory.create(file);
			 int rc = wb.getSheet(sheetname).getLastRowNum();
			return rc;
		}
		catch(Exception e)
		{
			return 0;
		}
	}
	public static int getColCount(String pathname,String sheetname, int row)
	{
		try
		{
		FileInputStream file=new FileInputStream(new File(pathname));
		 Workbook wb = WorkbookFactory.create(file);
		 int cc = wb.getSheet(sheetname).getRow(row).getLastCellNum();
		return cc;
		}
		catch(Exception e)
		{
			return 0;
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
