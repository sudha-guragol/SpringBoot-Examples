package in.ashokit.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.bindings.Product;
import in.ashokit.repository.ProductRepository;
import in.ashokit.service.ProductService;
@Service
public class ProcuctServiceImpl implements ProductService {
@Autowired
	private ProductRepository prodRepo;
	@Override
	public Boolean saveProduct(Product product) {
Product isSaved = prodRepo.save(product);
		if(isSaved!=null && isSaved.getProductId()!=null)
		{
			return true;
		}
		return false;
	}

}
