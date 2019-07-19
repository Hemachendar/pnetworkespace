package com.ABSAAssessment.PageObject;

import java.io.FileInputStream;

import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.ABSAAssessment.Utility.ExtentManager;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {

	public static WebDriver driver;
	public static Properties p;
	public static FileInputStream fs;
	public static ExtentReports e = ExtentManager.getinstance();
	public static ExtentTest test;

	// Path of the files
	public static String getdeta(String key) throws IOException {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		fs = new FileInputStream(System.getProperty("user.dir") + "//Data.propertise");
		p = new Properties();
		p.load(fs);
		System.out.println(p.getProperty(key));
		return p.getProperty(key);
	}

	// install the path of the drivers in dynamic way
	public static void launch(String browser) {

		if (browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.contains("ie")) {
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "//drivers//iedriverserver.exe");
			driver = new InternetExplorerDriver();
		} else if (browser.contains("edge")) {
			System.setProperty("webdriver.edge.driver",
					System.getProperty("user.dir") + "//drivers//MicrosoftWebDriver.exe");
			driver = new EdgeDriver();
		} else if (browser.contains("gecko")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		}

		// driver.navigate().to(url);
		driver.manage().window().maximize();
		// driver.close();

	}

	//// install require URL
	public static void openurl(String url) {

		driver.get(url);
	}

}