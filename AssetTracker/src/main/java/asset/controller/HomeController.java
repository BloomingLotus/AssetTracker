package asset.controller;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import asset.web.ui.WebPage;

@Controller
public class HomeController {
	
	private Log log = LogFactory.getLog(this.getClass());
	
	@RequestMapping("/")
	public String index(Model model) {
		log.debug("Entering : /");
		
		setupPage(model).setSmDashboard();
		return "dashboard";
	}
	
	@RequestMapping("/reports")
	public String reports(Model model) {
		log.debug("Entering : /reports");
		
		setupPage(model).setSmReports();
		return "reports";
	}
	
	@RequestMapping("/assetModels")
	public String assetModels(Model model) {
		log.debug("Entering : /assetModels");
		
		setupPage(model).setSmAssetModels();
		return "assetModels";
	}
	
	@RequestMapping("/assets")
	public String assets(Model model) {
		log.debug("Entering : /assets");
		
		setupPage(model).setSmAssets();
		return "assets";
	}
	
	@RequestMapping("/checkoutAsset")
	public String checkoutAsset(Model model) {
		log.debug("Entering : /checkoutAsset");
		
		setupPage(model).setSmCheckoutAsset();
		return "checkoutAsset";
	}
	
	@RequestMapping("/returnAsset")
	public String returnAsset(Model model) {
		log.debug("Entering : /returnAsset");
		
		setupPage(model).setSmReturnAsset();
		return "returnAsset";
	}
	
	@RequestMapping("/inventory")
	public String inventory(Model model) {
		log.debug("Entering : /inventory");
		
		setupPage(model).setSmInventory();
		return "inventory";
	}
	
	@RequestMapping("/takeoutInventory")
	public String takeoutInventory(Model model) {
		log.debug("Entering : /takeoutinventory");
		
		setupPage(model).setSmTakeoutInventory();
		return "takeoutInventory";
	}
	
	@RequestMapping("/restockInventory")
	public String restockinventory(Model model) {
		log.debug("Entering : /restockInventory");
		
		
		setupPage(model).setSmRestockInventory();
		return "restockInventory";
	}
	
	private WebPage setupPage(Model model) {
		WebPage webPage = WebPage.newPage();
		model.addAttribute("webPage", webPage);
		return webPage;
	}
	
	

}
	
