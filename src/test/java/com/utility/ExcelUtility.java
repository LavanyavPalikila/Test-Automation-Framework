package com.utility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ui.pojos.User;

public class ExcelUtility {

	public static Iterator<User> readExcelFile(String filename) {
		
		File xlsxFile = new File(System.getProperty("user.dir")+ "\\testData\\" + filename);
		XSSFWorkbook xlsxWorkbook = null;
		List<User> userList = null;
		Iterator<Row> rowIterator;
		Cell emailAddressCell;
		Cell passwordCell;
		XSSFSheet sheet;
		try {
			xlsxWorkbook = new XSSFWorkbook(xlsxFile);
			sheet =  xlsxWorkbook.getSheet("LoginTestData");
			userList = new ArrayList<User>();
			rowIterator = sheet.iterator();
			rowIterator.next();
			
			while(rowIterator.hasNext()) {
				Row row = rowIterator.next();
				 emailAddressCell = row.getCell(0);
				 passwordCell = row.getCell(1);
				User user = new User(emailAddressCell.toString(), passwordCell.toString());
				userList.add(user);
				xlsxWorkbook.close();
			}
		} 
		catch (InvalidFormatException | IOException e) {
			e.printStackTrace();
		}
		return userList.iterator();
	}

}
