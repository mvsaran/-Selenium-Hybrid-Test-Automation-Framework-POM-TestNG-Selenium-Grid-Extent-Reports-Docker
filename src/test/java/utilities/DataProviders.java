package utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {

	 @DataProvider(name = "LoginData")
	 public String [][] getData() throws Exception
	 {
		 String path =".\\testData\\Logindata.xlsx";
		 
		 ExcelUtility excel = new ExcelUtility(path);
		 
		 int rowCount = excel.getRowCount("Sheet1");
		 int colCount = excel.getCellCount("Sheet1", 1);
		 
		 String loginData[][] = new String[rowCount][colCount];
		 
		 for (int i = 1; i <= rowCount; i++)
		 {
			 for (int j = 0; j < colCount; j++)
			 {
				 loginData[i-1][j] = excel.getCellData("Sheet1", i, j);
			 }
		 }
		 return loginData;
	 }
}
