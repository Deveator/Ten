package pageObjects;

public class CustomerPortalSettings {

	public static String getCustomizeDesignButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//span[contains(text(),'Customize design')]";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.CustomerPortalSettings.ContentPadding.ConfigurationBlock.ConfigurationWidget div.FieldsetContent div.StepWithImage.CustomerPortalDesign:nth-child(1) div.ImLeButton.ImLeButtonMainOut.GreenButton:nth-child(3) div.ImLeButtonMain.buttonBorderColor.buttonBgColor div.ImLeButtonMainInnerBox.buttonInnerBorderColor div.ImLeButtonMainInner div.ImLeButtonMainContent > span.buttonText";
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

	public static String getTrackingCodesButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[contains(text(),'Tracking codes')]";
			break;
		case "css":
			val = "body.Lang-en-US.DialogOpened:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.GOISCWQDODB div.DialogPanel.ContentDialogWithMenu div.DialogContentPanel div.FormViewWithMenuBase.HorizontalLayoutPanel.PopupWithMenuContent div.ContactWidgetMenu.FloatLeft div.MenuSection.DialogMenuItem.OnlyFormMenuItem:nth-child(3) div.MenuItemView > div.Item";
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

	public static String getBeforeBodyStringAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//textarea[@name='bodyEndTrackingCode']";
			break;
		case "css":
			val = "body.Lang-en-US.DialogOpened:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.GOISCWQDODB div.DialogPanel.ContentDialogWithMenu div.DialogContentPanel div.FormViewWithMenuBase.HorizontalLayoutPanel.PopupWithMenuContent div.FloatLeft.ContactWidgetFormPanel.ContentScrolled div.DesignFormWidgetBase div.DesignFormWidgetFields div.g-FormField2.g-FormField2-empty.FormfieldAsNewFormField.FormFieldSeparator.FluidFormField:nth-child(4) div.g-FormField2-InputContainer div.g-FormField2-InputPanel:nth-child(1) div.TextBoxContainer > textarea.gwt-TextArea";
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
			val = "body.Lang-en-US.DialogOpened:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.GOISCWQDODB div.DialogPanel.ContentDialogWithMenu div.DialogContentPanel div.FormViewWithMenuBase.HorizontalLayoutPanel.PopupWithMenuContent div.FloatLeft.ContactWidgetFormPanel.ContentScrolled div.DesignFormWidgetBase div.NewFormFieldButton div.Buttons div.ImLeButton.ImLeButtonMainOut.GreenButton:nth-child(1) div.ImLeButtonMain.buttonBorderColor.buttonBgColor div.ImLeButtonMainInnerBox.buttonInnerBorderColor div.ImLeButtonMainInner div.ImLeButtonMainContent > span.buttonText";
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

	public static String getTrackingCodesCloseButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='gwt-Label CloseLabel']";
			break;
		case "css":
			val = "body.Lang-en-US.DialogOpened:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.GOISCWQDODB div.DialogPanel.ContentDialogWithMenu div.DialogHeaderPanel > div.gwt-Label.CloseLabel:nth-child(3)";
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
