package newpackage;

import org.openqa.selenium.By;

import pageObjects.ConfigurationCallNumbersPage;
import pageObjects.ConfigurationCallPage;
import pageObjects.ConfigurationPage;
import pageObjects.StartAPpage;

public class DialOutPrefixColumn extends Help {


	public static void main(String[] args) {

		// Set GoogleChrome Driver
		Help.setGCD();

		// LoginLA
		Help.loginLA(driver);

		// check equals of userName
		if (Help.approveLoginLA(driver)) {

			// click on CONFIGURATION icon
			WaiteR(By.xpath(StartAPpage.getConfigurationIconAttr("xpath"))).click();

			// wait&click until CALL button
			WaiteR(By.xpath(ConfigurationPage.getCallButtAttr("xpath"))).click();

			// wait&click until NUMBERS button
			WaiteR(By.xpath(ConfigurationCallPage.getNumbersButtAttr("xpath"))).click();

			// get text from textColumn
			String s = WaiteR(By.xpath(ConfigurationCallNumbersPage.getTablePanelAttr("xpath"))).getText();

			if (s.contains("Dial out prefix")) {

				Help.checkResult(1);

			} else {

				Help.checkResult(0);
			}

			Help.logoutLA(driver, nameOfUser);

		} else {
			System.out.println("TestNO_Don't_approve_login_LA");
		}
		driver.close();
	}
}
