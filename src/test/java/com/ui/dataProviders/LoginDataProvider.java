package com.ui.dataProviders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.google.gson.Gson;
import com.ui.pojos.TestData;
import com.ui.pojos.User;
import com.utility.CSVUtility;
import com.utility.ExcelUtility;

public class LoginDataProvider {

	
	@DataProvider(name =  "LoginDataProvider")
	public Iterator<Object[]> loginDataProvider() throws FileNotFoundException {
		
		Gson gson = new Gson();
		File testdataFile = new File(System.getProperty("user.dir") + "\\testData\\"+ "logindata.json");
		FileReader fileReader = new FileReader(testdataFile);
		TestData data =	gson.fromJson(fileReader, TestData.class);
		
		List<Object[]> dataToReturn = new ArrayList<Object[]>();
		for(User user : data.getData()) {
			dataToReturn.add(new Object[] {user});
		}
		
		return dataToReturn.iterator();
	}
	
	
	@DataProvider(name =  "LoginCSVDataProvider")
	public Iterator<User> loginCSVDataProvider() {
		return CSVUtility.readCSVFile("logindata.csv");
	}
	
	@DataProvider(name =  "LoginExcelDataProvider")
	public Iterator<User> loginExcelDataProvider() {
		return ExcelUtility.readExcelFile("Logindata.xlsx");
	}

}
