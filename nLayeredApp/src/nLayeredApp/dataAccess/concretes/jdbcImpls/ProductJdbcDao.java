package nLayeredApp.dataAccess.concretes.jdbcImpls;

import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductJdbcDao implements ProductDao{

	@Override
	public void add(Product product) {
		//JDBC kodlarý
		System.out.println("JDBC ile eklendi.");
	}

	@Override
	public void update(Product product) {
		
		System.out.println("JDBC ile güncellendi.");
	}

	@Override
	public void delete(Product product) {
		
		System.out.println("JDBC ile silindi.");
	}

	@Override
	public void getAll() {
		// TODO Auto-generated method stub
		
	}

}
