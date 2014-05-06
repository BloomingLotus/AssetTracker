package asset.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import asset.config.repository.BrandRepository;
import asset.domain.Brand;

@Component("assetTrackerService")
@Transactional
public class AssetTrackerSerivceJPA implements AssetTrackerService {

	@Autowired
	private BrandRepository brandRepository;
	
	@Override
	public Page<Brand> findAllBrand(Pageable pageable) {
		// TODO Auto-generated method stub
		return brandRepository.findAll(pageable);
	}

}
