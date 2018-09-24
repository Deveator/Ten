package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pageObjects.ConfigurationPage;
import pageObjects.ConfigurationSystemGeneralPage;
import pageObjects.StartAPpage;

public class NumberOfDays extends Help {

	public static void mNumberOfDays() {

		// Set GoogleChrome Driver
		Help.setGCD();

		// LoginLA
		Help.loginLA(driver);

		// check equals of userName
		if (Help.approveLoginLA(driver)) {

			// click on CONFIGURATION icon
			WaiteR(By.xpath(StartAPpage.getConfigurationIconAttr("xpath"))).click();

			// click on SYSTEM button
			WaiteR(By.xpath(ConfigurationPage.getSystemButtAttr("xpath"))).click();

			// click on GENERAL button
			WaiteR(By.xpath(ConfigurationPage.getGeneralButtAttr("xpath"))).click();

			// initiate deleteOldSentMailsInputString
			WebElement str = WaiteR(By.xpath(ConfigurationSystemGeneralPage.getDeleteOldSentMailsStringAttr("xpath")));

			// scroll down to deleteOldSentMails
			Help.JavaExecInit(driver, "arguments[0].scrollIntoView();", str);

			// initiate nubberOfDaysInputString and wait of visibility
			WebElement numberOfDays = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(ConfigurationSystemGeneralPage.getNumberOfDaysStringAttr("xpath"))));

			// clear numberOfDays string
			numberOfDays.clear();

			// type in numberOfDays "0.2"
			numberOfDays.sendKeys("0.2");

			// initiate SAVE button
			WebElement s1 = WaiteR(By.xpath(ConfigurationSystemGeneralPage.getSaveButtAttr("xpath")));

			// scroll down to SAVE button
			Help.JavaExecInit(driver, "arguments[0].scrollIntoView();", s1);

			// click on SAVE button
			s1.click();

			// initiate and wait for visibility
			WebElement infoMessage = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(ConfigurationSystemGeneralPage.getInfoMessageAttr("xpath"))));

			// check the error message
			if (!infoMessage.getText().contains("errors")) {

				checkResult(0);
				System.out.println("infoMessage doesn't equal to error");

			} else {

				// clear numberOfDays string
				numberOfDays.clear();

				// type in numberOfDays "5" OR another whole number
				numberOfDays.sendKeys("5");

				// click on SAVE button
				s1.click();

				// initiate and wait for visibility of new message
				WebElement infoMessage1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath(ConfigurationSystemGeneralPage.getInfoMessageAttr("xpath"))));

				String expectedMessage = "General configuration saved";

				// check message
				if (infoMessage1.getText().equals(expectedMessage)) {

					checkResult(1);

				} else {

					checkResult(0);
					System.out.println("infoMessage doesn't equal to expected message");
				}
			}

		} else {

			System.out.println(" Don't approve logging");

			checkResult(0);
		}
		
		driver.close();
	}
	/*
	public static void main(String[] args) {

		// Set GoogleChrome Driver
		Help.setGCD();

		// LoginLA
		Help.loginLA(driver);

		// check equals of userName
		if (Help.approveLoginLA(driver)) {

			// click on CONFIGURATION icon
			WaiteR(By.xpath(StartAPpage.getConfigurationIconAttr("xpath"))).click();

			// click on SYSTEM button
			WaiteR(By.xpath(ConfigurationPage.getSystemButtAttr("xpath"))).click();

			// click on GENERAL button
			WaiteR(By.xpath(ConfigurationPage.getGeneralButtAttr("xpath"))).click();

			// initiate deleteOldSentMailsInputString
			WebElement str = WaiteR(By.xpath(ConfigurationSystemGeneralPage.getDeleteOldSentMailsStringAttr("xpath")));

			// scroll down to deleteOldSentMails
			Help.JavaExecInit(driver, "arguments[0].scrollIntoView();", str);

			// initiate nubberOfDaysInputString and wait of visibility
			WebElement numberOfDays = wait.until(ExpectedConditions.visibilityOfElementLocated(
					By.xpath(ConfigurationSystemGeneralPage.getNumberOfDaysStringAttr("xpath"))));

			// clear numberOfDays string
			numberOfDays.clear();

			// type in numberOfDays "0.2"
			numberOfDays.sendKeys("0.2");

			// initiate SAVE button
			WebElement s1 = WaiteR(By.xpath(ConfigurationSystemGeneralPage.getSaveButtAttr("xpath")));

			// scroll down to SAVE button
			Help.JavaExecInit(driver, "arguments[0].scrollIntoView();", s1);

			// click on SAVE button
			s1.click();

			// initiate and wait for visibility
			WebElement infoMessage = wait.until(ExpectedConditions
					.visibilityOfElementLocated(By.xpath(ConfigurationSystemGeneralPage.getInfoMessageAttr("xpath"))));

			// check the error message
			if (!infoMessage.getText().contains("errors")) {

				checkResult(0);
				System.out.println("infoMessage doesn't equal to error");

			} else {

				// clear numberOfDays string
				numberOfDays.clear();

				// type in numberOfDays "5" OR another whole number
				numberOfDays.sendKeys("5");

				// click on SAVE button
				s1.click();

				// initiate and wait for visibility of new message
				WebElement infoMessage1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath(ConfigurationSystemGeneralPage.getInfoMessageAttr("xpath"))));

				String expectedMessage = "General configuration saved";

				// check message
				if (infoMessage1.getText().equals(expectedMessage)) {

					checkResult(1);

				} else {

					checkResult(0);
					System.out.println("infoMessage doesn't equal to expected message");
				}
			}

		} else {

			System.out.println(" Don't approve logging");

			checkResult(0);
		}
		
		driver.close();
	}
	*/
}
