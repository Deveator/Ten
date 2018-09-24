package pageObjects;

public class LoginLAPage {

	public static String getloginButtonAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@id='body']/div/div/div/div[10]/div/div/div/div[2]/span";
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
	
	public static String getOldloginButtonAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//span[contains(text(),'Log In')]";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.LoginMain:nth-child(2) div.LoginBox div.LoginForm div.LoginFormContent div.Body div.GCI24E0P4.MainLoginPanel div.FormPanel.DecoratedContentWidget div.ImLeButton.ImLeButtonMainOut.LoginButton.GreenButton:nth-child(10) div.ImLeButtonMain.buttonBorderColor.buttonBgColor div.ImLeButtonMainInnerBox.buttonInnerBorderColor div.ImLeButtonMainInner div.ImLeButtonMainContent > span.buttonText";
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

	public static String getUsernameStringAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "input[name=\"username\"]";
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

	public static String getPasswordStringAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "input[name=\"password\"]";
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

	public static String getRememberCheckboxAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "div#body div.CheckBox.CheckBox-checked";
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

	public static String getLangStringAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.LoginMain:nth-child(2) div.LoginBox div.LoginForm div.LoginFormContent div.Body div.GCI24E0P4.MainLoginPanel div.FormPanel.DecoratedContentWidget div.g-FormField2:nth-child(4) div.g-FormField2-InputContainer div.g-FormField2-InputPanel:nth-child(1) div.g-ListBox > input.g-ListBoxInput";
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
