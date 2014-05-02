package asset.web.ui;

import java.util.HashMap;
import java.util.Map;

/**
 * Page information should be included in model for every html view render 
 * @author det
 *	
 */
public class Page {
	/**
	 * default constructor
	 * turn every menu to inactive state
	 */
	public Page() {
		this.siteMenu.put(_SM_DASHBOARD, false);
		this.siteMenu.put(_SM_REPORTS, false);
		
		this.siteMenu.put(_SM_ASSETMODELS, false);
		this.siteMenu.put(_SM_ASSETS, false);
		this.siteMenu.put(_SM_CHECKOUTASSET, false);
		this.siteMenu.put(_SM_RETURNASSET, false);
		
		this.siteMenu.put(_SM_INVENTORY, false);
		this.siteMenu.put(_SM_TAKEOUTINVENTORY, false);
		this.siteMenu.put(_SM_RESTOCKINVENTORY, false);
		
		this.siteMenu.put(_SM_ADMIN_DASHBOARD, false);
		this.siteMenu.put(_SM_ADMIN_CATEGORY, false);
		this.siteMenu.put(_SM_ADMIN_BRAND, false);
		this.siteMenu.put(_SM_ADMIN_USER, false);
	}
	
	final String _SM_DASHBOARD = "_sm_dashboard";
	final String _SM_REPORTS = "_sm_reports";
	
	final String _SM_ASSETMODELS = "_sm_assetModels";
	final String _SM_ASSETS = "_sm_assets";
	final String _SM_CHECKOUTASSET = "_sm_checkoutAsset";
	final String _SM_RETURNASSET = "_sm_returnAsset";
	
	final String _SM_INVENTORY = "_sm_inventory";
	final String _SM_TAKEOUTINVENTORY = "_sm_takeoutInvetory";
	final String _SM_RESTOCKINVENTORY = "_sm_restockInvetory";
	
	final String _SM_ADMIN_DASHBOARD = "_sm_admin_dashboard";
	final String _SM_ADMIN_CATEGORY = "_sm_admin_category";
	final String _SM_ADMIN_BRAND = "_sm_admin_brand";
	final String _SM_ADMIN_USER = "_sm_admin_user";
		
	
	/**
	 * show admin Navigation Menu
	 * default to false, set to true to show admin navigation menu 
	 * instead of user navigation menu
	 */
	public Boolean adminNav = false;
	
	/**
	 * set adminNav to true
	 */
	public Page setAdminNav() {
		this.adminNav = true;
		return this;
	}

	
	/**
	 * Mapping of menu name and boolean to indicate active/inactive state 
	 */
	private Map<String, Boolean> siteMenu = new HashMap<String, Boolean>();
	
	public Page setSmDashboard() {
		this.siteMenu.put(_SM_DASHBOARD, true);
		return this;
	}
	public Boolean getSmDashboard(){
		return this.siteMenu.get(_SM_DASHBOARD);
	}
	public Page setSmReports() {
		this.siteMenu.put(_SM_REPORTS, true);
		return this;
	}
	public Boolean getSmReports(){
		return this.siteMenu.get(_SM_REPORTS);
	}
	public Page setSmAssetModels() {
		this.siteMenu.put(_SM_ASSETMODELS, true);
		return this;
	}
	public Boolean getSmAssetModels(){
		return this.siteMenu.get(_SM_ASSETMODELS);
	}
	public Page setSmAssets() {
		this.siteMenu.put(_SM_ASSETS, true);
		return this;
	}
	public Boolean getSmAssets(){
		return this.siteMenu.get(_SM_ASSETS);
	}
	public Page setSmCheckoutAsset() {
		this.siteMenu.put(_SM_CHECKOUTASSET, true);
		return this;
	}
	public Boolean getSmCheckoutAsset(){
		return this.siteMenu.get(_SM_CHECKOUTASSET);
	}
	public Page setSmReturnAsset() {
		this.siteMenu.put(_SM_RETURNASSET, true);
		return this;
	}
	public Boolean getSmReturnAsset(){
		return this.siteMenu.get(_SM_RETURNASSET);
	}
	public Page setSmInventory() {
		this.siteMenu.put(_SM_INVENTORY, true);
		return this;
	}
	public Boolean getSmInventory(){
		return this.siteMenu.get(_SM_INVENTORY);
	}
	public Page setSmTakeoutInventory() {
		this.siteMenu.put(_SM_TAKEOUTINVENTORY, true);
		return this;
	}
	public Boolean getSmTakeoutInventory(){
		return this.siteMenu.get(_SM_TAKEOUTINVENTORY);
	}
	public Page setSmRestockInventory() {
		this.siteMenu.put(_SM_RESTOCKINVENTORY, true);
		return this;
	}
	public Boolean getSmRestockInventory(){
		return this.siteMenu.get(_SM_RESTOCKINVENTORY);
	}
	
	public Page setSmAdminDashboard() {
		this.siteMenu.put(_SM_ADMIN_DASHBOARD, true);
		return this;
	}
	public Boolean getSmAdminDashboard(){
		return this.siteMenu.get(_SM_ADMIN_DASHBOARD);
	}
	
	public Page setSmAdminCategory() {
		this.siteMenu.put(_SM_ADMIN_CATEGORY, true);
		return this;
	}
	public Boolean getSmAdminCategory(){
		return this.siteMenu.get(_SM_ADMIN_CATEGORY);
	}

	public Page setSmAdminBrand() {
		this.siteMenu.put(_SM_ADMIN_BRAND, true);
		return this;
	}
	public Boolean getSmAdminBrand(){
		return this.siteMenu.get(_SM_ADMIN_BRAND);
	}
	public Page setSmAdminUser() {
		this.siteMenu.put(_SM_ADMIN_USER, true);
		return this;
	}
	public Boolean getSmAdminUser(){
		return this.siteMenu.get(_SM_ADMIN_USER);
	}
	
	/** default Page factory
	 * 
	 * @return
	 */
	public static Page newPage(){
		return new Page();
	}
	
}
