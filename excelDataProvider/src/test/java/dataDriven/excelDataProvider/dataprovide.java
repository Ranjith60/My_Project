package dataDriven.excelDataProvider;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.netty.util.internal.ObjectPool;


public class dataprovide {
	
	
	DataFormatter formatter=new DataFormatter();

@Test(dataProvider="driverTest")
public void testcaseData(String greeting,String communication,String id)
{
		System.out.println(greeting+communication+id);
}
	
@DataProvider(name="driverTest")
public Object[][] getData() throws IOException
{
//Object[][]	data= {{"hello","text",1},{"bye","message",143},{"solo","cell",453}};
//return data;
	
	FileInputStream fis=new FileInputStream("/Users/ranjithkumar/Downloads/sheet4.xlsx");
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
    XSSFSheet sheet=wb.getSheetAt(0);
    int rowCount=sheet.getPhysicalNumberOfRows();
    XSSFRow row=sheet.getRow(0);
    int colcount =row.getLastCellNum();
    Object data[][]=new Object[rowCount-1][colcount];
     
    for(int i=0;i<rowCount;i++)
    {
    	row =sheet.getRow(i+1);
    	for(int j=0;j<colcount;j++)
    	{
    		XSSFCell cell=row.getCell(j);
    		data[i][j]=formatter.formatCellValue(cell);
    	}
    	
    }
    return data;
    
    
}
	
}
