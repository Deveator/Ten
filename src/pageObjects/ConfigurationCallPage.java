package pageObjects;

public class ConfigurationCallPage {

	public static String getNumbersButtAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='gwt-Label SubMenuItemTitle'][contains(text(),'Numbers')]";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.LayoutPanel.HorizontalLayoutPanel div.MenuPanel.ConfigurationMenu.FloatLeft div.MenuPanelContent div.menuItems.BlurMe:nth-child(4) div.GOISCWQDOCB:nth-child(4) div.SubMenuItems div.SubMenuItemPanel:nth-child(2) > div.gwt-Label.SubMenuItemTitle";
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
