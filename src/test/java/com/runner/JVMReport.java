package com.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateCucumberReports(String jsonFileLoc) {
		// TODO Auto-generated method stub
		File jvmPortLoc=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		Configuration con=new Configuration(jvmPortLoc,"Belavia project report");
       //add the chrome browser info
		con.addClassifications("Browser name", "chrome");
		//add the os info
		con.addClassifications("OS", "10");
		//add the sprint info
		con.addClassifications("sprint", "02");
		//create the list
		List<String> listOfJsonFile=new ArrayList<String>();
		listOfJsonFile.add(jsonFileLoc);
		//Execute
		ReportBuilder builder=new ReportBuilder(listOfJsonFile,con);
		builder.generateReports();
	}
}
