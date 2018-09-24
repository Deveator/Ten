package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pageObjects.GmailAllPages;
import pageObjects.StartAPpage;
import pageObjects.TicketBodyPage;
import pageObjects.TicketSectionPage;

public class ReplyViaTicketbidy extends Help {

	static String recipient = "support@mail.test-5-7.ladesk.com";
	static String gmailAdress = "draftcustomer@gmail.com";
	static int locatorNumber = 0;

	public static void main(String[] args) {

		///String baseUrl = "https://test-5-7.ladesk.com/agent/#login;";

		// Set GoogleChrome Driver
		Help.setGCD();

		// Go to URL
		//driver.get(baseUrl);

		Help.gmailLogin(driver, gmailAdress, "123456z+");

		// click on COMPOSE MESSAGE button
		WaiteR(By.xpath(GmailAllPages.getComposeButtAttr("xpath"))).click();
		
		
		WaiteR(By.xpath(GmailAllPages.getRecipientMailStringAttr("xpath"))).sendKeys(recipient);

		// type in subjectString
		WaiteR(By.xpath(GmailAllPages.getMailSubjectStringAttr("xpath"))).sendKeys("SubjectFrom");

		// type in contentBody
		WaiteR(By.xpath(GmailAllPages.getMailTextStringAttr("xpath"))).sendKeys("Content");

		// need to set bcs of GMAIL
		setPause(60000);

		// click on SEND button
		WaiteR(By.xpath(GmailAllPages.getSendMailButtAttr("xpath"))).click();

		// need to set bcs of GMAIL
		setPause(15000);

		// set webAdress of LA
		driver.get("https://test-5-8.ladesk.com/agent/#login;");

		Help.loginLA(driver);

		// get number of NEW tickets
		int numberOfTickets = Integer
				.valueOf(WaiteR(By.cssSelector(StartAPpage.getNumOfNewTicketsAttr("css"))).getText());

		// check if NEW tickets
		if (numberOfTickets > 0) {

			System.out.println("Great");

			WaiteR(By.cssSelector(StartAPpage.getNumOfNewTicketsAttr("css"))).click();

			System.out.println("Great");
			// click on ticketsIcon
			/// WaiteR(By.xpath(StartAPpage.getTicketsIconAttr("xpath"))).click();

			// WaiteR(By.xpath(TicketSectionPage.getTableAttr("xpath"))).getText();

			if (!WaiteR(By.cssSelector(TicketBodyPage.getSenderNameAttr("css"))).getText().equals(gmailAdress)) {

				checkResult(0);

				System.out.println("Gmail doesn't equal");

				driver.close();
			}

			// click on REPLY button
			WaiteR(By.cssSelector(TicketBodyPage.getReplyButtAttr("css"))).click();

			// click on SEND button
			WaiteR(By.xpath(TicketBodyPage.getSendButtAttr("xpath"))).click();

			// wait&click on CLOSE button
			WaiteR(By.cssSelector(TicketBodyPage.getCloseButtAttr("css"))).click();
			
			Help.logoutLA(driver, nameOfUser);
			
			Help.gmailLogin(driver, gmailAdress, "123456z+");

		} else {

			// info message
			System.out.println("Gmail doesn't send mail");

			result = 0;
		}
		System.out.println(numberOfTickets);
		// System.out.println("2");

	}

}
