package com.ABSAAssessment.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ABSAAssessment.PageObject.BaseClass;
import com.ABSAAssessment.Utility.Screenshorts;
import com.relevantcodes.extentreports.LogStatus;

public class Addusers extends BaseClass {
	WebDriver driver = BaseClass.driver;

	private final By click = By.xpath("/html/body/table/thead/tr[2]/td/button");
	private final By fname = By.name("FirstName");
	private final By lname = By.name("LastName");
	private final By uname = By.name("UserName");
	private final By passwrd = By.name("Password");
	private final By button1 = By.name("optionsRadios");
	private final By droupdwn = By.xpath("//select[@name='RoleId']");
	private final By mail = By.name("Email");
	private final By number = By.name("Mobilephone");
	private final By save = By.xpath("//button[text()='Save']");

	public void FirstAdd() {
		test = e.startTest("Addusers");
		BaseClass.driver.findElement(click).click();
		test.log(LogStatus.INFO, "click the Adduser");
	}

	public void userdetails() {
		WebElement n = BaseClass.driver.findElement(fname);
		n.sendKeys("motlasi");
		test.log(LogStatus.INFO, "enter the firstname on the text box");

		BaseClass.driver.findElement(lname).sendKeys("Lpasi");
		test.log(LogStatus.INFO, "enter the last name on the text box");

		BaseClass.driver.findElement(uname).sendKeys("uname");
		test.log(LogStatus.INFO, "Enter the user name on the text box");

		BaseClass.driver.findElement(passwrd).sendKeys("pass1");
		test.log(LogStatus.INFO, "enter the password on the text box");
	}

	public void radiobutton() {

		WebElement select = BaseClass.driver.findElement(button1);
		select.click();
		test.log(LogStatus.INFO, "select the Company AAAA button");
	}

	public void dropdown() {

		Select sl = new Select(BaseClass.driver.findElement(droupdwn));
		sl.selectByValue("2");
		test.log(LogStatus.INFO, "select the droupdown in Admin");
	}

	public void mail() {
		BaseClass.driver.findElement(mail).sendKeys("admin@mail.com");
		test.log(LogStatus.INFO, "Enter the Email Adrss");
		BaseClass.driver.findElement(number).sendKeys("082555");
		test.log(LogStatus.INFO, "Enter the phone number");
        
	}

	public void save() throws IOException {
		Screenshorts.getScreenshort();
		WebElement clk = BaseClass.driver.findElement(save);
		clk.click();
		test.log(LogStatus.INFO, "click on save");
		
		e.endTest(test);
		e.flush();

	}

}
