package pageObjects;

public class StartAPpage {

	public static String getUserNameAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@id='body']/div/div/div[4]/div[5]/div/div/div/div[2]/div";
			break;
		case "css":
			val = "div#body div.gwt-Label.LoggedUserName";
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

	public static String getLogOutButAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[6]/div/div/div/div[4]/div[2]/div";
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

	public static String getNewButAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = null;
			break;
		case "css":
			val = "div#body div.gwt-Label.TaskTitle";
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
	public static String getNumOfNewTicketsAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='FloatLeft ServiceStatusTextPart']";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.HeaderPanel:nth-child(1) div.MyStatus.MyStatusMainPanel.FloatLeft div.ServiceStatusWidgets:nth-child(2) div.TodoNotification.ServiceStatusButton.ServiceStatusWidget.TodoNotification-TicketToDo div.FloatLeft.ServiceStatusTextPart:nth-child(2) > div.gwt-Label.ServiceStatusCount.FloatLeft:nth-child(3)";
			break;
		case "id":
			val = null;
			break;
		case "className":
			val = "FloatLeft ServiceStatusTextPart";
			break;
		}
		return val;
	}
	
	public static String getTicketsIconAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='menuItem Tickets TicketsMenuItem']//div[@class='IconPanel']";
			break;
		case "css":
			val = null;
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
	
	public static String getChatIconAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='menuItem Chats TicketsMenuItem']//div[@class='IconPanel']";
			break;
		case "css":
			val = null;
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
	
	public static String getCustomerPortalIconAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='menuItem Knowledgebase']//div[@class='IconPanel']";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.menuPanel.menuPanelCollapsed.FloatLeft div.EntriesPanel div.menuItem.Knowledgebase:nth-child(7) > div.IconPanel";
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
	
	public static String getConfigurationIconAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='menuItem Configuration']//div[@class='IconPanel']";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.menuPanel.menuPanelCollapsed.FloatLeft div.EntriesPanel div.menuItem.Configuration:nth-child(8) > div.IconPanel";
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
