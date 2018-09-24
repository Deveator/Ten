package newpackage;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.GmailAllPages;
import pageObjects.LoginLAPage;
import pageObjects.StartAPpage;

public class Help {

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static String nameOfUser;
	public static String requiredNameOfUser = "Dev Test";
	public static int result = 0;
	public static DesiredCapabilities capabilities;

	public static void setGCD() {

		System.setProperty("webdriver.chrome.driver", "C:/Eclipse/project/drivers/googledriver/chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);
		// driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	public static void setFFD() {
		System.setProperty("webdriver.gecko.driver", "C:\\Eclipse\\project\\drivers\\geckodriver\\geckodriver.exe");
		capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		driver = new FirefoxDriver(capabilities);
		wait = new WebDriverWait(driver, 60);
	}

	public static void setRequiredUrl() {

	}

	public static void loginLA(WebDriver loginLADriver) {

		String baseUrl = "https://test-5-8.ladesk.com/agent/#login;";

		// Go to URL
		driver.get(baseUrl);

		// find Log in button and full page load
		WebElement logBut = WaiteR(By.xpath(LoginLAPage.getloginButtonAttr("xpath")));

		// find and sendKeys in userName string
		WaiteR(By.cssSelector(LoginLAPage.getUsernameStringAttr("css"))).sendKeys("andrejtimo6enko@gmail.com");

		// find and sendKeys in password string
		WaiteR(By.cssSelector(LoginLAPage.getPasswordStringAttr("css"))).sendKeys("O1T3JGvF");

		// find/initiate remember chechBox
		WebElement remChkbx = WaiteR(By.cssSelector(LoginLAPage.getRememberCheckboxAttr("css")));

		// get value from remember checkBox
		String s = remChkbx.getAttribute("aria-checked");

		// if true uncheck remember checkBox
		if (s.equals("true")) {
			remChkbx.click();
		}
/*
		// find/initiate lang string
		WebElement langStr = WaiteR(By.cssSelector(LoginLAPage.getLangStringAttr("css")));

		langStr.click();

		// set English in lang string
		for (int i = 0; i < 50; i++) {
			langStr.sendKeys(Keys.ARROW_UP);
		}
		for (int i = 0; i < 7; i++) {
			langStr.sendKeys(Keys.ARROW_DOWN);
		}
		langStr.sendKeys(Keys.ENTER);
		// end set "English" language
*/
		// click on LOGIN
		logBut.click();
	}

	public static void logoutLA(WebDriver logoutLADriver, String st) {

		// need to refresh for better webElement search
		logoutLADriver.navigate().refresh();

		// find agentName
		WaiteR(By.cssSelector(StartAPpage.getUserNameAttr("css")));

		// click on userName
		WaiteR(By.xpath(StartAPpage.getUserNameAttr("xpath"))).click();

		// click on LOGOUT
		WaiteR(By.xpath(StartAPpage.getLogOutButAttr("xpath"))).click();

		// check isOut and wait for page load
		if (WaiteR(By.xpath(LoginLAPage.getloginButtonAttr("xpath"))).getText().equals("Log In")) {

			WebElement wholeBodyText = logoutLADriver.findElement(By.tagName("body"));

			// check is userName on current page
			if (wholeBodyText.getText().contains(nameOfUser)) {
				result = 0;
			} else {
				result = 1;
			}
		} else {
			result = 0;
		}
	}

	public static boolean approveLoginLA(WebDriver approveLoginLADriver) {

		// get name of logged user and wait page load
		nameOfUser = WaiteR(By.cssSelector(StartAPpage.getUserNameAttr("css"))).getText();

		// compare requireName and actualName
		if (nameOfUser.equals(requiredNameOfUser)) {
			return true;
		} else {
			return false;
		}
	}

	public static void gmailLogin(WebDriver gmailLoginDriver, String emailName, String emailPassword) {

		// navigate to signinGmailPage
		gmailLoginDriver.navigate().to("https://www.google.com/intl/uk/gmail/about/");

		// wait/click on SIGN IN button
		WaiteR(By.cssSelector(GmailAllPages.getSignInButtAttr("css"))).click();

		// wait/send keys to mail inputString
		WaiteR(By.cssSelector(GmailAllPages.getMailStringAttr("css"))).sendKeys(emailName);

		// click on SEND button on mailPage
		WaiteR(By.cssSelector(GmailAllPages.getMailButtAttr("css"))).click();

		setPause(1000);

		// wait/send keys to password
		WaiteR(By.name(GmailAllPages.getPsswStringAttr("name"))).sendKeys(emailPassword);

		// click on SEND button on passwordPage
		WaiteR(By.cssSelector(GmailAllPages.getPsswButtAttr("css"))).click();
	}

	public static void gmailLoginAgain(WebDriver gmailLoginDriver, String emailName, String emailPassword) {

		// navigate to signinGmailPage
		gmailLoginDriver.navigate().to("https://www.google.com/intl/uk/gmail/about/");

		// wait/click on SIGN IN button
		WaiteR(By.cssSelector(GmailAllPages.getSignInButtAttr("css"))).click();

		// click on change account button
		WaiteR(By.cssSelector(GmailAllPages.getChangeAccAttr("css"))).click();

		// wait/send keys to mail inputString
		WaiteR(By.cssSelector(GmailAllPages.getMailStringAttr("css"))).sendKeys(emailName);

		// click on SEND button on mailPage
		WaiteR(By.cssSelector(GmailAllPages.getMailButtAttr("css"))).click();

		// wait/send keys to password
		WaiteR(By.name(GmailAllPages.getPsswStringAttr("name"))).sendKeys(emailPassword);

		// click on SEND button on passwordPage
		WaiteR(By.cssSelector(GmailAllPages.getPsswButtAttr("css"))).click();
	}

	public static void gmailLoginAgainAgain(WebDriver gmailLoginDriver, String emailName, String emailPassword) {

		// navigate to signinGmailPage
		gmailLoginDriver.navigate().to("https://www.google.com/intl/uk/gmail/about/");

		// wait/click on SIGN IN button
		WaiteR(By.cssSelector(GmailAllPages.getSignInButtAttr("css"))).click();

		// click on change account button
		WaiteR(By.cssSelector(GmailAllPages.getChangeAccAttr("css"))).click();

		// wait/send keys to mail inputString
		WaiteR(By.cssSelector(GmailAllPages.getMailStringAttr("css"))).sendKeys(emailName);

		// click on SEND button on mailPage
		WaiteR(By.cssSelector(GmailAllPages.getMailButtAttr("css"))).click();

		// wait/send keys to password
		WaiteR(By.name(GmailAllPages.getPsswStringAttr("name"))).sendKeys(emailPassword);

		// click on SEND button on passwordPage
		WaiteR(By.cssSelector(GmailAllPages.getPsswButtAttr("css"))).click();
	}

	public static void setPause(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readyElement(int i, WebDriver readyElementDriver, String st) {

		do {
			try {
				Thread.sleep(500 * i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
			System.out.println(i);
		} while (readyElementDriver.findElement(By.cssSelector("st")).isDisplayed());
		System.out.println(5);
		readyElementDriver.findElement(By.cssSelector("st")).click();
	}

	public static WebElement WaiteR(By locator) {

		Wait<WebDriver> wait = new WebDriverWait(driver, 35).ignoring(org.openqa.selenium.NoSuchElementException.class,
				org.openqa.selenium.ElementNotVisibleException.class);

		WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(locator);
			}
		});
		return foo;
	}

	public static void checkResult(int i) {

		if (i == 1) {
			System.out.println("TestOK");
		} else {
			System.out.println("TestNO");
		}

	}

	public static void JavaExecInit(WebDriver javaExecInitDriver, String s, WebElement we) {

		JavascriptExecutor jse = (JavascriptExecutor) javaExecInitDriver;

		jse.executeScript(s, we);
	}

	public static void JavaExecScroll(WebDriver javaExecScrollDriver, String s) {

		JavascriptExecutor jse = (JavascriptExecutor) javaExecScrollDriver;

		jse.executeScript(s);
	}

}
