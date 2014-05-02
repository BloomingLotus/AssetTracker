package asset.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import asset.web.ui.Page;

@Controller
public class AdminHomeController {
	private Log log = LogFactory.getLog(this.getClass());
	
	@RequestMapping("/admin/dashboard")
	public String adminHome(Model model) {
		log.debug("Entering: /admin/dashboard");
		
		setupPage(model).setSmAdminDashboard();
		return "admin/adminDashboard";
	}
	
	@RequestMapping("/admin/category")
	public String adminCategoryHome(Model model) {
		log.debug("Entering: /admin/category");
		
		setupPage(model).setSmAdminCategory();
		return "admin/category";
	}
	
	@RequestMapping("/admin/brand")
	public String adminBrandHome(Model model) {
		log.debug("Entering: /admin/brand");
		
		setupPage(model).setSmAdminBrand();
		return "admin/brand";
	}
	
	@RequestMapping("/admin/user")
	public String adminUserHome(Model model) {
		log.debug("Entering: /admin/user");
		
		setupPage(model).setSmAdminUser();
		return "admin/user";
	}
	
	private Page setupPage(Model model) {
		Page page = Page.newPage().setAdminNav();
		model.addAttribute("page", page);
		return page;
	}
	
}
