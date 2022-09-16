package com.IRCTC.utilities;


import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendsReportGenarator {

	public static ExtentReports extent;

	public static ExtentReports extentreprts() {

		String str = "C:\\Users\\lenovo\\eclipse-workspace\\IRCTC-CaptchaHandeling\\DemoReports";

		ExtentSparkReporter reporter = new ExtentSparkReporter(str);

		reporter.config().setDocumentTitle("IRCTC Automation Project");

		reporter.config().setReportName("Captcha Automation");

		reporter.config().setTheme(Theme.DARK);

		ExtentReports extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Project Name", "Captcha Automation");

		extent.setSystemInfo("User Name", "Tejaswi Pachpute");

		extent.setSystemInfo("EmpId", "CZ103");

		extent.setSystemInfo("Environment", "Automation Testing");

		extent.setSystemInfo("State Demo", " All State is Passed");

		return extent;
	}
}