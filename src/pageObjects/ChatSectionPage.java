package pageObjects;

public class ChatSectionPage {
	
	public static String getChatButtonsButAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[contains(text(),'Chat Buttons')]";
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
	
	public static String getCreateButAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//span[contains(text(),'Create')]";
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

	public static String getFirstButtTypeAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='g-Table']//div//div[1]//table[1]//tbody[1]//tr[1]//td[1]//div[1]//div[1]//div[3]";
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
	public static String getIntegrateButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//span[contains(text(),'Integrate')]";
			break;
		case "css":
			val = "body.Lang-en-US.DialogOpened:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.GOISCWQDODB div.DialogPanel.ContentDialogWithMenu div.DialogContentPanel div.FormViewWithMenuBase.HorizontalLayoutPanel.PopupWithMenuContent div.FloatLeft.ContactWidgetFormPanel.ContentScrolled div.OverviewFormWidget div.OverviewFormColumns div.OverviewFormSettings div.OverviewFormStatsPanel:nth-child(1) div.IntegrateMessageBox div.ImLeButton.ImLeButtonMainOut div.ImLeButtonMain.buttonBorderColor.buttonBgColor div.ImLeButtonMainInnerBox.buttonInnerBorderColor div.ImLeButtonMainInner div.ImLeButtonMainContent > span.buttonText";
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
	
	public static String getIntegrCodeButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//textarea[@class='gwt-TextArea Closelabel IntegrationCode']";
			break;
		case "css":
			val = "body.Lang-en-US.DialogOpened:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.GOISCWQDODB div.DialogPanel.ContentDialogWithMenu div.DialogContentPanel div.FormViewWithMenuBase.HorizontalLayoutPanel.PopupWithMenuContent div.FloatLeft.ContactWidgetFormPanel.ContentScrolled div.IntegrationFormWidget div.IntegrationWidget:nth-child(2) > textarea.gwt-TextArea.Closelabel.IntegrationCode";
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
	
	public static String getCloseButtInegCodeAttr(String s) {

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
		case "name":
			val = null;
			break;
		}
		return val;
	}
	
	public static String getChatButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='GOISCWQDBVB']";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.ContactWidgetsView div.LayoutPanel.VerticalLayoutPanel.GridWithSearch.SimpleColumnTable.RowH250 div.TablePanel div.g-TablePanel div.TableBodyPanel:nth-child(2) div.g-Table:nth-child(1) div.g-TableRow.g-TableRow-Even.FloatLeft.g-TableRow-focused tr:nth-child(1) td:nth-child(1) div.ContactWidgetCellWidget.TypeC div.HtmlPreviewWithHoverButton.GOISCWQDMNB.EditHoverButton > div.GOISCWQDBVB";
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
	
	public static String getDeleteButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//span[contains(text(),'Delete')]";
			break;
		case "css":
			val = "body.Lang-en-US.DialogOpened:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.GOISCWQDODB div.DialogPanel.ContentDialogWithMenu div.DialogContentPanel div.FormViewWithMenuBase.HorizontalLayoutPanel.PopupWithMenuContent div.FloatLeft.ContactWidgetFormPanel.ContentScrolled div.OverviewFormWidget div.OverviewFormColumns div.OverviewFormSettings div.ImLeButton.ImLeButtonMainOut.ButtonLikeLink:nth-child(4) div.ImLeButtonMain.buttonBorderColor.buttonBgColor div.ImLeButtonMainInnerBox.buttonInnerBorderColor div.ImLeButtonMainInner div.ImLeButtonMainContent > span.buttonText";
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
	
	public static String getYesButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//span[contains(text(),'Yes')]";
			break;
		case "css":
			val = "body.Lang-en-US.DialogOpened:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.GOISCWQDODB div.DialogPanel.ConfirmDialog:nth-child(3) div.DialogContentPanel div.ConfirmDialogView div.ConfirmDialogContent div.PopupActionButtons:nth-child(2) div.ImLeButton.ImLeButtonMainOut.GreenButton:nth-child(1) div.ImLeButtonMain.buttonBgColor.buttonBorderColor div.ImLeButtonMainInnerBox.buttonInnerBorderColor div.ImLeButtonMainInner div.ImLeButtonMainContent > span.buttonText";
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
