package pageObjects;

public class ConfigurationPage {
	
	public static String getCallButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='gwt-Label MenuItemTitle'][contains(text(),'Call')]";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.LayoutPanel.HorizontalLayoutPanel div.MenuPanel.ConfigurationMenu.FloatLeft div.MenuPanelContent div.menuItems.BlurMe:nth-child(4) div.GOISCWQDOCB:nth-child(4) div.MenuItemPanel > div.gwt-Label.MenuItemTitle";
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
	
	public static String getSystemButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[contains(text(),'System')]";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.LayoutPanel.HorizontalLayoutPanel div.MenuPanel.ConfigurationMenu.FloatLeft div.MenuPanelContent div.menuItems.BlurMe:nth-child(4) div.GOISCWQDOCB:nth-child(11) div.MenuItemPanel > div.gwt-Label.MenuItemTitle";
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

	public static String getGeneralButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[contains(text(),'General')]";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.LayoutPanel.HorizontalLayoutPanel div.MenuPanel.ConfigurationMenu.FloatLeft div.MenuPanelContent div.menuItems.BlurMe:nth-child(4) div.GOISCWQDOCB:nth-child(11) div.SubMenuItems div.SubMenuItemPanel:nth-child(1) > div.gwt-Label.SubMenuItemTitle";
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
