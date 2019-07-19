package com.ABSAAssessment.TestCases;



import com.ABSAAssessment.PageObject.BaseClass;
import com.ABSAAssessment.PageObject.Browserlaunch;
import com.ABSAAssessment.PageObject.OpenURL;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class TC001 {

	@BeforeMethod
	@Parameters("browser")
	public void Startprocess(String btype) throws IOException {

		Browserlaunch launch = new Browserlaunch();
		launch.browser(btype);
		OpenURL url = new OpenURL();
		url.openurl();

	}

	@Test(priority = 0)
	public void operation() throws IOException {
		Addusers user = new Addusers();
		user.FirstAdd();
		user.userdetails();
		user.radiobutton();
		user.dropdown();
		user.mail();
		user.save();

	}

	@Test(priority = 1)
	public void SecoundOperation() throws Exception {
		SecondAdduser sc = new SecondAdduser();
		sc.secondAdd();
		sc.entertheuser();
		sc.radiobutton();
		sc.dropdown();
		sc.mail();
		sc.save();

	}

	@AfterMethod
	public void endprocess() {

		BaseClass.driver.quit();
	}

}
