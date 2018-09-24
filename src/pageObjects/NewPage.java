package pageObjects;



public class NewPage {


	public static String getNewTicketAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[contains(text(),'New Ticket')]";
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
