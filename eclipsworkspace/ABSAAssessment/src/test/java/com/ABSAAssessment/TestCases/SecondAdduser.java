package com.ABSAAssessment.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ABSAAssessment.PageObject.BaseClass;
import com.ABSAAssessment.Utility.Screenshorts;
import com.relevantcodes.extentreports.LogStatus;

public class SecondAdduser extends BaseClass {
	WebDriver driver = BaseClass.driver;

	private final By click2 = By.xpath("/html/body/table/thead/tr[2]/td/button");
	private final By fname2 = By.name("FirstName");
	private final By lname2 = By.name("LastName");
	private final By uname2 = By.name("UserName");
	private final By passwrd2 = By.name("Password");
	private final By button2 = By.name("optionsRadios");
	private final By droupdwn2 = By.xpath("//select[@name='RoleId']");
	private final By mail2 = By.name("Email");
	private final By number2 = By.name("Mobilephone");
	private final By save2 = By.xpath("//button[text()='Save']");

	public void secondAdd() {
		test = e.startTest("SecondAdduser");
		BaseClass.driver.findElement(click2).click();
		test.log(LogStatus.INFO, "click the Addsecinduser");
	}

	public void entertheuser() {
		BaseClass.driver.findElement(fname2).sendKeys("payal");
		test.log(LogStatus.INFO, "enter the firstname on the text box");

		BaseClass.driver.findElement(lname2).sendKeys("kore");
		test.log(LogStatus.INFO, "enter the last name on the text box");

		BaseClass.driver.findElement(uname2).sendKeys("Suser2");
		test.log(LogStatus.INFO, "Enter the user name on the text box");

		BaseClass.driver.findElement(passwrd2).sendKeys("Spass2");
		test.log(LogStatus.INFO, "enter the password on the text box");
	}

	public void radiobutton() {

		WebElement select = BaseClass.driver.findElement(button2);
		select.click();
		test.log(LogStatus.INFO, "select the Company BBB button");
	}

	public void dropdown() {

		Select sl = new Select(BaseClass.driver.findElement(droupdwn2));
		sl.selectByValue("1");
		test.log(LogStatus.INFO, "select the droupdown in customer");
	}

	public void mail() {
		BaseClass.driver.findElement(mail2).sendKeys("cusomter@mail.com");
		test.log(LogStatus.INFO, "Enter the Email Adrss");

		BaseClass.driver.findElement(number2).sendKeys("083444");
		test.log(LogStatus.INFO, "Enter the phone number");

	}

	public void save() throws IOException, Exception {

		Thread.sleep(2000);
		Screenshorts.getScreenshort();

		WebElement clk = BaseClass.driver.findElement(save2);
		clk.click();
		test.log(LogStatus.INFO, "click on save");

	}

}
