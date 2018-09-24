package pageObjects;

public class KBPage {
	
	public static String getChatButAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='circleChatBubble']";
			break;
		case "css":
			val = "body.montana.page-mytickets:nth-child(2) div:nth-child(14) div:nth-child(1) div.circleChatButtonWrap > div.circleChatBubble";
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
