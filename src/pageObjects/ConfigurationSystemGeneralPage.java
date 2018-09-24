package pageObjects;

public class ConfigurationSystemGeneralPage {
	
	public static String getNumberOfDaysStringAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//input[@name='purge_deleted_conversations_after']";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.ConfigurationView.FormFieldset.ContentPadding div.PurgeDeletedContent.FormFieldSeparator:nth-child(6) div.g-FormField2.FormfieldAsNewFormField.NumberInput.g-FormField2-filled div.g-FormField2-InputContainer div.g-FormField2-InputPanel:nth-child(1) div.TextBoxContainer.TextBoxContainer-Integer.TextBoxContainer-mandatory > input.TextBox";
			break;
		case "id":
			val = null;
			break;
		case "className":
			val = null;
			break;
		}
		return val;
	}
	
	public static String getDeleteOldSentMailsStringAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//input[@name='delete_old_sent_mails']";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.ConfigurationView.FormFieldset.ContentPadding div.DeleteOldMailsContent.FormFieldSeparator:nth-child(8) div.g-FormField2.FormfieldAsNewFormField.NumberInput.g-FormField2-filled div.g-FormField2-InputContainer div.g-FormField2-InputPanel:nth-child(1) div.TextBoxContainer.TextBoxContainer-Integer.TextBoxContainer-mandatory > input.TextBox";
			break;
		case "id":
			val = null;
			break;
		case "className":
			val = null;
			break;
		}
		return val;
	}
	
	public static String getSaveButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//span[contains(text(),'Save')]";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.ConfigurationView.FormFieldset.ContentPadding div.NewFormFieldContent:nth-child(17) div.ImLeButton.ImLeButtonMainOut.GreenButton div.ImLeButtonMain.buttonBorderColor.buttonBgColor div.ImLeButtonMainInnerBox.buttonInnerBorderColor div.ImLeButtonMainInner div.ImLeButtonMainContent > span.buttonText";
			break;
		case "id":
			val = null;
			break;
		case "className":
			val = null;
			break;
		}
		return val;
	}
	
	public static String getInfoMessageAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//span[@class='FormMessageText']";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.ConfigurationView.FormFieldset.ContentPadding div.NewFormFieldContent:nth-child(17) div.FormMessage.FormMessage-error > span.FormMessageText";
			break;
		case "id":
			val = null;
			break;
		case "className":
			val = null;
			break;
		}
		return val;
	}

}
