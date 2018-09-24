package pageObjects;

public class ConfigurationCallNumbersPage {
	
	public static String getTablePanelAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//div[@class='TablePanel']";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.PhoneDepartmentNumbersViewImpl.Rows34 div.LayoutPanel.VerticalLayoutPanel.GridWithSearch > div.TablePanel";
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
	
	public static String getDownArrowAttr(String s) {

		String val = null;
		switch (s) {
		case "xpath":
			val = "//body[@class='Lang-en-US']//div[@id='body']//div[@class='LayoutPanel VerticalLayoutPanel']//div[@class='LayoutPanel HorizontalLayoutPanel ContentPanel']//div[@class='Content FloatLeft']//div[@class='BasePanelViewImpl']//div[@class='LayoutPanel HorizontalLayoutPanel']//div[@class='ContentWrapper FloatLeft']//div[@class='ContentWrapperIn']//div[@class='DecoratedContentWidget']//div[@class='PhoneDepartmentNumbersViewImpl Rows34']//div[@class='LayoutPanel VerticalLayoutPanel GridWithSearch']//div[@class='TablePanel']//div[@class='g-TablePanel']//div[@class='g-Table']//div//div[@class='g-TableHeader dragdrop-dropTarget dragdrop-boundary']//div[3]//div[3]";
			break;
		case "css":
			val = "body.Lang-en-US:nth-child(2) div.Body:nth-child(2) div.LayoutPanel.VerticalLayoutPanel div.LayoutPanel.HorizontalLayoutPanel.ContentPanel:nth-child(2) div.Content.FloatLeft div.BasePanelViewImpl div.LayoutPanel.HorizontalLayoutPanel div.ContentWrapper.FloatLeft div.ContentWrapperIn div.DecoratedContentWidget div.PhoneDepartmentNumbersViewImpl.Rows34 div.LayoutPanel.VerticalLayoutPanel.GridWithSearch div.TablePanel div.g-TablePanel div.g-Table div:nth-child(1) div.g-TableHeader.dragdrop-dropTarget.dragdrop-boundary div.g-TableHeaderCell.dragdrop-draggable.dragdrop-handle.g-TableHeaderCellWithMenu:nth-child(2) > div.g-MenuIcon";
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
