package com.ajio.utilities;

import java.util.Date;

import java.text.SimpleDateFormat;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	private static ExtentReports extent;
	static String projectpath=System.getProperty("user.dir");
	
	public static ExtentReports getinstance()
	{
		
		
		Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String date = formatter.format(now);
        
		String reportpath = projectpath + "\\src\\test\\resources\\Reports\\AjoReport_"+date+".html";
			ExtentSparkReporter spark=new ExtentSparkReporter(reportpath);
			extent=new ExtentReports();
			extent.attachReporter(spark);
			
		
		return extent;
		
	}
	
	

}
