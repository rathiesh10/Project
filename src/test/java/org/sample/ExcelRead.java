package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
   public static void main(String[] args) throws IOException {
	File f = new File("C:\\Users\\rathiesh10\\eclipse-workspace\\framework\\testData\\student data.xlsx");
	  FileInputStream fin = new FileInputStream(f); 
	 Workbook w = new XSSFWorkbook(fin);
	  Sheet s = w.getSheet("Greens"); 
	  Row r = s.getRow(1);
	  Cell c = r.getCell(0);
	   System.out.println(c);
	   
	   
	   int prows = s.getPhysicalNumberOfRows();
	   System.out.println("physical number of rowv : "+ prows);
	   
	   int pcell = r.getPhysicalNumberOfCells();
	   System.out.println("physical number of cells: "+pcell);
	   
	   
	   for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		    Row row = s.getRow(i);
	
	   for (int j = 0; j <row.getPhysicalNumberOfCells(); j++) {
		   Cell cell = row.getCell(j);
		   
		  int cellType = cell.getCellType();
		//order formatting  
//		 if (cellType==1) {
//			  String value = cell.getStringCellValue();
//			  System.out.println(value);
//		}
//			 else if (cellType==0) {
//				 
//				 if (DateUtil.isCellDateFormatted(cell)) {
//					  Date d = cell.getDateCellValue();
//		  SimpleDateFormat sim = new SimpleDateFormat( "dd,MMMM,yyyy");
//		        String value = sim.format(d);
//		        System.out.println(value);
//			    
//			}else {
//				double d = cell.getNumericCellValue();
//				long l = (long)d;
//				String value = String.valueOf(l);
//				System.out.println(value);
//	}
//			 }
//	   }
//	   }
	   
	//to read and update excel   
	   
	   
	    if (cellType==1) {
			String value = cell.getStringCellValue();
			if (value.equals("SQL")) {
				cell.setCellValue("cucumber");
				FileOutputStream fout = new FileOutputStream(f);
				w.write(fout);
				System.out.println("done");
			}
		}
			
		
	   
   }
   
   
   
   
   
   
   
   
   
	   
}
	   
   }	   
} 
	   
	   
	   
	  
	   
	   

   

