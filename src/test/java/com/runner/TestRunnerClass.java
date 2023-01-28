package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\91959\\eclipse-workspace\\Project730AMSecond\\src\\test\\resources\\login.feature"},glue= {"com.stepdefinition"})
//plugin= {"junit:C:\\Users\\91959\\eclipse-workspace\\Project730AMSecond\\src\\test\\resources\\Reports\\fb.xml"})
public class TestRunnerClass {
//Test Execution
	@AfterClass
	public static void afterClass() {
		JVMReport.generateCucumberReports(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\login.json");

	}
}
