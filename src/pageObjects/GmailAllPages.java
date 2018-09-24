package pageObjects;

public class GmailAllPages {

	public static String getSignInButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "div > a.gmail-nav__nav-link.gmail-nav__nav-link__sign-in";
			break;
		case "id":
			val = null;
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}

	public static String getMailStringAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//input[@id='identifierId']";
			break;
		case "css":
			val = "#identifierId";
			break;
		case "id":
			val = "identifierId";
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}

	public static String getMailButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "div#identifierNext span";
			break;
		case "id":
			val = null;
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}

	public static String getPsswStringAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "input[name=\\\"password\\\"]";
			break;
		case "id":
			val = null;
			break;
		case "name":
			val = "password";
			break;
		}
		return val;
	}

	public static String getPsswButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "div#passwordNext span";
			break;
		case "id":
			val = null;
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}

	public static String getMailBoxAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = null;
			break;
		case "id":
			val = ":4";
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}

	public static String getFirstItemSenderNameAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "(//span[@name='Dev/// Test'])[2]";
			break;
		case "css":
			val = "body.aAU:nth-child(2) div.nH:nth-child(3) div.nH div.nH.bkL:nth-child(2) div.no div.nH.bkK.nn:nth-child(2) div.nH div.nH div.nH.ar4.z div.AO div.Tm.aeJ div.aeF div.nH div.BltHke.nH.oy8Mbf.aE3 div.UI:nth-child(6) div.aDP div.ae4.aDM:nth-child(1) div.Cp:nth-child(2) table.F.cf.zt tr.zA.zE td.yX.xY:nth-child(5) div.yW span.bA4 > span.zF";
			break;
		case "id":
			val = null;
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}

	public static String getTrashIconAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@id=':5']/div[2]/div/div/div[2]/div[3]/div";
			break;
		case "css":
			val = null;
			break;
		case "id":
			val = null;
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}

	public static String getChangeAccAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "div#identifierLink p";
			break;
		case "id":
			val = null;
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}

	public static String getMailOptionButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = null;
			break;
		case "id":
			val = ":7p";
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}

	public static String getCCmailAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@id=':2']/div/div[2]/div/table/tr/td/div[2]/div[2]/div[2]/div/table/tbody/tr[4]/td[2]/span/span";
			break;
		case "css":
			val = null;
			break;
		case "id":
			val = null;
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}

	public static String getMailOptionsDataAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='ajB gt']";
			break;
		case "css":
			val = null;
			break;
		case "id":
			val = null;
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}

	public static String getComposeButtAttr(String s) {

		String val = null;
		
		switch (s) {
		
		case "xpath":
			val = "//div[@class='T-I J-J5-Ji T-I-KE L3']";
			break;
		case "css":
			val = null;
			break;
		case "id":
			val = null;
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}
	
	public static String getRecipientMailStringAttr(String s) {

		String val = null;
		
		switch (s) {
		
		case "xpath":
			val = "//div[@id=':8e']/div/textarea";
			break;
		case "xpath_1":
			val = "//div[@id=':89']/div/textarea";
			break;
		case "xpath_abs":
			val = "/html[1]/body[1]/div[26]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/textarea[1]";
			break;
		case "css":
			val = null;
			break;
		case "id":
			val = ":9c";
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}
	
	public static String getMailSubjectStringAttr(String s) {

		String val = null;
		
		switch (s) {
		
		case "xpath":
			val = "//div[@id=':8a']/input";
			break;
		case "css":
			val = null;
			break;
		case "id":
			val = null;
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}
	
	public static String getMailTextStringAttr(String s) {

		String val = null;
		
		switch (s) {
		
		case "xpath":
			val = "//div[@id=':9e']";
			break;
		case "css":
			val = null;
			break;
		case "id":
			val = null;
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}
	
	public static String getSendMailButtAttr(String s) {

		String val = null;
		
		switch (s) {
		
		case "xpath":
			val = "//div[@id=':7z']";
			break;
		case "css":
			val = null;
			break;
		case "id":
			val = null;
			break;
		case "name":
			val = null;
			break;
		}
		return val;
	}
	
}
