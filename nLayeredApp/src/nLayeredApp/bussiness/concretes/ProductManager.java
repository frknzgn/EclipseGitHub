package nLayeredApp.bussiness.concretes;

import nLayeredApp.bussiness.abstracts.ProductService;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductManager implements ProductService {
	
	private ProductDao productDao;
	

	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		this.productDao.add(product);
		
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		this.productDao.update(product);
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		this.productDao.delete(product);
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		this.productDao.getAll();
	}	

}
