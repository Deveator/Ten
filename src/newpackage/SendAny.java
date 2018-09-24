package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pageObjects.NewPage;
import pageObjects.NewTickCompMessPage;
import pageObjects.StartAPpage;
import pageObjects.TicketBodyPage;

public class SendAny extends Help {

	public static void mSendAny() {

		/// String baseUrl = "https://test-5-7.ladesk.com/agent/#login;";

		// Set GoogleChrome Driver
		Help.setGCD();

		// Go to URL
		/// driver.get(baseUrl);

		// LoginLA
		Help.loginLA(driver);

		// check equals of userName
		if (Help.approveLoginLA(driver)) {

			for (int i = 0; i < 5; i++) {

				// click on NEW button
				WaiteR(By.cssSelector(StartAPpage.getNewButAttr("css"))).click();

				// wait&click until NEW TICKET
				WaiteR(By.xpath(NewPage.getNewTicketAttr("xpath"))).click();

				// wait&senKeys until inputString for email is visible
				WaiteR(By.cssSelector(NewTickCompMessPage.getMailInputStringAttr("css")))
						.sendKeys("draftcustomer@gmail.com");

				// click on COMPOSE MESSAGE title to focus on page
				WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

				// wait close mail button - it's mark of alredy iputted email
				WaiteR(By.xpath(NewTickCompMessPage.getClearButtAttr("xpath")));

				// type in SUBJECT inputString
				WaiteR(By.cssSelector(NewTickCompMessPage.getSubjectStringAttr("css"))).sendKeys("draftSubject");

				// click on COMPOSE MESSAGE title to focus on page
				WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

				// type in ticketBody
				WaiteR(By.cssSelector(NewTickCompMessPage.getTicketBodyAttr("css"))).sendKeys("draftContent");

				// initiate SEND Button
				WebElement sendBur = WaiteR(By.xpath(NewTickCompMessPage.getSendButtAttr("xpath")));

				// click on chatButtType via JavaExecutor
				Help.JavaExecInit(driver, "arguments[0].click();", sendBur);

				setPause(800);
				System.out.println(i);

				// wait&click on SEND button
				/// WaiteR(By.xpath(NewTickCompMessPage.getSendButtAttr("xpath"))).click();

				// wait&click on CLOSE button
				WaiteR(By.cssSelector(TicketBodyPage.getCloseButtAttr("css"))).click();
			}

			// logout from LA
			/// Help.logoutLA(driver, nameOfUser);

		} else {
			System.out.println("TestNO_Don't_approve_login_LA");
		}

	}
/*	
	public static void main(String[] args) {

		/// String baseUrl = "https://test-5-7.ladesk.com/agent/#login;";

		// Set GoogleChrome Driver
		Help.setGCD();

		// Go to URL
		/// driver.get(baseUrl);

		// LoginLA
		Help.loginLA(driver);

		// check equals of userName
		if (Help.approveLoginLA(driver)) {

			for (int i = 0; i < 5; i++) {

				// click on NEW button
				WaiteR(By.cssSelector(StartAPpage.getNewButAttr("css"))).click();

				// wait&click until NEW TICKET
				WaiteR(By.xpath(NewPage.getNewTicketAttr("xpath"))).click();

				// wait&senKeys until inputString for email is visible
				WaiteR(By.cssSelector(NewTickCompMessPage.getMailInputStringAttr("css")))
						.sendKeys("draftcustomer@gmail.com");

				// click on COMPOSE MESSAGE title to focus on page
				WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

				// wait close mail button - it's mark of alredy iputted email
				WaiteR(By.xpath(NewTickCompMessPage.getClearButtAttr("xpath")));

				// type in SUBJECT inputString
				WaiteR(By.cssSelector(NewTickCompMessPage.getSubjectStringAttr("css"))).sendKeys("draftSubject");

				// click on COMPOSE MESSAGE title to focus on page
				WaiteR(By.cssSelector(NewTickCompMessPage.getFocusPageAttr("css"))).click();

				// type in ticketBody
				WaiteR(By.cssSelector(NewTickCompMessPage.getTicketBodyAttr("css"))).sendKeys("draftContent");

				// initiate SEND Button
				WebElement sendBur = WaiteR(By.xpath(NewTickCompMessPage.getSendButtAttr("xpath")));

				// click on chatButtType via JavaExecutor
				Help.JavaExecInit(driver, "arguments[0].click();", sendBur);

				setPause(800);
				System.out.println(i);

				// wait&click on SEND button
				/// WaiteR(By.xpath(NewTickCompMessPage.getSendButtAttr("xpath"))).click();

				// wait&click on CLOSE button
				WaiteR(By.cssSelector(TicketBodyPage.getCloseButtAttr("css"))).click();
			}

			// logout from LA
			/// Help.logoutLA(driver, nameOfUser);

		} else {
			System.out.println("TestNO_Don't_approve_login_LA");
		}

	}
	*/

}
