package nLayeredApp.dataAccess.concretes.hiberNateImpls;

import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductHiberNateDao implements ProductDao {

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		System.out.println("HiberNate ile eklendi.");
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		System.out.println("HÝberNate ile güncellendi.");
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		System.out.println("HiberNate ile silindi.");
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

}
