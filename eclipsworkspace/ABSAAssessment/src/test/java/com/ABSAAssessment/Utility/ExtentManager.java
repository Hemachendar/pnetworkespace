package com.ABSAAssessment.Utility;

import java.io.File;
import java.util.Date;

import com.ABSAAssessment.PageObject.BaseClass;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager extends BaseClass
{

	public static ExtentReports extent;
	
	public static ExtentReports getinstance() 
	{
		
		if (extent==null)
		{
			Date d=new Date();
			String filepath = d.toString().replace(':', '_').replace(' ', '_')+".html";
			extent=new ExtentReports(System.getProperty("user.dir")+"//HTMLReports//"+filepath);
			extent.loadConfig(new File(System.getProperty("user.dir")+"//extentreportconfig.xml"));
			extent.addSystemInfo("selenium Language", "3.141.59").addSystemInfo("Environment", "production");
		}
		return extent;
	
	}
	
}
