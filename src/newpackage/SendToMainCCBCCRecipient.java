package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pageObjects.GmailAllPages;
import pageObjects.NewPage;
import pageObjects.NewTickCompMessPage;
import pageObjects.StartAPpage;
import pageObjects.TicketBodyPage;

public class SendToMainCCBCCRecipient extends Help {

	static String mainEmail = "draftcustomer@gmail.com";
	static String bccEmail = "draftagent.1@gmail.com";
	static String ccEmail = "draftagent.2@gmail.com";

	public static void mSendToMainCCBCCRecipient() {

		//String baseUrl = "https://test-5-7.ladesk.com/agent/#login;";
		// Set GoogleChrome Driver
		Help.setGCD();
		// Go to URL
	//	driver.get(baseUrl);
		// LoginLA
		Help.loginLA(driver);

		// check equals of userName
		if (Help.approveLoginLA(driver)) {

			// click on NEW button
			WaiteR(By.cssSelector(StartAPpage.getNewButAttr("css"))).click();

			// wait&click until NEW TICKET
			WaiteR(By.xpath(NewPage.getNewTicketAttr("xpath"))).click();

			// wait&sendKeys until inputString for email is visible
			WaiteR(By.cssSelector(NewTickCompMessPage.getMailInputStringAttr("css"))).sendKeys(mainEmail);

			// click on COMPOSE MESSAGE title to focus on page
			WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			// wait close mail button - it's mark of alredy iputted email
			WaiteR(By.xpath(NewTickCompMessPage.getClearButtAttr("xpath")));

			// click on addCC button
			WaiteR(By.xpath(NewTickCompMessPage.getAddccButtAttr("xpath"))).click();

			// wait&sendKeys in inputString for add CC email is visible
			WaiteR(By.xpath(NewTickCompMessPage.getAddccStringAttr("xpath"))).sendKeys(ccEmail);

			// click on COMPOSE MESSAGE title to focus on page
			WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			// wait close mail button - it's mark of already iputted email
			WaiteR(By.xpath(NewTickCompMessPage.getAddccClearButtAttr("xpath")));

			// set pause need to bcc mailAdress
			setPause(1500);

			// click on addBCC button
			WaiteR(By.xpath(NewTickCompMessPage.getAddbccButtAttr("xpath"))).click();

			// wait&sendKeys in inputString for add CC email is visible
			WaiteR(By.xpath(NewTickCompMessPage.getAddbccStringAttr("xpath"))).sendKeys(bccEmail);

			// click on COMPOSE MESSAGE title to focus on page
			WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			// type in SUBJECT inputString
			WaiteR(By.cssSelector(NewTickCompMessPage.getSubjectStringAttr("css"))).sendKeys("draftSubject");

			// click on COMPOSE MESSAGE title to focus on page
			WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			// type in ticketBody
			WaiteR(By.cssSelector(NewTickCompMessPage.getTicketBodyAttr("css"))).sendKeys("draftContent");

			// click on COMPOSE MESSAGE title to focus on page
			WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			// set pause bcs "NoSuchElementOnPoint" wait&click on SEND button
			Help.setPause(1000);
			WaiteR(By.xpath(NewTickCompMessPage.getSendButtAttr("xpath"))).click();

			/// if (driver.findElement(By.xpath(
			/// "//div[@class='g-FormField2 g-FormField2-empty ComposeMessageSubject
			/// g-FormField2-Error']//div[@class='gwt-HTML g-FormField2-ErrorIcon']"))
			/// .isDisplayed()) {
///
			/// // set method to check SUBJECT string has value
			/// while (driver.findElement(By.xpath(
			/// "//div[@class='g-FormField2 g-FormField2-empty ComposeMessageSubject
			/// g-FormField2-Error']//div[@class='gwt-HTML g-FormField2-ErrorIcon']"))
			/// .isDisplayed()) {
			/// System.out.println("No value");

			/// WaiteR(By.cssSelector(NewTickCompMessPage.getSubjectStringAttr("css"))).sendKeys("draftSubject");

			/// WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			/// Help.setPause(1000);

			/// WaiteR(By.xpath(NewTickCompMessPage.getSendButtAttr("xpath"))).click();
			/// }
			/// }

			/*
			 * Here need to set code to check cc mail in ticketBody
			 */

			// wait&click on CLOSE button
			WaiteR(By.cssSelector(TicketBodyPage.getCloseButtAttr("css"))).click();

			// logout from LA
			Help.logoutLA(driver, nameOfUser);

		} else {
			System.out.println("TestNO1");
		}

		// login main email
		Help.gmailLogin(driver, mainEmail, "123456z+");

		// wait unlil load mailBox
		WebElement mailBox = WaiteR(By.id(GmailAllPages.getMailBoxAttr("id")));

		// find element with required senderNamen
		WebElement senderName = WaiteR(By.cssSelector(GmailAllPages.getFirstItemSenderNameAttr("css")));

		// check is mail from DEV TEST
		if (senderName.getText().equals(requiredNameOfUser)) {

			// click on mail from DEV TEST
			senderName.click();
			
			setPause(1000);

			// click on emailOptionButton
			WaiteR(By.id(GmailAllPages.getMailOptionButtAttr("id"))).click();
			
			setPause(1000);

			// get Text from cc section
			String s1 = WaiteR(By.xpath(GmailAllPages.getCCmailAttr("xpath"))).getText();
			
			setPause(1000);

			// get Text from mail option data
			String s2 = WaiteR(By.xpath(GmailAllPages.getMailOptionsDataAttr("xpath"))).getText();

			// check CC email
			if (!s1.contains(ccEmail)) {
				driver.close();
				System.out.println("CC mailAdress doesn't equal OR doesn't exist");
			}
			// check mail option data
			if (s2.contains(bccEmail)) {
				driver.close();
				System.out.println("BCC mailAdress doesn't equal OR doesn't exist");
			}

			// click on trashIcon
			WaiteR(By.xpath(GmailAllPages.getTrashIconAttr("xpath"))).click();

			Help.setPause(2000);

		} else {

			System.out.println("TestNO2");
		}
		// check no mail from Dev Test
		if (mailBox.getText().contains(requiredNameOfUser)) {
			result = 0;
			driver.close();
		} else {
			result = 1;
		}
		// need another method cause of appear new step
		Help.gmailLoginAgain(driver, "draftagent.2@gmail.com", "123456z+");

		// wait unlil load mailBox
		WebElement mailBox2 = WaiteR(By.id(GmailAllPages.getMailBoxAttr("id")));

		// find element with required senderNamen
		WebElement senderName2 = WaiteR(By.cssSelector(GmailAllPages.getFirstItemSenderNameAttr("css")));

		// check is mail from DEV TEST
		if (senderName2.getText().equals(requiredNameOfUser)) {

			// click on mail from DEV TEST
			senderName2.click();

			// click on trashIcon
			WaiteR(By.xpath(GmailAllPages.getTrashIconAttr("xpath"))).click();

			Help.setPause(2000);
		} else {
			System.out.println("TestNO2");
		}

		// check no mail from Dev Test
		if (mailBox2.getText().contains(requiredNameOfUser)) {
			result = 0;
		} else {
			result = 1;
		}

		// need another method cause of appear new step
		Help.gmailLoginAgainAgain(driver, bccEmail, "123456z+");

		// wait unlil load mailBox
		WebElement mailBox3 = WaiteR(By.id(GmailAllPages.getMailBoxAttr("id")));

		// find element with required senderNamen
		WebElement senderName3 = WaiteR(By.cssSelector(GmailAllPages.getFirstItemSenderNameAttr("css")));

		// check is mail from DEV TEST
		if (senderName3.getText().equals(requiredNameOfUser)) {

			// click on mail from DEV TEST
			senderName3.click();

			// click on trashIcon
			WaiteR(By.xpath(GmailAllPages.getTrashIconAttr("xpath"))).click();

			Help.setPause(2000);
		} else {
			System.out.println("No mail in BCCmailbox");
		}
		// check no mail from Dev Test
		if (mailBox3.getText().contains(requiredNameOfUser)) {
			result = 0;
		} else {
			result = 1;
		}

		Help.checkResult(result);
		result = 0;
		driver.close();

	}
/*	
	public static void main(String[] args) {

		//String baseUrl = "https://test-5-7.ladesk.com/agent/#login;";
		// Set GoogleChrome Driver
		Help.setGCD();
		// Go to URL
	//	driver.get(baseUrl);
		// LoginLA
		Help.loginLA(driver);

		// check equals of userName
		if (Help.approveLoginLA(driver)) {

			// click on NEW button
			WaiteR(By.cssSelector(StartAPpage.getNewButAttr("css"))).click();

			// wait&click until NEW TICKET
			WaiteR(By.xpath(NewPage.getNewTicketAttr("xpath"))).click();

			// wait&sendKeys until inputString for email is visible
			WaiteR(By.cssSelector(NewTickCompMessPage.getMailInputStringAttr("css"))).sendKeys(mainEmail);

			// click on COMPOSE MESSAGE title to focus on page
			WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			// wait close mail button - it's mark of alredy iputted email
			WaiteR(By.xpath(NewTickCompMessPage.getClearButtAttr("xpath")));

			// click on addCC button
			WaiteR(By.xpath(NewTickCompMessPage.getAddccButtAttr("xpath"))).click();

			// wait&sendKeys in inputString for add CC email is visible
			WaiteR(By.xpath(NewTickCompMessPage.getAddccStringAttr("xpath"))).sendKeys(ccEmail);

			// click on COMPOSE MESSAGE title to focus on page
			WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			// wait close mail button - it's mark of already iputted email
			WaiteR(By.xpath(NewTickCompMessPage.getAddccClearButtAttr("xpath")));

			// set pause need to bcc mailAdress
			setPause(1500);

			// click on addBCC button
			WaiteR(By.xpath(NewTickCompMessPage.getAddbccButtAttr("xpath"))).click();

			// wait&sendKeys in inputString for add CC email is visible
			WaiteR(By.xpath(NewTickCompMessPage.getAddbccStringAttr("xpath"))).sendKeys(bccEmail);

			// click on COMPOSE MESSAGE title to focus on page
			WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			// type in SUBJECT inputString
			WaiteR(By.cssSelector(NewTickCompMessPage.getSubjectStringAttr("css"))).sendKeys("draftSubject");

			// click on COMPOSE MESSAGE title to focus on page
			WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			// type in ticketBody
			WaiteR(By.cssSelector(NewTickCompMessPage.getTicketBodyAttr("css"))).sendKeys("draftContent");

			// click on COMPOSE MESSAGE title to focus on page
			WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			// set pause bcs "NoSuchElementOnPoint" wait&click on SEND button
			Help.setPause(1000);
			WaiteR(By.xpath(NewTickCompMessPage.getSendButtAttr("xpath"))).click();

			/// if (driver.findElement(By.xpath(
			/// "//div[@class='g-FormField2 g-FormField2-empty ComposeMessageSubject
			/// g-FormField2-Error']//div[@class='gwt-HTML g-FormField2-ErrorIcon']"))
			/// .isDisplayed()) {
///
			/// // set method to check SUBJECT string has value
			/// while (driver.findElement(By.xpath(
			/// "//div[@class='g-FormField2 g-FormField2-empty ComposeMessageSubject
			/// g-FormField2-Error']//div[@class='gwt-HTML g-FormField2-ErrorIcon']"))
			/// .isDisplayed()) {
			/// System.out.println("No value");

			/// WaiteR(By.cssSelector(NewTickCompMessPage.getSubjectStringAttr("css"))).sendKeys("draftSubject");

			/// WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			/// Help.setPause(1000);

			/// WaiteR(By.xpath(NewTickCompMessPage.getSendButtAttr("xpath"))).click();
			/// }
			/// }

			/*
			 * Here need to set code to check cc mail in ticketBody
			 */
/*
			// wait&click on CLOSE button
			WaiteR(By.cssSelector(TicketBodyPage.getCloseButtAttr("css"))).click();

			// logout from LA
			Help.logoutLA(driver, nameOfUser);

		} else {
			System.out.println("TestNO1");
		}

		// login main email
		Help.gmailLogin(driver, mainEmail, "123456z+");

		// wait unlil load mailBox
		WebElement mailBox = WaiteR(By.id(GmailAllPages.getMailBoxAttr("id")));

		// find element with required senderNamen
		WebElement senderName = WaiteR(By.cssSelector(GmailAllPages.getFirstItemSenderNameAttr("css")));

		// check is mail from DEV TEST
		if (senderName.getText().equals(requiredNameOfUser)) {

			// click on mail from DEV TEST
			senderName.click();
			
			setPause(1000);

			// click on emailOptionButton
			WaiteR(By.id(GmailAllPages.getMailOptionButtAttr("id"))).click();
			
			setPause(1000);

			// get Text from cc section
			String s1 = WaiteR(By.xpath(GmailAllPages.getCCmailAttr("xpath"))).getText();
			
			setPause(1000);

			// get Text from mail option data
			String s2 = WaiteR(By.xpath(GmailAllPages.getMailOptionsDataAttr("xpath"))).getText();

			// check CC email
			if (!s1.contains(ccEmail)) {
				driver.close();
				System.out.println("CC mailAdress doesn't equal OR doesn't exist");
			}
			// check mail option data
			if (s2.contains(bccEmail)) {
				driver.close();
				System.out.println("BCC mailAdress doesn't equal OR doesn't exist");
			}

			// click on trashIcon
			WaiteR(By.xpath(GmailAllPages.getTrashIconAttr("xpath"))).click();

			Help.setPause(2000);

		} else {

			System.out.println("TestNO2");
		}
		// check no mail from Dev Test
		if (mailBox.getText().contains(requiredNameOfUser)) {
			result = 0;
			driver.close();
		} else {
			result = 1;
		}
		// need another method cause of appear new step
		Help.gmailLoginAgain(driver, "draftagent.2@gmail.com", "123456z+");

		// wait unlil load mailBox
		WebElement mailBox2 = WaiteR(By.id(GmailAllPages.getMailBoxAttr("id")));

		// find element with required senderNamen
		WebElement senderName2 = WaiteR(By.cssSelector(GmailAllPages.getFirstItemSenderNameAttr("css")));

		// check is mail from DEV TEST
		if (senderName2.getText().equals(requiredNameOfUser)) {

			// click on mail from DEV TEST
			senderName2.click();

			// click on trashIcon
			WaiteR(By.xpath(GmailAllPages.getTrashIconAttr("xpath"))).click();

			Help.setPause(2000);
		} else {
			System.out.println("TestNO2");
		}

		// check no mail from Dev Test
		if (mailBox2.getText().contains(requiredNameOfUser)) {
			result = 0;
		} else {
			result = 1;
		}

		// need another method cause of appear new step
		Help.gmailLoginAgainAgain(driver, bccEmail, "123456z+");

		// wait unlil load mailBox
		WebElement mailBox3 = WaiteR(By.id(GmailAllPages.getMailBoxAttr("id")));

		// find element with required senderNamen
		WebElement senderName3 = WaiteR(By.cssSelector(GmailAllPages.getFirstItemSenderNameAttr("css")));

		// check is mail from DEV TEST
		if (senderName3.getText().equals(requiredNameOfUser)) {

			// click on mail from DEV TEST
			senderName3.click();

			// click on trashIcon
			WaiteR(By.xpath(GmailAllPages.getTrashIconAttr("xpath"))).click();

			Help.setPause(2000);
		} else {
			System.out.println("No mail in BCCmailbox");
		}
		// check no mail from Dev Test
		if (mailBox3.getText().contains(requiredNameOfUser)) {
			result = 0;
		} else {
			result = 1;
		}

		Help.checkResult(result);
		result = 0;
		driver.close();

	}
	*/

}
