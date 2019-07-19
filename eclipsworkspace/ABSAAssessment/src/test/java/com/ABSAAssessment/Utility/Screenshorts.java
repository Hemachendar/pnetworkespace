package com.ABSAAssessment.Utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.ABSAAssessment.PageObject.BaseClass;

public class Screenshorts
{
	
	public static SimpleDateFormat getScreenshort() throws IOException 
	{
		
		Date dt=new Date();
		System.out.println(dt);
		
		File Src=((TakesScreenshot)BaseClass.driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-YYYY HH-mm-ss");
		FileHandler.copy(Src,new File(System.getProperty("user.dir")+"//Screenshort//"+dateformat.format(dt)+".png"));
		return dateformat;
	}

}
