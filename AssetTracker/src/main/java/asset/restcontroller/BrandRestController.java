package asset.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import asset.domain.Brand;
import asset.service.AssetTrackerService;
import asset.web.ui.WebPage;

@RestController
@RequestMapping("/REST/Brand")  
public class BrandRestController {

	@Autowired
	AssetTrackerService assetTrackerService;
	
	@RequestMapping(value = "/all/page/{pageIndex}", method = RequestMethod.GET)  
	public Page<Brand> findAllBrand(@PathVariable Integer pageIndex) {  
		Pageable pageSpecification = new PageRequest(pageIndex, WebPage.RESULT_PER_PAGE, new Sort(Sort.Direction.ASC, "name"));
		
		return assetTrackerService.findAllBrand(pageSpecification); 
	 }  
}
