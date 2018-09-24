package pageObjects;

public class TicketSectionPage {

	// need to delete I create another
	public static String getTableAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='g-TableContentPanel ContentPanel RowH52']";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl.Tickets div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.ConversationManager.Tickets.DecoratedContentWidget div.LayoutPanel.VerticalLayoutPanel.GridWithSearch div.TablePanel div.g-TablePanel > div.g-Table";
			break;
		case "id":
			val = null;
			break;
		case "className":
			val = null;
			break;
		case "text":
			val = null;
			break;
		}
		return val;
	}
}
