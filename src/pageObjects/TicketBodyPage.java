package pageObjects;

public class TicketBodyPage {
	
	public static String getCloseButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "div#body div.RightButtons > div > div > div > div > div.ImLeButtonMainContent > span";
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
	
	public static String getCCmailAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//body[@class='Lang-en-US']//div[@id='body']//div[@class='LayoutPanel VerticalLayoutPanel']//div[@class='LayoutPanel HorizontalLayoutPanel ContentPanel']//div[@class='Content FloatLeft']//div[@class='BasePanelViewImpl TicketDetail']//div[@class='LayoutPanel HorizontalLayoutPanel']//div[@class='ContentWrapper FloatLeft']//div[@class='ContentWrapperIn']//div[@class='DecoratedContentWidget']//div//div[@class='TicketDetailPanel']//div[@class='TicketDetailRightPanel FloatLeft']//div[@class='ConversationDetailsViewWrapper']//div[@class='LayoutPanel VerticalLayoutPanel ConversationDetailsView']//div[@class='TicketInfoView']//div[@class='OwnerFormWidgetWrapper InfoWidgetView']//div[@class='OwnerFormWidget']//div[@class='ExtendedOwnerWidgetContainer']//div[@class='WidgetPanel']//div[@class='RecipientsScrollPanel']//div//div//div//div[2]//div[2]//div[2]//div[2]";
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

	public static String getRecipientListIconAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@title='Recipients']//div[@class='buttonIcon']";
			break;
		case "css":
			val = null;
			break;
		case "id":
			val = null;
			break;
		case "classs":
			val = "buttonContainer TabButtonTicketRecipients expanded";
			break;
		}
		return val;
	}
	
	public static String getSenderNameAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl.TicketDetail div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.TicketDetailPanel div.LayoutPanel.VerticalLayoutPanel.TicketDetailMainPanel.FloatLeft div.ConversationView.New.ConversationStatusN.ConversationChannelE div.ConversationViewImpl:nth-child(2) div.MessageListContainer:nth-child(2) div.GOISCWQDESB.MessageList.ScrolledToBottom div.GOISCWQDHSB div.GOISCWQDGSB.MessageListContent div.MessageGroup.MessageGroupStatusV.MessageGroupFocus.offlineMessagesGroupCustomer.MessageGroupContentHasAvatar div.MessageGroupHeaderContainer div.MessageGroupHeader div.NoUnread div.UserInfo:nth-child(2) > div.UserName.FloatLeft.HeaderUserName";
			break;
		case "id":
			val = null;
			break;
		case "classs":
			val = null;
			break;
		}
		return val;
	}
	
	public static String getReplyButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//span[contains(text(),'reply')]";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl.TicketDetail div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.TicketDetailPanel div.LayoutPanel.VerticalLayoutPanel.TicketDetailMainPanel.FloatLeft div.ConversationView.New.ConversationStatusN.ConversationChannelE div.ConversationViewImpl:nth-child(2) div.ActionPanel:nth-child(4) div.ActionBox div.CollapsedActionViewImpl.StatusN div.ActionInputBox:nth-child(1) div.FormSection div.InputBoxButton.InputBox div.ReplyForwardPanel span.Span.ActionLink.InputBoxButton-secondary.InputAction-Reply:nth-child(4) > span.Span.InputBoxButtonLabel";
			break;
		case "id":
			val = null;
			break;
		case "classs":
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
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl.TicketDetail div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.TicketDetailPanel div.LayoutPanel.VerticalLayoutPanel.TicketDetailMainPanel.FloatLeft div.ConversationView.New.ConversationStatusN.ConversationChannelE.MessageListScrollVisible div.ConversationViewImpl:nth-child(2) div.ActionPanel:nth-child(4) div.ActionBox div.ExpandedActionInputBox.StatusN div.ActionInputBox:nth-child(1) div.FormSection:nth-child(3) div.InnerMailReplyView div.InnerMailReplyEditor div.SwitchableEditor.ReplyEditor.SwitchableEditor-plain div.InputButtonsPanel div.FloatLeft.TicketInputSendOrDiscard:nth-child(5) div.ImLeButton.ImLeButtonMainOut.GreenButton:nth-child(1) div.ImLeButtonMain.buttonBorderColor.buttonBgColor div.ImLeButtonMainInnerBox.buttonInnerBorderColor div.ImLeButtonMainInner div.ImLeButtonMainContent > span.buttonText";
			break;
		case "id":
			val = null;
			break;
		case "classs":
			val = null;
			break;
		}
		return val;
	}
}
