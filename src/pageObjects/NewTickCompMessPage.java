package pageObjects;

public class NewTickCompMessPage {
	
	public static String getMailInputStringAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "div#body div.ContactFieldInputWidget.FloatLeft.emailFieldEdit.emailFieldFocus > input";
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
	
	public static String getFocusPageAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "div#body div.ScreenTitle";
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

	public static String getClearButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='RecipientsFields']//div[1]//div[1]//div[2]";
			break;
		case "css":
			val = "div#body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl.TicketDetail div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.FormPanel.CreateConversationForm div.ComposeMessageForm div.AdvancedViewRecipientsPanel:nth-child(1) div.GOISCWQDFPB.ToRecipient.RecipientsWidget:nth-child(1) div.RecipientsFields div.ContactFieldInputWidget.FloatLeft:nth-child(1) div.ContactFieldInfoPanel > div.gwt-HTML.InputClearButton";
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
	
	public static String get2ClearButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='RecipientsFields']//div[2]//div[1]//div[2]";
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
	public static String getAddccClearButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='GOISCWQDFPB RecipientsWidget']//div[@class='gwt-HTML InputClearButton']";
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
	
	public static String getSubjectStringAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='TextBoxContainer TextBoxContainer-mandatory']";
			break;
		case "css":
			val = "input.TextBox";
			break;
		case "css2":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl.TicketDetail div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.FormPanel.CreateConversationForm div.ComposeMessageForm div.g-FormField2.g-FormField2-empty.ComposeMessageSubject:nth-child(6) div.g-FormField2-InputContainer div.g-FormField2-InputPanel:nth-child(1) div.TextBoxContainer.TextBoxContainer-mandatory > input.TextBox";
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
	
	public static String getTicketBodyAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "div#body textarea";
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
	public static String getSendButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//span[contains(text(),'Send')]";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl.TicketDetail div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.FormPanel.CreateConversationForm div.ComposeMessageForm div.LeftButtons:nth-child(9) div.ImLeButton.ImLeButtonMainOut.GreenButton.ImLeButton-over:nth-child(1) div.ImLeButtonMain.buttonOverBgColor.buttonOverBorderColor div.ImLeButtonMainInnerBox.buttonOverInnerBorderColor div.ImLeButtonMainInner div.ImLeButtonMainContent > span.buttonText";
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
	
	public static String getAddMailButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='GOISCWQDFPB ToRecipient RecipientsWidget']//div[@class='gwt-Label GOISCWQDDPB FloatLeft'][contains(text(),'add')]";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayout";
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
	public static String getAddMailInpuTStringAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@id='body']/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[2]/input";
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
	
	public static String getAddccButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val ="//div[contains(text(),'Add Cc')]";
			break;
		case "css":
			val = "div#body div.GOISCWQDIPB.RecipientOptions > div:nth-child(3)";
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
	public static String getAddccStringAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@id='body']/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/div/input";
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
	
	public static String getAddbccButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val ="//div[contains(text(),'Add Bcc')]";
			break;
		case "css":
			val = "div#body div.GOISCWQDIPB.RecipientOptions > div:nth-child(3)";
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
	
	public static String getAddbccStringAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@id='body']/div/div[2]/div[2]/div/div/div[2]/div/div/div/div[2]/div/div/div[3]/div[2]/div/input";
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
	
	public static String getIconAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@id='body']/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[3]/div/div/div[2]/div/div/div[2]/div/div[2]/div/div/div/div/div[2]/div";
			break;
		case "css":
			val = "div#body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutP";
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
