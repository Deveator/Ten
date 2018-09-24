package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pageObjects.GmailAllPages;
import pageObjects.NewPage;
import pageObjects.NewTickCompMessPage;
import pageObjects.StartAPpage;
import pageObjects.TicketBodyPage;

public class SendToMainBCCRecipient extends Help {

	static String mainEmail = "draftcustomer@gmail.com";
	static String bccEmail = "draftagent.1@gmail.com";

	public static void mSendToMainBCCRecipient() {

		// String baseUrl = "https://test-5-7.ladesk.com/agent/#login;";
		// Set GoogleChrome Driver
		Help.setGCD();
		// Go to URL
		// driver.get(baseUrl);
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

			// click on addBCC button
			WaiteR(By.xpath(NewTickCompMessPage.getAddbccButtAttr("xpath"))).click();

			// wait&sendKeys in inputString for add CC email is visible
			WaiteR(By.xpath(NewTickCompMessPage.getAddbccStringAttr("xpath"))).sendKeys(bccEmail);

			// click on COMPOSE MESSAGE title to focus on page
			WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			/// wait close mail button - it's mark of already iputted email
			/// WaiteR(By.xpath(NewTickCompMessPage.getAddccClearButtAttr("xpath")));

			// type in SUBJECT inputString
			WaiteR(By.cssSelector(NewTickCompMessPage.getSubjectStringAttr("css"))).sendKeys("draftSubject");

			// click on COMPOSE MESSAGE title to focus on page
			WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			// type in ticketBody
			WaiteR(By.cssSelector(NewTickCompMessPage.getTicketBodyAttr("css"))).sendKeys("draftContent");

			// click on COMPOSE MESSAGE title to focus on page
			WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

			// set refresh and loop to check that SUBJECT has value
			driver.navigate().refresh();

			while (WaiteR(By.cssSelector(NewTickCompMessPage.getSubjectStringAttr("css"))).getText().length() < 0) {
				WaiteR(By.cssSelector(NewTickCompMessPage.getSubjectStringAttr("css"))).sendKeys("draftSubject");
			}

			// set pause bcs "NoSuchElementOnPoint" wait&click on SEND button
			Help.setPause(1000);
			WaiteR(By.xpath(NewTickCompMessPage.getSendButtAttr("xpath"))).click();

			/*
			 * Here need to set code to check bcc mail in ticketBody
			 */

			// wait&click on CLOSE button
			WaiteR(By.cssSelector(TicketBodyPage.getCloseButtAttr("css"))).click();

			// logout from LA
			Help.logoutLA(driver, nameOfUser);

		} else {
			System.out.println("TestNO1");
		}

		Help.gmailLogin(driver, mainEmail, "123456z+");

		// wait unlil load mailBox
		WebElement mailBox = WaiteR(By.id(GmailAllPages.getMailBoxAttr("id")));

		// find element with required senderNamen
		WebElement senderName = WaiteR(By.cssSelector(GmailAllPages.getFirstItemSenderNameAttr("css")));

		// check is mail from DEV TEST
		if (senderName.getText().equals(requiredNameOfUser)) {

			// click on mail from DEV TEST
			senderName.click();

			// click on emailOptionButton
			WaiteR(By.id(GmailAllPages.getMailOptionButtAttr("id"))).click();

			// get Text from mail option data
			String s1 = WaiteR(By.xpath(GmailAllPages.getMailOptionsDataAttr("xpath"))).getText();

			// check mail option data
			if (s1.contains(bccEmail)) {
				driver.close();
				System.out.println("TestNO");
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
			System.out.println("Main mail doesn't remove from mailbox");
			driver.close();
		} else {
			result = 1;
		}

		// need another method cause of appear new step
		Help.gmailLoginAgain(driver, bccEmail, "123456z+");

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
			System.out.println("No mail in BCCmailbox");
		}
		// check no mail from Dev Test
		if (mailBox2.getText().contains(requiredNameOfUser)) {
			result = 0;
		} else {
			result = 1;
		}
		Help.checkResult(result);
		result = 0;
		driver.close();

	}
	/*
	 * public static void main(String[] args) {
	 * 
	 * // String baseUrl = "https://test-5-7.ladesk.com/agent/#login;"; // Set
	 * GoogleChrome Driver Help.setGCD(); // Go to URL // driver.get(baseUrl); //
	 * LoginLA Help.loginLA(driver);
	 * 
	 * // check equals of userName if (Help.approveLoginLA(driver)) {
	 * 
	 * // click on NEW button
	 * WaiteR(By.cssSelector(StartAPpage.getNewButAttr("css"))).click();
	 * 
	 * // wait&click until NEW TICKET
	 * WaiteR(By.xpath(NewPage.getNewTicketAttr("xpath"))).click();
	 * 
	 * // wait&sendKeys until inputString for email is visible
	 * WaiteR(By.cssSelector(NewTickCompMessPage.getMailInputStringAttr("css"))).
	 * sendKeys(mainEmail);
	 * 
	 * // click on COMPOSE MESSAGE title to focus on page
	 * WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();
	 * 
	 * // wait close mail button - it's mark of alredy iputted email
	 * WaiteR(By.xpath(NewTickCompMessPage.getClearButtAttr("xpath")));
	 * 
	 * // click on addBCC button
	 * WaiteR(By.xpath(NewTickCompMessPage.getAddbccButtAttr("xpath"))).click();
	 * 
	 * // wait&sendKeys in inputString for add CC email is visible
	 * WaiteR(By.xpath(NewTickCompMessPage.getAddbccStringAttr("xpath"))).sendKeys(
	 * bccEmail);
	 * 
	 * // click on COMPOSE MESSAGE title to focus on page
	 * WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();
	 * 
	 * /// wait close mail button - it's mark of already iputted email
	 * ///WaiteR(By.xpath(NewTickCompMessPage.getAddccClearButtAttr("xpath")));
	 * 
	 * // type in SUBJECT inputString
	 * WaiteR(By.cssSelector(NewTickCompMessPage.getSubjectStringAttr("css"))).
	 * sendKeys("draftSubject");
	 * 
	 * // click on COMPOSE MESSAGE title to focus on page
	 * WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();
	 * 
	 * // type in ticketBody
	 * WaiteR(By.cssSelector(NewTickCompMessPage.getTicketBodyAttr("css"))).sendKeys
	 * ("draftContent");
	 * 
	 * // click on COMPOSE MESSAGE title to focus on page
	 * WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();
	 * 
	 * // set refresh and loop to check that SUBJECT has value
	 * driver.navigate().refresh();
	 * 
	 * while
	 * (WaiteR(By.cssSelector(NewTickCompMessPage.getSubjectStringAttr("css"))).
	 * getText().length() < 0) {
	 * WaiteR(By.cssSelector(NewTickCompMessPage.getSubjectStringAttr("css"))).
	 * sendKeys("draftSubject"); }
	 * 
	 * // set pause bcs "NoSuchElementOnPoint" wait&click on SEND button
	 * Help.setPause(1000);
	 * WaiteR(By.xpath(NewTickCompMessPage.getSendButtAttr("xpath"))).click();
	 * 
	 * /* Here need to set code to check bcc mail in ticketBody
	 */
/*
	// wait&click on CLOSE button
	WaiteR(By.cssSelector(TicketBodyPage.getCloseButtAttr("css"))).click();

				// logout from LA
				Help.logoutLA(driver, nameOfUser);

			}else

	{
		System.out.println("TestNO1");
	}

	Help.gmailLogin(driver,mainEmail,"123456z+");

	// wait unlil load mailBox
	WebElement mailBox = WaiteR(By.id(GmailAllPages.getMailBoxAttr("id")));

	// find element with required senderNamen
	WebElement senderName = WaiteR(By.cssSelector(GmailAllPages.getFirstItemSenderNameAttr("css")));

	// check is mail from DEV TEST
	if(senderName.getText().equals(requiredNameOfUser))
	{

		// click on mail from DEV TEST
		senderName.click();

		// click on emailOptionButton
		WaiteR(By.id(GmailAllPages.getMailOptionButtAttr("id"))).click();

		// get Text from mail option data
		String s1 = WaiteR(By.xpath(GmailAllPages.getMailOptionsDataAttr("xpath"))).getText();

		// check mail option data
		if (s1.contains(bccEmail)) {
			driver.close();
			System.out.println("TestNO");
		}

		// click on trashIcon
		WaiteR(By.xpath(GmailAllPages.getTrashIconAttr("xpath"))).click();

		Help.setPause(2000);
	}else
	{

		System.out.println("TestNO2");
	}

	// check no mail from Dev Test
	if(mailBox.getText().contains(requiredNameOfUser))
	{
		result = 0;
		System.out.println("Main mail doesn't remove from mailbox");
		driver.close();
	}else
	{
		result = 1;
	}

	// need another method cause of appear new step
	Help.gmailLoginAgain(driver,bccEmail,"123456z+");

	// wait unlil load mailBox
	WebElement mailBox2 = WaiteR(By.id(GmailAllPages.getMailBoxAttr("id")));

	// find element with required senderNamen
	WebElement senderName2 = WaiteR(By.cssSelector(GmailAllPages.getFirstItemSenderNameAttr("css")));

	// check is mail from DEV TEST
	if(senderName2.getText().equals(requiredNameOfUser))
	{

		// click on mail from DEV TEST
		senderName2.click();

		// click on trashIcon
		WaiteR(By.xpath(GmailAllPages.getTrashIconAttr("xpath"))).click();

		Help.setPause(2000);
	}else
	{
		System.out.println("No mail in BCCmailbox");
	}
	// check no mail from Dev Test
	if(mailBox2.getText().contains(requiredNameOfUser))
	{
		result = 0;
	}else
	{
		result = 1;
	}Help.checkResult(result);result=0;driver.close();

}*/

}
