import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	public ArrayList<String> getdata(String testcasename) throws IOException 
	{
		
		ArrayList<String>a=new ArrayList<String>();
		
		FileInputStream fis=new FileInputStream("/Users/ranjithkumar/Downloads/sheet2.xlsx");	
		XSSFWorkbook workboox=new XSSFWorkbook(fis);
			
		int sheets=	workboox.getNumberOfSheets();
		for(int i=0;i<sheets;i++)	
		{
			if(workboox.getSheetName(i).equalsIgnoreCase("sheet1"))
			{
			XSSFSheet sheet=	workboox.getSheetAt(i);
			
	//idendfiy testcase coloumn by scanning the entrie 1st row 		
			
			Iterator<Row> rows= sheet.iterator();// sheets is collection of rows
			Row firstrow=rows.next();
		Iterator<Cell> ce=	firstrow.cellIterator();//row is collection of cells
			int k=0;
			int coloumn=0;
			while(ce.hasNext())
			{
				Cell value=ce.next();
				if(value.getStringCellValue().equalsIgnoreCase("testcase"))
				{
				coloumn=k;	
					
				}
				k++;
			}
			System.out.println(coloumn);

	// once coloumn is identified then scan entrie testcase to identify purchase test case now 		
			
			while(rows.hasNext())
			{
				
				Row r=rows.next();
				if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testcasename))
				{
					
	//after you grap purchase testcase row=pull all the data of tthat row and feed into test				
				
		Iterator<Cell> cv=r.cellIterator();	
				while(cv.hasNext())
				{
				Cell c=cv.next();
				if(c.getCellType() ==CellType.STRING)
				{
				
					a.add(c.getStringCellValue());
				}
				else {
					
					a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
					
				}
				}
				
			}
				
			}
			}
		}
		return a;
		
	}
	

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		
	}

}
