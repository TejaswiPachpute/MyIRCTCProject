package com.IRCTC.utilities;

import java.util.ArrayList;

public class TestUtil {

	static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel(String Sheetname) {
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		try {
			reader=new
					Xls_Reader("C:\\Users\\lenovo\\eclipse-workspace\\IRCTC-CaptchaHandeling\\src\\main\\java\\com\\IRCTC\\testdata\\LoginData.xlsx");

		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount(Sheetname); rowNum++) {

			if (Sheetname.equals("LoginInfo")) // 1
			{
				String username = reader.getCellData("LoginInfo", "username", rowNum);
				System.out.println(username);
				String password = reader.getCellData("LoginInfo", "password", rowNum);
				System.out.println(password);
				//reader.setCellData("LoginInfo", "status", rowNum, "Pass");
				Object ob[] = { username, password };
				myData.add(ob);
			}

			/*	else if (Sheetname.equals("ResolveNotes")) // 2
			{
				String caller = reader.getCellData("ResolveNotes", "caller", rowNum);
				String shortdiscription = reader.getCellData("ResolveNotes", "shortdiscription", rowNum);
				String ResolveNotesData = reader.getCellData("ResolveNotes", "ResolveNotesData", rowNum);

				reader.setCellData("ResolveNotes", "Status", rowNum, "Pass");
				Object ob2[] = { caller, shortdiscription, ResolveNotesData };
				myData.add(ob2);
			} else if (Sheetname.equals("datahold")) // 3
			{
				String caller = reader.getCellData("datahold", "caller", rowNum);
				String shortdiscription = reader.getCellData("datahold", "shortdiscription", rowNum);
				String Additiondiscr = reader.getCellData("datahold", "Additiondiscr", rowNum);

				System.out.println(Additiondiscr);
				Object ob3[] = { caller, shortdiscription, Additiondiscr };
				myData.add(ob3);
			} else if (Sheetname.equals("datacancel")) {
				String caller = reader.getCellData("datacancel", "caller", rowNum);
				String shortdiscription = reader.getCellData("datacancel", "shortdiscription", rowNum);

				System.out.println(shortdiscription);
				reader.setCellData("CancelData", "Status", rowNum, "Pass");
				Object ob4[] = { caller, shortdiscription };
				myData.add(ob4);
			} */

			else {
				String caller = reader.getCellData("dataclose", "caller", rowNum);
				String shortdiscription = reader.getCellData("dataclose", "shortdiscription", rowNum);
				String CloseData = reader.getCellData("dataclose", "resolvenotes", rowNum);

				System.out.println(shortdiscription);

				Object ob3[] = { caller, shortdiscription, CloseData };
				myData.add(ob3);
			}

		}
		return myData;

	}

}
