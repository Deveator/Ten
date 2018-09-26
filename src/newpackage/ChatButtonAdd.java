package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pageObjects.ChatSectionPage;
import pageObjects.CustomerPortalPage;
import pageObjects.CustomerPortalSettings;
import pageObjects.KBPage;
import pageObjects.StartAPpage;

/*
 * 
 * First clean the page from the code
 * 
 * Add setPause method for user simulate
 * 
 */
public class ChatButtonAdd extends Help {

	public static void main(String[] args) {

		String baseUrl = "https://test-5-8.ladesk.com";

		// Set GoogleChrome Driver
		Help.setGCD();

		// Go to URL
		driver.get(baseUrl);

		try {
			// try to find chatButton on KB page
			WaiteR(By.xpath(KBPage.getChatButAttr("xpath")));
			// need to add some code if chatButton is found())))))))))))
			System.out.println("ChatButton IS found");
			/*
			 * // start code if chatButton is found
			 * driver.get("https://test-5-7.ladesk.com/agent/#login;");
			 * 
			 * Help.loginLA(driver);
			 * 
			 * // click on chatIcon
			 * WaiteR(By.xpath(StartAPpage.getChatIconAttr("xpath"))).click();
			 * 
			 * // click on 'Chat buttons" button
			 * WaiteR(By.xpath(ChatSectionPage.getChatButtonsButAttr("xpath"))).click();
			 * 
			 * // click on chatbutton //
			 * WaiteR(By.xpath(ChatSectionPage.getChatButtAttr("xpath"))).click();
			 * WebElement po = WaiteR(By.xpath(ChatSectionPage.getChatButtAttr("xpath")));
			 * Help.JavaExecInit(driver, "arguments[0].click();", po);
			 * System.out.println("Hool");
			 * 
			 * setPause(1000);
			 * 
			 * // click on DELETE button
			 * WaiteR(By.xpath(ChatSectionPage.getDeleteButtAttr("xpath"))).click();
			 * setPause(1000);
			 * 
			 * // click on YES on CONFIRMATION MESSAGE button
			 * WaiteR(By.xpath(ChatSectionPage.getYesButtAttr("xpath"))).click();
			 * setPause(1000);
			 * 
			 * // set to go on
			 * WaiteR(By.xpath(CustomerPortalSettings.getCustomizeDesignButtAttr("xpath"))).
			 * click();
			 * 
			 */ driver.close();

		} catch (Exception e) {
			System.out.println("ChatButton isn't found");
			// catch TimeOutException to login LA
		//	driver.get("https://test-5-7.ladesk.com/agent/#login;");

			Help.loginLA(driver);
		}

		// click on chatIcon
		WaiteR(By.xpath(StartAPpage.getChatIconAttr("xpath"))).click();

		// click on 'Chat buttons" button
		WaiteR(By.xpath(ChatSectionPage.getChatButtonsButAttr("xpath"))).click();

		// click on "Create" button
		WaiteR(By.xpath(ChatSectionPage.getCreateButAttr("xpath"))).click();

		// time to wait list of chatButtons type appear
		setPause(3000);

		// initiate chatButtonType
		WebElement chatButtType = WaiteR(By.xpath(ChatSectionPage.getFirstButtTypeAttr("xpath")));

		// click on chatButtType via JavaExecutor
		Help.JavaExecInit(driver, "arguments[0].click();", chatButtType);

		setPause(3000);

		// click on INTEGRATE button
		WaiteR(By.xpath(ChatSectionPage.getIntegrateButtAttr("xpath"))).click();

		// intialize
		WebElement f = WaiteR(By.xpath(ChatSectionPage.getIntegrCodeButtAttr("xpath")));
		// click/mark code
		f.click();
		// set pause to save
		setPause(700);
		// copy code
		f.sendKeys(Keys.CONTROL + "c");

		// set pause to save
		setPause(700);

		// click on CLOSE button
		WaiteR(By.xpath(ChatSectionPage.getCloseButtInegCodeAttr("xpath"))).click();

		// click on customerPortal icon
		WaiteR(By.xpath(StartAPpage.getCustomerPortalIconAttr("xpath"))).click();

		// click on SETTINGS button
		WaiteR(By.xpath(CustomerPortalPage.getSettingsButtAttr("xpath"))).click();

		// click on customizeDesign button
		WaiteR(By.xpath(CustomerPortalSettings.getCustomizeDesignButtAttr("xpath"))).click();

		// may be add setPause

		// click on trackingCodes button
		WebElement we = WaiteR(By.xpath(CustomerPortalSettings.getTrackingCodesButtAttr("xpath")));
		Help.JavaExecInit(driver, "arguments[0].click();", we);

		// use to scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		// click on beforeBody section
		WebElement ff = WaiteR(By.xpath(CustomerPortalSettings.getBeforeBodyStringAttr("xpath")));
		Help.JavaExecInit(driver, "arguments[0].click();", ff);

		// need pause
		setPause(800);

		// paste code
		ff.sendKeys(Keys.CONTROL + "v");

		// need pause
		setPause(700);

		// click on SAVE button
		WaiteR(By.xpath(CustomerPortalSettings.getSaveButtAttr("xpath"))).click();

		// need pause
		setPause(1000);

		// click on CLOSE button
		WaiteR(By.xpath(CustomerPortalSettings.getTrackingCodesCloseButtAttr("xpath"))).click();

		// need pause chatButton to be set
		setPause(15000);

		// Go to URL
		driver.get(baseUrl);

		// find chatButton
		try {
			// try to find chatButton on KB page
			WaiteR(By.xpath(KBPage.getChatButAttr("xpath")));
			checkResult(1);
			driver.close();

		} catch (Exception e) {
			System.out.println("ChatButton isn't found");
			checkResult(0);
			driver.close();
		}
	}
}