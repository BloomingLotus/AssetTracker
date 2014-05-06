package asset.config.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import asset.domain.Brand;

public interface BrandRepository extends PagingAndSortingRepository<Brand, Long> {

	
}
