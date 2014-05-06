package asset.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import asset.domain.Brand;


public interface AssetTrackerService {
	
	public Page<Brand> findAllBrand(Pageable pageable);

}
