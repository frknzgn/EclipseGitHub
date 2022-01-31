package nLayeredApp.dataAccess.concretes.ýnMemoryImpls;

import myArrayList.MyArrayList;
import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductInMemoryDao implements ProductDao {
	MyArrayList<Product> productArrayList = new MyArrayList<>();
	@Override
	public void add(Product entity) {
		// TODO Auto-generated method stub
		productArrayList.add(entity);
	}

	@Override
	public void update(Product entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Product entity) {
		// TODO Auto-generated method stub
		if(productArrayList.contains(entity)) {
			System.out.println("Deleted.");
		}else {
			System.out.println(productArrayList.contains(entity));
		}
	}
	 public ArrayList<Product> getAll() {
		 productArrayList.getAll();
	 }

}
