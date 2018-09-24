package pageObjects;

public class CustomerPortalPage {
	
	public static String getSettingsButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[contains(text(),'Settings')]";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.LayoutPanel.HorizontalLayoutPanel div.MenuPanel.FloatLeft div.MenuPanelContent div.menuItems.BlurMe:nth-child(4) div.GOISCWQDOCB:nth-child(5) div.MenuItemPanel > div.gwt-Label.MenuItemTitle";
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
